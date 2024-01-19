package com.ssafy.day4.c_polymorphism;

class SuperClass {
    String x = "super";

    public void method() {
        System.out.println("super class method");
    }
    
    public void method2() {
    	System.out.println("super class method2");
    }
}

class SubClass extends SuperClass {
    String x = "sub";

    @Override
    public void method() {
        System.out.println("sub class method");
    }
}

public class MemberBindingTest {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println(subClass.x);
        subClass.method();
        subClass.method2();
        
        SuperClass superClass = subClass;
        System.out.println(superClass.x);
        superClass.method();
        System.out.println("++==++==++==");
        subClass.method2();
        superClass.method2();
        System.out.println("++==++==++==");
        SuperClass superClass2 = new SuperClass();
        System.out.println(superClass2.x);
        superClass2.method();
    }

}
