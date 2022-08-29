import java.util.*;

class HashMapStudy2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 90);
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);

        Set set = map.entrySet(); // 데이타를 set타입으로 반환
        Iterator it = set.iterator(); // 데이타에 접근하기위한 이터레이터 정의

        while(it.hasNext()) { // 데이타 내부에 데이타가 더이상 없을때까지 true 반환
            Map.Entry e = (Map.Entry)it.next(); // 값을 순서대로 반환
            System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
            // 참조변수 e에 반환된 데이타의 키 값과 밸류 값을 출력
        }

        set = map.keySet(); // map변수에 저장된 데이타의 키값을 반환
        System.out.println("참가자 명단 : " + set);

        Collection values = map.values(); // 저장된 벨류 객체를 반환
        it = values.iterator(); //객체를 접근하기위한 이터레이터 정의

        int total = 0;

        while(it.hasNext()) {
            int i = (int)it.next();
            total += i;
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total/set.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));
    }
}
