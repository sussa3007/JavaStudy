class TestData {
    String td = "How to Change?";
}
public class BasicPrameterStudy {
    public static void main(String[] args) {
        TestData me = new TestData();
        System.out.println(me.td);

        me.td = "Change me!!";
        System.out.println("Main val = "+me.td);

        funct(me);
        System.out.println("Method After val = "+me.td);
    }
    static void funct (TestData me){
        me.td = "Change success??";
        System.out.println(me.td);
    }
}





