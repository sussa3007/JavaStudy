package LambdaStudy2;
import java.util.function.*;
import java.util.*;

public class LambdaStudy {
    public static void main(String[] args) {
        // Supplier 매개변수는 없고 반환값만 있다.
        Supplier<Integer> s = ()-> (int)(Math.random()*100)+1;
        // Consumer 매개변수만 있고 반환값은 없다.
        Consumer<Integer> c = i -> System.out.print(i+", ");
        // Predicate 조건식을 표현함, 매개변수는 하나로 반환값은 boolean 타입이다.
        Predicate<Integer> p = i -> i%2==0;
        // Function 하나의 매개변수를 받아 결과를 반환 <매개변수, 반환값>
        Function<Integer, Integer> f = i -> i/10*10;

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);
        printEvenNum(p, c, list);
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);
    }

    static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        List<T> newList = new ArrayList<T>(list.size());

        for(T i : list) {
            newList.add(f.apply(i));
        }

        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.print("[");
        for(T i : list) {
            if(p.test(i))
                c.accept(i);
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for(int i=0;i<10;i++) {
            list.add(s.get());
        }
    }
}
