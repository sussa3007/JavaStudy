package CalculatorPrec;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class CalculatorFrame extends JFrame {
    protected JTextField inputSpace;

    protected String prev_operation = ""; // 값을 저장하는 변수
    private String prev = ""; // 직전 데이터 하나를 담을 변수
    private String text = ""; // 모든 데이터를 담을 변수

    public CalculatorFrame() {
        // 값출력 box와 버튼을 붙임 - 기본 레이아웃
        setLayout(null);
        //빈공간에 JTextField 생성
        inputSpace = new JTextField();
        //편집 불가
        inputSpace.setEditable(false);
        //배경 컬러
        inputSpace.setBackground(Color.white);
        //정렬위치
        inputSpace.setHorizontalAlignment(JTextField.CENTER);
        //글씨체
        inputSpace.setFont(new Font("Arial", Font.BOLD, 50));
        //위치 x 8 y 10 270x70
        inputSpace.setBounds(8, 10, 300, 70);

        //버튼 패널
        JPanel buttonPanel = new JPanel();
        //레이아웃 GridLayout 격자형 레이아웃
        //가로 세로 칸 , 좌우 상하 간격
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
        //위치 크기
        buttonPanel.setBounds(8, 90, 300, 250);

        //계산기 버튼 글씨 배열
        String button_names[] = {"1", "2", "3", "-", "+", "4", "5", "6", "÷", "×", "7", "8", "9", "0", "=", "C", "(", ")"};
        //버튼의 배열
        JButton button[] = new JButton[button_names.length];

        // 배열을 돌려서 버튼 생성
        for (int i = 0; i < button_names.length; i++) {
            button[i] = new JButton(button_names[i]);
            //폰트
            button[i].setFont(new Font("Arial", Font.BOLD, 20));
            //버튼 컬러
            if (button_names[i] == "C") {
                button[i].setBackground(Color.red);
            } else if (0 <= i && i <= 2 || 5 <= i && i <= 7 || 10 <= i && i <= 13) {
                //버튼의 텍스트는 문자열 -> length 값으로 조절
                button[i].setBackground(Color.black);
            } else {
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


        // 기본 틀
        setTitle("Calculator");
        setVisible(true);
        setSize(330, 400);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class PadActionListener implements ActionListener {

        void setText(String setText) { // inputSpace를 setText로 설정
            inputSpace.setText(setText);
        }

        String getText() { // inputSpace에 입력된 데이터 가져오기
            return inputSpace.getText();
        }

        @Override
        public void actionPerformed(ActionEvent e) { // 취소와 계산 요청 엑션
            String input = e.getActionCommand();

            // 입력 버튼 확인
            if (input.equals("C")) { //C 눌렀을때 텍스트 박스 초기화
                setText("");
                text = "";
            } else if (input.equals("=")) {
                String result = Double.toString(calculate(text));
                // 데이터를 계산 메소드에서 결과를 String로 바꿔 result에 담음
                setText("" + result);
                text = "";
            } else if (input.equals("+") || input.equals("-") || input.equals("×") || input.equals("÷")) {
                // 제일 앞의 숫자 음수 입력가능
                if (getText().equals("") && input.equals("-")) {
                    setText(getText() + input);
                } else if (!getText().equals("") && !prev.equals("+") && !prev.equals("-") && !prev.equals("×") && !prev.equals("÷"))
                    setText(getText() + input);
            } else if (input.equals("(") || input.equals(")")) {
                    if(!prev.equals("(")&&!prev.equals(")"))
                        setText(getText() + input);
            } else {
                setText(getText() + input);
            }
            prev = input;
            text= getText();
            System.out.println(prev);


        }

    }

    public double calculate(String text) { // 계산 메소드
        double result = 0;
        boolean isBracket = false;

        if(text.charAt(0)=='(') {
            isBracket=true;
        }
        ArrayList<String> sb = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        text = text.replace("(", " ( ");
        text = text.replace(")", " ) ");
        text = text.replace("+", " + ");
        text = text.replace("-", " - ");
        text= text .replace("÷", " / ");
        text = text.replace("×", " * ");
        String[] str = text.split(" ");

        System.out.println(Arrays.toString(str));

        return result;
    }

    public static void main(String[] args) {
        new CalculatorFrame();
    }
}
