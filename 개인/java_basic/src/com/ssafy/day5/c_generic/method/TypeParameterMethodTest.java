package com.ssafy.day5.c_generic.method;

public class TypeParameterMethodTest<T> {
    T some;

    public TypeParameterMethodTest(T some) {
        this.some = some;
    }

    public <P> void method1(P p) {
        System.out.printf("클래스 레벨의 T: %s%n", some.getClass().getSimpleName()); // 클래스명, 타입명 찍어보기
        System.out.printf("파라미터 레벨의 P: %s%n", p.getClass().getSimpleName());
    }

    public <P> P method2(P p) {
        System.out.printf("클래스 레벨의 T: %s%n", some.getClass().getSimpleName());
        System.out.printf("파라미터 레벨의 P: %s%n", p.getClass().getSimpleName());
        return p;
    }

    public static void main(String[] args) {
        // 객체 생성 시점 - 클래스에 선언된 타입 파라미터 T의 타입 결정
        TypeParameterMethodTest<String> tpmt = new TypeParameterMethodTest<>("Hello");
        // 메서드 호출 시점 - 메서드에 선언된 타입 파라미터 P의 타입 결정
        tpmt.method1(10); //Integer 클래스가 들어간다.
        tpmt.method1("Hello"); //Integer 클래스가 들어간다.
        tpmt.<Long>method2(20L);
    }
}
