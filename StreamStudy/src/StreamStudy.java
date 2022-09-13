package StreamStudy.src;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamStudy {
    public static void main(String[] args) {
        String [] arr =  {"aa","ab","AA","bb","cc","CC"};
        List<String> strList = Arrays.asList(arr);
        int [] arr2 = {2,6,3,5,7,2,6,8,10,12};
        IntStream intstream =Arrays.stream(arr2); // 기본형 스트림 생성
//        IntStream intStream1 = IntStream.of(arr2); 위코드와 같음
        intstream.filter(i->i%2==0).forEach(i->System.out.print(i+" "));
        System.out.println();

        intstream =Arrays.stream(arr2);
        intstream.distinct().filter(i->i%2==0).forEach(i->System.out.print(i+" "));
        System.out.println();
        Stream<String> streamarr = Arrays.stream(arr); // 스트림 생성
        Stream<String> streamarr1= strList.stream();  // 스트림 생성

        streamarr.sorted().forEach(System.out::print);
        System.out.println();
        streamarr1.sorted().forEach(System.out::print);
        System.out.println();



        IntStream intStream = new Random().ints(6,1,46);
        intStream.distinct().forEach(i->System.out.print(i+" "));
        System.out.println();
        IntStream intStream1 = new Random().ints(1,46);
//        intStream1.distinct().limit(6).sorted().forEach(i->System.out.print(i+" "));
        intStream1.distinct().limit(6).sorted().forEach(System.out::print);
        System.out.println();



//        // iterate(T seed, UnaryOperator f) 단항연산자
//        Stream<Integer> intStream3 = Stream.iterate(0, n->n+2);
//        // 짝수 무한스트림.
//
//
//        // generate(Supplier s)  입력 x 출력 o
//        Stream<Integer> intStream4 = Stream.generate(()->5);
//        // 5 만 출력하는 무한스트림.
//
//
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0;i<10;i++)
//            list.add(i);
//
//        list.forEach(i->System.out.print(i+","));
//        System.out.println();
//
//        list.removeIf(x-> x%2==0 || x%3==0);
//        System.out.println(list);
//
//        list.replaceAll(i->i*10);
//        System.out.println(list);
//
//        Map<String, String> map = new HashMap<>();
//        map.put("1", "1");
//        map.put("2", "2");
//        map.put("3", "3");
//        map.put("4", "4");
//
//        map.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));
//        System.out.println();
//

    }
}
