package LambdaExpressionStudy.src.LambdaStudy;
@FunctionalInterface
interface MyFunction {
    void run();  // public abstract void run();
}

public class LambdaStudy {
    static void execute(MyFunction f) { // MyFunction 타입을 매개변수로 받는 메소드
        f.run();
    }

    static MyFunction getMyFunction() { // MyFunction 타입을 반환하는 메소드
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        MyFunction f1 = ()-> System.out.println("f1.run()"); // 람다식으로 MyFunction을 구현

        MyFunction f2 = new MyFunction() {  // 익명 클래스로 MyFunction을 구현
            public void run() {
                System.out.println("f2.run()");
            }
        };
        MyFunction f3 = getMyFunction(); // 메소드 내부에서 Myfunction을 람다식으로 구현

        f1.run();
        f2.run();
        f3.run();

        execute(f1); // MyFunction 타입의 참조변수를 매개변수로
        execute( ()-> System.out.println("run()") );
        // MyFunction 인터페이스를 구현한 람다식을 매개변수로
    }
}



