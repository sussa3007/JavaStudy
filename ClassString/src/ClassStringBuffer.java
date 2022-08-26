public class ClassStringBuffer {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("abc");
        a.append("123");
        StringBuffer b = a.append("def"); // a의 문자열 뒤에 def를 추가한다.
        System.out.println(a); // 모든 append 메소드 실행후 지정된 값을 참조하여 반환
        System.out.println(b);

        StringBuffer c = new StringBuffer(); // "" 빈문자열로 선언가능
        StringBuffer d = new StringBuffer("abc");
        c.append("123");
        System.out.println(c.capacity()); // 문자열을 추가하더라도 기본길이 16을 가진다
        System.out.println(d.capacity()); // 인스턴스 생성시 추가한 문자열 길이 + 기본길이 16을 가진다
        System.out.println(d.length());

        StringBuffer t = new StringBuffer("123456");
        t.insert(3, "a");
        System.out.println(t);
        StringBuffer x = new StringBuffer("123456789");
        x.delete(4,6);
        x.deleteCharAt(1);
        System.out.println(x);
    }
}
