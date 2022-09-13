package CollectionsFrameworkStudy;

import java.util.*;

class TreeSetStudy2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to	= "d";

        set.add("flow");      set.add("Apple");    set.add("bat");
        set.add("cow");      set.add("Car");      set.add("disc");
        set.add("dark");    set.add("delete");    set.add("Black");
        set.add("elephant"); set.add("elevator"); set.add("green");
        set.add("flower");

        System.out.println(set);  // 자동 사전 정렬 순서대로(오름차순) 정렬된다.
        System.out.println("range search : from " + from  +" to "+ to);
        System.out.println("result1 : " + set.subSet(from, to)); // b 에서 d 사이의 요소를 찾는다 "d는 제외한다"
        System.out.println("result2 : " + set.subSet(from, to + "zzz"));// b 에서  d+zzz = "dzzz" 까지 찾는
    }
}