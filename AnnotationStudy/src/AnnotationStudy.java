package AnnotationStudy.src;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

import static java.lang.annotation.ElementType.*;

class Big {
    void bigmethod () { }
}
class Small extends Big {
    @Override
    void bigmethod () {
    }
}
@Target({FIELD, TYPE, TYPE_USE})
@interface MyAnnotation{ }
@MyAnnotation // TYPE
class MyClass{
    @MyAnnotation // FIELD
    int i;

    @MyAnnotation // TYPE_USE
    MyClass my;
}

enum TestEnum {FIRST, SCEOND}
@Retention(RetentionPolicy.RUNTIME) // 해당 애너테이션을 실행 하는동안 읽으려면 RUNTIME으로 선언
@interface MyAnno{
    int a() default 1; // 변수 선언
    String b(); // 문자열 변수 선언
    String [] c(); // 배열 선언
    TestEnum d(); // 열거형 타입의 상수를 호출할수 있게 선언한다
//    String testPa(int i, int j);  애러, 매개변수를 선언할수 없다.
//    String testPa throws Exception; 애러, 예외를 선언할수 없다.
//    ArrayList<T> list(); 애러, 요소의 타입에 타입 매개변수를 사용할수 없다.
}
@MyAnno(b="B",c ={"A","B"}, d = TestEnum.FIRST  )// a의 값은 정의하지 않았다.
public class AnnotationStudy{
    public static void main(String[] args) {
        Class<AnnotationStudy> cla = AnnotationStudy.class;
        MyAnno an = cla.getAnnotation(MyAnno.class);

        System.out.println(an.a());
        System.out.println(an.b());
        System.out.println(Arrays.toString(an.c()));
        System.out.println(an.d());

        Annotation[] anArray = cla.getAnnotations(); // 애너테이션의 정의된 모든 정보를 배열로 가져온다.
        for (Annotation i : anArray)
            System.out.println(i);

    }
}

