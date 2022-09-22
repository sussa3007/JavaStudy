package StringifyJson;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class stringifyJSON {
    public static void main(String[] args) {
        Map<String, String> message = new HashMap<>(){{
            put("sender", "김코딩");
            put("receiver", "이자바");
            put("message", "안녕하세요?");
            put("createdAt", "2021-01-12,10:10:10");
        }};
        Map<String, Boolean> map = new HashMap<>(){{
            put("zoo", true);
            put("car", false);
            put("tee", null);
        }};
        stringifyJSON json = new stringifyJSON();
        System.out.println("null = "+json.stringify(null));
        System.out.println("true = "+json.stringify(true));
        System.out.println("String = "+json.stringify("Hello World"));
        System.out.println("Object[] = "+json.stringify(new Object[]{8, "hi",new Object[]{18, new Object[]{20}}}));
        System.out.println("Hashmap = "+json.stringify(message));
        System.out.println("Hashmap = "+json.stringify(map));
    }



    public String stringify(Object data) {
        //입력된 값이 문자열일 경우
        if(data instanceof String) return "\""+data+"\"";
        //입력된 값이 Integer일 경우
        if(data instanceof Integer) return String.valueOf(data);
        //입력된 값이 Boolean일 경우
        if(data instanceof Boolean) return String.valueOf(data);
        //입력된 값이 Object[]일 경우
        if(data instanceof Object[]) {
            if(((Object[]) data).length==0) return "[]";
            String str = modifyArr((Object[]) data);
            return "["+str+"]";
        }
        //입력된 값이 HashMap일 경우
        if(data instanceof HashMap) {
            String str=modifyMap((HashMap<?, ?>) data);
            return "{"+str+"}";
        }
        //지정되지 않은 타입의 경우에는 "null"을 리턴합니다.
        return "null";
    }
    private static String modifyMap(HashMap<?,?> data){
        HashMap<?,?> clone = new LinkedHashMap<>(data);
        // 기존 Hashmap 데이터 보전과 순서 유지를 위해 LinkedHashMap으로 복사
        stringifyJSON json = new stringifyJSON();
        if(clone.isEmpty()) return "";
        else if(clone.size()==1) {
            Object key = clone.keySet().toArray()[0];
            Object value = clone.get(key);

            return String.format("%s:%s",json.stringify(key),json.stringify(value));

        } else {
            Object key = clone.keySet().toArray()[0];
            Object value = clone.get(key);
            String result = String.format("%s:%s",json.stringify(key),json.stringify(value));
            clone.remove(key);

            return result+","+modifyMap(clone);

        }
    }
    private static String modifyArr(Object[] data){
        stringifyJSON json = new stringifyJSON();
        String result = "";
        for(Object o : data) result = result + json.stringify(o)+",";
        result = result.substring(0,result.length()-1);
        return result;
    }
}
