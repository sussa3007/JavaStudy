package CollectionsFrameworkStudy;

import java.util.*;

class TreeSetStudy {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(num);  // set.add(new Integer(num));
        }
        // TreeSet의 기본 정령 기준은 오름차순이다.
        System.out.println(set);
    }
}