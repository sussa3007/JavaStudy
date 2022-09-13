package StreamStudy.src;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduceStudy  {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr).forEach(System.out::println);

        boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0); // 모든 요소가 일치 하지 않는지?
        Optional<String> sWord = Stream.of(strArr)
                .filter(s->s.charAt(0)=='s').findFirst(); // 문자열 첫번째 s가 오는 첫번째 요소 정의

        System.out.println("noEmptyStr="+noEmptyStr);
        System.out.println("sWord= "+sWord.get()); // noneMatch결과로 비어 있는 요소가 없으므로 get 메소드 사용

        sWord.ifPresent(i-> System.out.printf("sWord= %s%n",sWord.get()));
        // 비어있는지 없는지 확인 하고 출력 가능


        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
        // 요소 = 문자열의 길이
        int count = intStream1.reduce(0, (a,b) -> a + 1); //반환 타입 초기값과 같음
        int sum   = intStream2.reduce(0, (a,b) -> a + b);

        OptionalInt max = intStream3.reduce(Integer::max); // 요소중 최대값
        OptionalInt min = intStream4.reduce(Integer::min); // 요소중 최소값

        System.out.println("count="+count);
        System.out.println("sum="+sum);
        System.out.println("max="+ max.getAsInt());
        System.out.println("min="+ min.getAsInt());
    }
}
