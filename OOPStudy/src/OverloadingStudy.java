class OverloadTest{
    public void print() {
        System.out.println("success");
    }

    void print(String a) {
        System.out.println("success");
        System.out.println(a);
    }

    String print(Integer a) {
        System.out.println("success");
        return a.toString();
    }

    String print(Integer a, Integer b) {
        System.out.println("success");
        return a.toString() + b.toString();
    }

}


public class OverloadingStudy {
    public static void main(String[] args) {
        OverloadTest ot = new OverloadTest();
        ot.print();
        ot.print("String a");
        System.out.println(ot.print(6));
        System.out.println(ot.print(7,6));
    }
}
