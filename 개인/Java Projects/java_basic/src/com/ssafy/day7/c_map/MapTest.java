package com.ssafy.day7.c_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
    Map<String, String> hMap = new HashMap<>();

    private void addMethod() {
        System.out.println("추가 성공?: " + hMap.put("andy", "1234"));
        // 동일한 키의 사용 결과는?
        System.out.println("추가 성공?: " + hMap.put("andy", "4567")); // 수정이된다.
        hMap.put("kate", "9999");
        // 기존에 해당 키에 대한 값이 없을 때만 추가하기
        hMap.putIfAbsent("kate", "1234");

        hMap.put("henry", "4567"); // 동일한 값

        hMap.put("hong", "1234");
        System.out.println("추가 결과: " + hMap);
    }

    private void retrieveMethod() {
        // TODO: kate의 전화번호가 있나요?
    	System.out.println(hMap.get("kate"));
    	System.out.println(hMap.containsKey("kate"));
        // END

        // TODO: map이 가지고 있는 key와 거기에 연결된 value를 출력하시오.
    	System.out.println("key");
    	Set<String> keys = hMap.keySet();
    	for(String key: keys) {
    		System.out.println("key : " + key + ", value : " + hMap.get(key));
    	}
    	System.out.println("Entry");
    	Set<Entry<String, String>> entries = hMap.entrySet();
    	for(Entry<String, String> entry: entries) {
    		System.out.println(entry.getKey() + " : " + entry.getValue());
    	}
        // END

        // TODO: 값이 4567인 사람의 이름은?
    	Set<Entry<String, String>> entries2 = hMap.entrySet();
    	for(Entry<String, String> entry : entries2) {
    		System.out.println(entry.getKey() + " : " + entry.getValue());
    		if(entry.getValue().equals("4567")) {
    			System.out.println("발견 : " + entry.getKey());
    		}
    	}
        // END
    }

    private void removeMethod() {
        // TODO: andy의 자료를 삭제하고 출력하시오.
    	hMap.remove("andy");
    	System.out.println("삭제 후: " + hMap);
    	hMap.clear();
    	System.out.println("초기화 후 : "  + hMap);
        // END
    }

    public static void main(String[] args) {
        MapTest hmt = new MapTest();
        hmt.addMethod();
        hmt.retrieveMethod();
        hmt.removeMethod();
    }
}
