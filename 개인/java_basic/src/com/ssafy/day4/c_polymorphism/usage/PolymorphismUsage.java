package com.ssafy.day4.c_polymorphism.usage;

import com.ssafy.day3.a_inheritance.SpiderMan;
import com.ssafy.day3.a_inheritance.Person;

public class PolymorphismUsage {
    public void useObjectArray() {
        // TODO:Object []을 선언하고 다양한 객체를 저장하고 저장된 클래스 타입을 출력하세요.
    	Object [] objs = new Object[4];
    	objs[0] = "Hello";
    	objs[1] = objs;
    	objs[2] = new SpiderMan();
    	objs[3] = 3; // auto boxing
    	//objs[3] = Integer.valueOf(3);
    	
    	for(Object obj: objs) {
    		System.out.println(obj.getClass().getName());
    	}
        // END
    }

    public void useObjectParam() {
        System.out.println(1);
        System.out.println("Hello");
        System.out.println(new Person());
        System.out.println(new SpiderMan());
    }

    public static void main(String[] args) {
        PolymorphismUsage usage = new PolymorphismUsage();
        usage.useObjectArray();
        usage.useObjectParam();
    }
}
