import java.util.*;

class HashMapStudy {
    public static void main(String[] args) {
      HashMap list = new HashMap();
      list.put("sussa" ,"1q2w");
      list.put("suyoung" ,"1a2s");
      list.put("pop123" ,"1q2w");
        System.out.println(list);
      list.put("sussa","1234"); // 키가 동일하고 값이 다르게 put되면 해당 키에 대한 값을 변경한다.
        System.out.println(list);

      Scanner in = new Scanner(System.in); // 하나의 라인 단위로 입력받음.


        while (true) { // 정상적으로 입력 될때까지 계속 반복해준
            System.out.println("ID 와 PW 를 입력하세요");
            System.out.print("Id : ");
            String id = in.nextLine().trim();
            if (!(list.containsKey(id))) {
                System.out.println("ID is Wrong!");
//                break;
                continue;
            }
            System.out.print("Pw : ");
            String pw = in.nextLine().trim();
            if (list.get(id).equals(pw)) {
                System.out.println("==============");
                System.out.println("Success Login");
                break; // 모두 일치하면 Stop
            } else {
                System.out.println("Password Wrong");
            } // 잘못된 비밀번호 입력하면 출력하고 재 입력

        }
    }
}
