import java.util.*;

class HashMapStudy3 {
    public static void main(String[] args) {
        String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };

        HashMap map = new HashMap();

        for(int i=0; i < data.length; i++) {
            if(map.containsKey(data[i])) { //data[i]값 map에 키값으 있는지 확인
                int value = (int)map.get(data[i]); // 있다면 data[i] 키의 값을 가져와 value에 저장
                map.put(data[i], value+1);  // 기존에 존재하는 키라면 기존 값을 1증가
            } else {
                map.put(data[i], 1);	    // 기존에 존재하지 않는 키는 값을 1로 저장
            }
        }

        Iterator it = map.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int value = (int)entry.getValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value );
        }
    } // main

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

        for(int i=0; i < bar.length; i++)
            bar[i] = ch;

        return new String(bar); // String(char[] chArr)

    }
}
