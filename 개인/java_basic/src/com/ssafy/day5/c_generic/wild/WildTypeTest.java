package com.ssafy.day5.c_generic.wild;

public class WildTypeTest {
    @SuppressWarnings("unused")
    public void wildCardTest() {
        PersonBox<Object> pObj = new PersonBox<>();
        PersonBox<Person> pPer = new PersonBox<>();
        PersonBox<SpiderMan> pSpi = new PersonBox<>();

//        PersonBox<Object> pll = pPer; // Object의 하위 객체인 Person을 받을수 없다.
        
        // 어떤 타입이 오던지 다 받아줄 수 있다.
        PersonBox<?> pAll = pPer;
        pAll = pSpi;
        pAll = pObj;

        // Person 또는 상속받은 경우만 받아줄 수 있다.
        PersonBox<? extends Person> pChildPer = pPer;
        pChildPer = pSpi;
//         pChildPer = pObj; // Person을 상속 받는 SpiderMan만! Object X

        // Person 또는 조상만 받아줄 수 있다.
        PersonBox<? super Person> pSuperPer = pPer;
//        pSuperPer = pSpi;	// Person과 조상 객체만
        pSuperPer = pObj;
    }
}

class Person {
}

class SpiderMan extends Person {
}

class PersonBox<T> {
}
