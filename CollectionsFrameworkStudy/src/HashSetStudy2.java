import java.util.*;

class HashSetStudy2 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(num);
        }
        System.out.println(set);
        // TreeSet으로 만들면 자동 정렬된다.
        List list = new LinkedList(set); // List 형변환
        Collections.sort(list);          // 정렬 해줌
        System.out.println(list);
    }
}

