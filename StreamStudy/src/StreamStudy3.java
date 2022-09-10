import java.io.File;
import java.util.stream.Stream;

public class StreamStudy3 {
    public static void main(String[] args) {
        File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
                new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
        };

        Stream<File> fileStream = Stream.of(fileArr);

        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println); // String 스트림으로 변경되어 요소 출력

        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.')!=-1) // '.'을 포함하고 있는 문자열만 추출
                .peek(s-> System.out.printf("Filename = %s%n",s))
                .map(s -> s.substring(s.indexOf('.')+1)) //'.'의 인덱스 +1 부터 자르기
                .map(String::toUpperCase)               // 대문자로 변경
                .distinct()                             // 중복 제거
                .forEach(System.out::print);

        System.out.println();
    }
}
