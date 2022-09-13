package CollectionsFrameworkStudy;

import java.util.*;

class HashSetStudy {
    public static void main(String[] args) {
        Object[] objArr = {"1",1,"2","2","3","3","4","4","4"};
        Set set = new HashSet();

        for(int i=0; i < objArr.length; i++) {
            set.add(objArr[i]);	// HashSet에 objArr의 요소들을 저장한다.
        }
        // HashSet에 저장된 요소들을 출력한다.
        System.out.println(set);

        // Iterator을 이용하여 요소들 출력
        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
