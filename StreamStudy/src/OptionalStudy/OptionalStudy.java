package StreamStudy.src.OptionalStudy;

public class OptionalStudy {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        String insuranceName =
                memberService
                        .getMember("kevin1234")
                        .flatMap(Member::getCar)
                        .flatMap(Car::getInsurance)
                        .map(Insurance::getCompanyName)
                        .orElse("Not result");
        System.out.println(insuranceName);
    }
}