package CollectionsFrameworkStudy;

import java.util.*;

public class InterfaceList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add("1");


        ArrayList list2 = new ArrayList(list1.subList(1,4)); // 인덱스의 위치에 있는 값으로 새로운 객체 생성(1<= index <4)
        print(list1, list2);

        Collections.sort(list1); // 오름차순 배열 sort
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2):" // list2를 list1에 모두 포함하고 있는지 여부 확인
                + list1.containsAll(list2));

        list2.add("B"); // B와 C를 순차적으로 추가하고
        list2.add("C");
        list2.add(3, "A");  // A를 인덱스 3자리에 추가한다.
        print(list1, list2);

        list2.set(3, "AA"); // AA를 인덱스 3자리의 값 변
        print(list1, list2);


        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
        // list1을 list2와 중복되는 값으로만 변경한다.
        print(list1, list2);


        for(int i= list2.size()-1; i >= 0; i--) { // list2에서 list1과 같은 값이 있다면
            if(list1.contains(list2.get(i)))  // 뒤에서 부터 순차적으로 확인해보고 지운다.
                list2.remove(i);
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
} // class
