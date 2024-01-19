package com.ssafy.day4.d_object;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        String str = "설명 : " + t;
        
        System.out.println(str);
        
        System.out.println(t);
    }
    @Override
    public String toString() {
        return "Test 객체";
    }
}