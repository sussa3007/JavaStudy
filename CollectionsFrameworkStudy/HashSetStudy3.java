package CollectionsFrameworkStudy;

import java.util.*;

class HashSetStudy3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person a = new Person("David",10);
        Person b = new Person("David",10);
        set.add(a);
        set.add(b);
        set.add("abc");
        set.add("abc");

        System.out.println("a.equals(b) = "+a.equals(b));
        System.out.println("a의 해시코드 = "+a.hashCode());
        System.out.println("b의 해시코드 = "+b.hashCode());
        System.out.println("HashSet = "+set);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name +":"+ age;
    }
    // equals 와 hashcode 메소드를 오버라이딩 해줘야 HashSet이 정상 작동함
    public boolean equals(Object obj) {
        if(!( obj instanceof Person)) return false;
        Person p = (Person) obj;
        return this.name.equals(p.name) && this.age==p.age;
        // Person의 인스턴스 변수를 사용하기 위해서는 형변환을 해줘야
    }
    public int hashCode() {
        return Objects.hash(name,age);
    }
}