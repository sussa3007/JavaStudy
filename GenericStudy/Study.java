package GenericStudy;

import java.util.ArrayList;

interface Thisinfo { String info();}

class Animal implements Thisinfo { public String info(){return "This Animal";} }

class Cat extends Animal implements Thisinfo { public String info() {return "This Cat";} }

class Dog extends Animal implements Thisinfo { public String info() {return "This Dog";} }

class Cow extends Animal { }

class Person implements Thisinfo { public String info() {return "This Person";} }

class CageList<T extends Animal & Thisinfo> {
    ArrayList<T> list = new ArrayList<>();
    void setCage (T animal){
        list.add(animal); }
    T getCage(int index) {
        return list.get(index);
    }
    int cageSize(){
        return list.size();
    }
    T cageRemove(int index){
        return list.remove(index);
    }
}
class Tostr {
    static String str = "";
    static String listtoString(CageList<? extends Animal> list) {
        for (int i=0; i<list.cageSize(); i++){
           str += ", " + list.getCage(i).info();
        }
        str = str.substring(1);
        return str;
    }
}

public class Study {
    public static void main(String[] args) {
        CageList <Animal> list = new CageList<>();
        list.setCage(new Cat());
        list.setCage(new Dog());
        list.setCage(new Cow()); //부모 클래스가 인터페이스를 구현했기 때문에 저장가능하다.
//        list.setCage(new Person()); // 자식 클래스가 아니기때문에 에러발생.
//        CageList<Person> list1 = new CageList<Person>();

        for (Animal i : list.list) {
            System.out.println(i);
        }
        System.out.println(Tostr.listtoString(list));
    }
}
