package EnumStudy;

enum Animal {
    CAT("Cat",4) ,
    DOG("Dog",4) ,
    COW("Cow",4) ,
    PIG("Pig",4) ,
    CAT1("Cat",4);
    private final String animal;
    private final int leg;

    Animal(String animal, int leg) {
        this.animal = animal;
        this.leg = leg;
    }
    public String getAnimal(){
        return animal;
    }
    public int getLeg(){
        return leg;
    }
}

public class Study {
    public static void main(String[] args) {

        Animal [] an = Animal.values(); // values() 메소드는 열거형 상수를 배열에 담아 반환한다.
        for (Animal i : an) // 상수의 값들을 차례대로 반환하여 출력한다.
            System.out.println(i.name() +" ="+ "  animal : "+i.getAnimal()+"  leg : "+i.getLeg());

        Animal a = Animal.valueOf("CAT");
        Animal b = Animal.valueOf("CAT1");
        System.out.println("a.equals(b) = " + a.equals(b));
//        System.out.println(a > b); // 비교 연산자는 사용 불가
        System.out.println("a.compareTo(b) = " + a.compareTo(b));


    }

}
