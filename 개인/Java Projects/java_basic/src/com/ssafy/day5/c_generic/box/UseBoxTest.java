package com.ssafy.day5.c_generic.box;

public class UseBoxTest {

    public static void main(String[] args) {
        useNormalBox();
        useGenericBox();
        useNumberBox();
    }

    private static void useNormalBox() {
        // TODO: NormalBox 타입의 객체를 생성하고 사용해보세요.
    	NormalBox nbox = new NormalBox();
    	nbox.setSome("Hello");
    	
    	Object some = nbox.getSome();
    	if(some instanceof String) {
    		String someStr = (String) some;
    		System.out.println("문자열 : " + someStr);
    	}
    	
        // END
    }

    private static void useGenericBox() {
        // TODO: GenericBox 타입의 객체를 생성하고 사용해보세요.
    	GenericBox<String> gbox = new GenericBox<>();
    	gbox.setSome("Hello Generic!");
    	
    	String some = gbox.getSome();
    	System.out.println(some);
    	
        // END
    }

    private static void useNumberBox() {
        // TODO: NumberBox 타입의 객체를 생성하고 사용해보세요.
    	NumberBox<Number> nbox = new NumberBox<>();
    	
    	nbox.addSomes(3.14, 5, 4L);
        // END
    }

}
