// 참조 https://code-review.tistory.com/84#recentComments

// 예
// 첫자리 숫자 음수는 계산되지 않고
// 연산자의 연속 입력 가능
// 곱샘 나누샘의 우선순위 부재
package A1_materializeShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator extends JFrame {
    private JTextField inputSpace;
    private String num = ""; // 입력된 계산식을 담는 변
    private String prev_operation = ""; // 입력된 값을 저장하는 변수
    private ArrayList<String> equation = new ArrayList<String>() ;

    public Calculator() {
        // 값출력 box와 버튼을 붙임 - 기본 레이아웃 사
        setLayout(null);
        //빈공간에 JTextField 생
        inputSpace = new JTextField();
        //편집 불가
        inputSpace.setEditable(false);
        //배경 색
        inputSpace.setBackground(Color.white);
        //정렬위치
        inputSpace.setHorizontalAlignment(JTextField.CENTER);
        //글씨체
        inputSpace.setFont(new Font("Arial",Font.BOLD, 50));
        //위치 x 8 y 10 270x70
        inputSpace.setBounds(8,10,280,70);

        //버튼 패널
        JPanel buttonPanel = new JPanel();
        //레이아웃 GridLayout 격자형 레이아웃
        //가로 세로 칸 , 좌우 상하 간격
        buttonPanel.setLayout(new GridLayout(4,4,10,10));
        //위치 크기
        buttonPanel.setBounds(8,90,270,235);

        //계산기 버튼 글씨 배열
        String button_names[] = { "C", "÷", "×", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "0" };
        //버튼의 배열
        JButton button[] = new JButton[button_names.length];

        // 배열을 돌려서 버튼 생성
        for(int i = 0; i < button_names.length; i++) {
            button[i] = new JButton(button_names[i]);
            //폰트
            button[i].setFont(new Font("Arial",Font.BOLD, 20));
            //버튼 컬러
            if (button_names[i]== "C") {
                button[i].setBackground(Color.red);
            } else if (i >= 4 && i<=6 || i>=8 && i<=10 || i >=12 && i <=15) {
                 //버튼의 텍스트는 문자열 -> length 값으로 조절
                button[i].setBackground(Color.black);
            }
            else {
                button[i].setBackground(Color.gray);
            }
            //글자색
            button[i].setForeground(Color.white);
            //테두리
            button[i].setBorderPainted(false);
            //버튼 액션
            button[i].addActionListener(new PadActionListener());
            //버튼 버튼 패널에 추가
            buttonPanel.add(button[i]);

        }

        add(inputSpace);
        add(buttonPanel);


        //기본 틀 구현
        setTitle("Calculator");
        setVisible(true);
        setSize(300,400);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // 지우기와 결과값 출력 기능
    class PadActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //어떤 버튼을 눌렀는지 추적
            String operation = e.getActionCommand();

            //C 가 눌러지면 삭제
            if(operation.equals("C")) {
                inputSpace.setText("");
            }// = 눌렀을때 계산값 출력
            else if (operation.equals("=")){
                String result = Double.toString(calculate(inputSpace.getText()));
                // inputSpace 에서 가져온 데이타를 calculate에서 계산을 하여 Double을 String로 바꿔 result에 담는다
                inputSpace.setText(""+result); // 결과를 출력하고
                num=""; // ArrayList는 초기화를 한
            }
            else if (operation.equals("+")||operation.equals("-")||operation.equals("×")||operation.equals("÷")) {
                if (inputSpace.getText().equals("")&&operation.equals("-")) { // 앞자리 숫자가 음수일때 입력가능
                    inputSpace.setText(inputSpace.getText() + e.getActionCommand());
                } else if (!inputSpace.getText().equals("")&&!prev_operation.equals("+")&&!prev_operation.equals("-")&&!prev_operation.equals("×")&&!prev_operation.equals("÷"))
                    inputSpace.setText(inputSpace.getText() + e.getActionCommand());
                // 계산식이 비어있지 않고 연산자를 중복으로 입력하지 않았을 시에 입력 가능
            } else {// 다른 숫자들을 출력해줌
                inputSpace.setText(inputSpace.getText() + e.getActionCommand());
            }
            prev_operation = e.getActionCommand();
        }
    }
    //텍스트 파싱 후 출력 기능
    private void fullTextParsing(String inputText){
        equation.clear();

        //입력된 글자하나하나를 거쳐가게 함
        for(int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            if(ch == '-' || ch == '+' || ch == '×' || ch == '÷'){
                // 연산기호를 만나면 앞은 숫자
                //숫를 ArrayList 에 추가
                equation.add(num);
                num=""; // num 초기화자
                equation.add(ch + ""); // 연산기호를 ArrayList에 추가
                //34+3 을 입력했을때 num="" -> num="3" -> num="34" -> 연산기호 + -> num=""(초기화)

            } else {
                num = num + ch;
            }
        }
        equation.add(num); // 반복문이 끝나고의 num 값도 ArrayList 추가 34+3 에서 마지막 num="3"
        equation.remove(""); // 연산자가 있을시에 num을 ArrayList에 추가하게 되는데 이때 처음에 -가 있으면 ""가 추가되어 에러발생 처리
    }

    //계산기능
    public double calculate(String inputText) {
        fullTextParsing(inputText);
        //앞의 num 값을 가져옴

        double prev = 0;
        double current = 0;
        String mode = "";

        //+일경우 add, -일경우 sub, x일경우 mul, /일경우 div
        for (int i = 0; i < equation.size(); i++) {
            String s = equation.get(i);
            if (s.equals("+")) {
                mode = "add";
            } else if (s.equals("-")) {
                mode = "sub";
            } else if (s.equals("×")) {
                mode = "mul";
            } else if (s.equals("÷")) {
                mode = "div";
            } else {
                if ((mode.equals("mul") || mode.equals("mul") && !s.equals("+") && !s.equals("-") && !s.equals("×") && !s.equals("÷"))) {
                    Double one = Double.parseDouble(equation.get(i - 2));
                    Double two = Double.parseDouble(equation.get(i));
                    Double result = 0.0;

                    if (mode.equals("mul")) {
                        result = one * two;
                    } else if (mode.equals("div")) {
                        result = one / two;
                    }
                    equation.add(i + 1, Double.toString(result));
                    for (int j = 0; j < 3; j++) {
                        equation.remove(i - 2);

                    }
                    i -= 2;
                }
            }
        }
            for(String s : equation){
                if (s.equals("+")) {
                    mode = "add";
                } else if (s.equals("-")) {
                    mode = "sub";
                }
                // 연산기호 외 숫자들을 Double로 형 변환
                    else {current = Double.parseDouble(s);
                            if (mode.equals("add")) {
                                prev += current;
                            } else if (mode.equals("sub")) {
                                prev -= current;
                            }  else {
                                prev = current;
                            }
                    }
                prev = Math.round(prev * 10000) / 10000.0;
                //소숫점 4자리 이후 반올림
                }
                return prev; //계산값 반환
            }
    public static void main(String[] args) {
       new Calculator();
    }
}
