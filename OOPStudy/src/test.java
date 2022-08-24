class Parentstest {
    void t1 () {
        System.out.println("Parents");
    }
}
class Childtest extends Parentstest {
    void t2 () {
        System.out.println("test1");
    }
}
class Childtest2 extends Parentstest {
    void t3 () {
        System.out.println("test2");
    }
}

public class test {
    public static void main(String[] args) {
        Parentstest a = new Parentstest();
         if (a instanceof Childtest) {
            Childtest b = (Childtest) a;
            b.t2();
        } else {
            System.out.println("Error!");
        }

        Childtest c = new Childtest();
        if (c instanceof Parentstest) {
            Parentstest x = (Parentstest) c;
            x.t1();
        } else {
            System.out.println("Error!");
        }

        Parentstest t = (Parentstest) c;
        if (t instanceof Childtest2) {
            Childtest2 d = (Childtest2) t;
        } else {
            System.out.println("Error!");
        }
    }
}