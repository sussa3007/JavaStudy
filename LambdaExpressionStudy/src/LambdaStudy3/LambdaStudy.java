package LambdaStudy3;

import java.util.function.*;

public class LambdaStudy {
    public LambdaStudy() {}
    public LambdaStudy(Integer integer) {
    }

    public static <Stirng> void main(String[] args) {
                                                // 16 진수로 변환
        Function<String, Integer> f  = (s) -> Integer.parseInt(s, 16);
                                                // 2 진수로 변환
        Function<Integer, String>	g  = (i) -> Integer.toBinaryString(i);
        Function<String, String>    h  = f.andThen(g); // f 를 먼저 적용 다음 g 적용
        Function<Integer, Integer>  h2 = f.compose(g);

        System.out.println(h.apply("FF"));
        System.out.println(h2.apply(2));

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i%2 == 0;
        Predicate<Integer> notP = p.negate(); //i>=100 !와 같다
        Predicate<Integer> all = notP.and(q.or(r)); // !조건p && 조건q || 조건r 와 같다
        System.out.println(all.test(149));

        String str1 = "abc";
        String str2 = "abc";
        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean result = p2.test(str2);
//        boolean result = Predicate.isEqual(str1).test(str2); 위 코드 2줄과 같다
        System.out.println(result);

        Function<Integer, String> x = Integer::toBinaryString;
        LambdaStudy test = new LambdaStudy();
//        Function<String , Boolean> func = (st)-> test.equals(st);
//        Function<String , Boolean> func = test::equals;
        Supplier<LambdaStudy> func3 = () -> new LambdaStudy();
        Supplier<LambdaStudy> func2 = LambdaStudy::new;

        Function<Integer, LambdaStudy> func = (i) -> new LambdaStudy();
        Function<Integer, LambdaStudy> func1 = LambdaStudy::new;

        Function<Integer, LambdaStudy[] > funcArr = (i) -> new LambdaStudy[i];
        Function<Integer, LambdaStudy[] > funcArray = LambdaStudy[]::new;





    }


}