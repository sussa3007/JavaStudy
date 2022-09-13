package StreamStudy.src;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamStudy2 {
          public static void main(String[] args) {
            Stream<Student> studentStream = Stream.of(
                    new Student("Lee", 3, 300),
                    new Student("Park", 1, 200),
                    new Student("Yu", 2, 100),
                    new Student("Kim", 2, 150),
                    new Student("Park2", 1, 200),
                    new Student("Kim2", 3, 290),
                    new Student("Lee2", 3, 180)
            );

            studentStream.sorted(Comparator.comparing(Student::getBan)
                         .thenComparing(Comparator.naturalOrder()))
                    // 반별 기본 정렬 기준으로 정렬 후에 Student 클래스의 기본 정렬 기준으로 다시 정렬
                         .forEach(System.out::println);
        }
    }

    class Student implements Comparable<Student> {
        String name;
        int ban;
        int totalScore;
        Student(String name, int ban, int totalScore) {
            this.name =name;
            this.ban =ban;
            this.totalScore =totalScore;
        }

        public String toString() {
            return String.format("[%s, %d, %d]", name, ban, totalScore);
        }

        String getName()     { return name;}
        int getBan()         { return ban;}
        int getTotalScore()  { return totalScore;}

        public int compareTo(Student s) { return s.totalScore - this.totalScore; }
        // Student 클래스의 Comparable을 구현함
        // totalScore 내림차순 정렬
    }
