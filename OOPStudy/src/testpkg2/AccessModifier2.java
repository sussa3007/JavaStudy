package testpkg2;
import testpkg1.*;

class OneChild extends testpkg1.AccessModifier {
    public void print() {
        System.out.println(pub);
//        System.out.println(pri); private Error
        System.out.println(pro);
//        System.out.println(def); default Error
    }
    void check () {
        super.print();
//        super.bye(); private Error
        super.hello();
//        super bye2(); default Error
    }

}
public class AccessModifier2 {
    public static void main(String[] args) {
        AccessModifier at2 = new AccessModifier();
        System.out.println(at2.pub);
//        System.out.println(at2.pri); private Error
//        System.out.println(at2.pro); protected Error
//        System.out.println(at2.def); default Error
        at2.print();
//        at2.bye();  private Error
//        at2.hello(); protected Error
//        at2.bye2(); default Error
    }
}
