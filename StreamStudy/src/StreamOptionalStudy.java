import java.util.Optional;
import java.util.OptionalInt;

public class StreamOptionalStudy {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
        System.out.println("optStr="+optStr.get()); // 값을 가져올떄  get를 쓴다.
        System.out.println("optInt="+optInt.get());

        int result1 = Optional.of("123")
                .filter(x->x.length() >0)
                .map(Integer::parseInt).get(); //get을 사용하게 되면 값이 null 일때 예외가 발생한다.

        int result2 = Optional.of("")
                .filter(x->x.length() >0) // 길이가 0이기 때문에 false가 되며 필터에 걸러진다.
                .map(Integer::parseInt).orElse(-1); // 요소가 없을때 -1을 반환

        System.out.println("result1="+result1);
        System.out.println("result2="+result2);

        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x->System.out.printf("result3=%d%n",x)); // null 이면 아무일도 일어나지 않음.
                                                                    // null이 아닐때 매개변수 수행

        OptionalInt optInt1  = OptionalInt.of(0); // 0을 값으로 정의
        OptionalInt optInt2  = OptionalInt.empty();    // 메소드로 빈 객체 선언 기본값 0이 될것이다.

        System.out.println(optInt1.isPresent()); // true
        System.out.println(optInt2.isPresent()); // false 값이 없다.

        System.out.println(optInt1.getAsInt()); // 요소로 0을 가지고 있다.
//		System.out.println(optInt2.getAsInt()); // NoSuchElementException
        System.out.println("optInt1="+optInt1);
        System.out.println("optInt2="+optInt2);
        System.out.println("optInt1.equals(optInt2)?"+optInt1.equals(optInt2));

        Optional<Object> opt  = Optional.empty();    // 메소드로 빈 객체 선언
        Optional<Object> opt1  = Optional.ofNullable(null);    // null 값을 직접 정의
        System.out.println("opt.equals(opt3) = "+opt.equals(opt1)); // 비어 있는것과 동일하다.
    }
}
