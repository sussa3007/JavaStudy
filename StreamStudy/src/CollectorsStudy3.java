import java.util.ArrayList;
import java.util.*;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class CollectorsStudy3 {
    public static void main(String[] args) {
        Student4[] stuArr = {
                new Student4("이철수", true, 1, 1, 300),
                new Student4("이자바", false, 1, 1, 250),
                new Student4("문코딩", false, 1, 2, 150),
                new Student4("나자바", true, 1, 2, 100),
                new Student4("김현수", true, 1, 1, 200),
                new Student4("김트림", false, 1, 2, 50),
                new Student4("안현수", false, 1, 3, 100),
                new Student4("홍철수", false, 1, 3, 150),
                new Student4("황코딩", true, 1, 3, 200),
                new Student4("강자바", true, 2, 1, 300),
                new Student4("강노드", false, 2, 1, 250),
                new Student4("최코딩", true, 2, 1, 200),
                new Student4("나노드", false, 2, 2, 150),
                new Student4("문영희", true, 2, 2, 100),
                new Student4("고영희", false, 2, 2, 50),
                new Student4("강아지", false, 2, 3, 100),
                new Student4("이부트", false, 2, 3, 150),
                new Student4("최철기", true, 2, 3, 200)
        };
        // 성별로 그룹화
        System.out.println("1. 성별 구분");
        Map<Boolean, List<Student4>> stuMale = Stream.of(stuArr).collect(groupingBy(Student4::isMale));
        List<Student4> male = stuMale.get(true); // 남자 List
        List<Student4> female = stuMale.get(false); // 여자 List
        for(Student4 s : male) System.out.println(s);
        for(Student4 s : female) System.out.println(s);
        System.out.println();

        System.out.println("2. 성별 수");
        Map<Boolean, Long> stuMaleNum = Stream.of(stuArr)
                .collect(groupingBy(Student4::isMale,counting())); // 성별로 나누어 카운팅
        System.out.println("남자 : "+stuMaleNum.get(true));
        System.out.println("여자 : "+stuMaleNum.get(false));
        System.out.println();

        System.out.println("3. 반별로 나누기");
        Map<Integer, List<Student4>> stuBan = Stream.of(stuArr)
                .collect(groupingBy(Student4::getBan)); // 반별로 나눔
        List<Integer> b = new ArrayList<>(stuBan.keySet()); // 반만 따로 배열로 만들어서
        for (Integer ban : b){
            System.out.println("[ "+ban+" 반 ]"); // 반별로 한번씩 출력
            for(Student4 a : stuBan.get(ban)){
                System.out.println(a);
            }
        }
        System.out.println();

        System.out.println("4. 학년별 반별 나누기");
        Map<Integer, Map<Integer,List<Student4>>> stuHakBan = Stream.of(stuArr)
                .collect(groupingBy(Student4::getHak,groupingBy(Student4::getBan)));
                        // 학년별 나눈뒤 학년에서 반별로 나눔
        for (Map<Integer,List<Student4>> hak : stuHakBan.values()){ // 학년을 반복
                for (List<Student4> ban : hak.values()){ // 반을 반복
                    for (Student4 a : ban){ // 반의 요소를 반복 출력
                        System.out.println(a);
                    }
                }
        }
        System.out.println();

        System.out.println("5. 성별 최대 점수");
        Map<Boolean,Student4> stuMaleScore = Stream.of(stuArr)
                .collect(groupingBy(Student4::isMale,
                        collectingAndThen( // Optional 의 값만 저장
                                maxBy(comparingInt(Student4::getScore)),Optional::get)));
                                // maxBy는 Optional 객체를 반환 하므로 값을 꺼내 반환
        System.out.println("남자 1등 = "+ stuMaleScore.get(true));
        System.out.println("여자 1등 = "+ stuMaleScore.get(false));

    }
}
class Student4 {
    String name;
    boolean isMale; //성별
    int hak;        // 학년
    int ban;        // 반
    int score;

    Student4(String name, boolean isMale, int hak, int ban, int score) {
        this.name	= name;
        this.isMale	= isMale;
        this.hak	= hak;
        this.ban	= ban;
        this.score  = score;
    }
    String	getName()    { return name;	}
    boolean  isMale()     { return isMale;	}
    int      getHak()     { return hak;	}
    int      getBan()     { return ban;	}
    int      getScore()   { return score;	}

    public String toString() {
        return String.format("[%s, %s, %d학년 %d반, %3d 점]",
                name, isMale ? "남":"여", hak, ban, score);
    }
}
