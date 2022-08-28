import java.util.*;

class QueueEx {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5; // 최대 명령어를 5개만 저장

    public static void main(String[] args) {
        System.out.println("help는 도움.");

        while(true) {
            System.out.print(">>");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim(); // 양쪽 공백을 제거하고 저장

                if("".equals(input)) continue; // 빈문자열이면 while문 시작으로

                if(input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if(input.equalsIgnoreCase("help")) {// 대소문자 구분 x
                    System.out.println(" help - 도움말.");
                    System.out.println(" q 또는 Q - 종료.");
                    System.out.println(" history - 명령어를 "
                            + MAX_SIZE +"개 보여줍니다");
                } else if(input.equalsIgnoreCase("history")) {
                    save(input);
                    LinkedList tmp = (LinkedList)q;
                    final int SIZE = tmp.size(); // size는 변하지 않는 상수
                    for(int i = 0; i<SIZE; i++)
                        System.out.println((i+1)+"."+ tmp.get(i));

                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch(Exception e) {
                System.out.println("입력 에러");
            }
        } // while(true)
    } //  main()
    public static void save(String input) {

        if(!"".equals(input))
            q.offer(input); // 빈문자열 저장 안됨


        if(q.size() > MAX_SIZE)
            q.remove();  // 최대 저장 개수 넘어가면 처음 입력 삭제 poll을 사용해도됨
    }
} // end of class