import java.util.*;

public class GenericStudy2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        Iterator it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());

        HashMap<String,Info> inputmem = new HashMap<>();
        inputmem.put("Bob",new Info("abcd","1234","Busan","01012345678"));
        inputmem.put("John",new Info("aaaa","1111","Souel","01088888888"));
        System.out.println(inputmem.get("Bob"));
        Info bob = inputmem.get("Bob");
        System.out.println(bob.phone);

    }
}
class Member {
    // 정보를 받아 inputmem에 집어넣는다 회원가입
    // 관리자가 회원 정보를 관리할수 있다.



}
class Info {
    String id ="";
    String pw ="";
    String address ="";
    String phone;
    Info (String id,String pw,String address,String phone ){
        this.id = id;
        this.pw = pw;
        this.address = address;
        this.phone = phone;
    }




}
