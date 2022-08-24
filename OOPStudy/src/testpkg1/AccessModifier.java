package testpkg1;

public class AccessModifier {
    // public, private, protected, default
    public    int pub;
    private   int pri;
    protected int pro;
              int def;

    public void print() {
        System.out.println(pub);
        System.out.println(pri);
        System.out.println(pro);
        System.out.println(def);
    }
    private void bye() {
        System.out.println("BYE,");
    }
    protected void hello() {
        System.out.println("Hello,");
    }
    void bye2() {
        System.out.println("Good Bye,");
    }
}

class Access {
    public static void main(String[] args) {
        AccessModifier at = new AccessModifier();
        System.out.println(at.pub);
//        System.out.println(at.pri); // private Error
        System.out.println(at.pro);
        System.out.println(at.def);
        at.print(); // public
//        at.bye(); // private // Error
        at.hello(); // protected
        at.bye2(); // default

    }
}