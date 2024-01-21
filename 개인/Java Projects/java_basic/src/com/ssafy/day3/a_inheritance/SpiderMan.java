package com.ssafy.day3.a_inheritance;

public class SpiderMan extends Person{
	boolean isSpider;
	final String bloodType;
	
	//has a 관계
	Spider spider;
	
	//생성자 오버로딩
	public SpiderMan() {
//		super(); // super() this()둘다 첫줄에 있어야해서 같이 있을수 X
		this("피터파커");
	}
	
	public SpiderMan(String name) {
		// 조상의 생성자 호출 - 코드 절감.
		super(name);
		this.spider = new Spider();
		
		// blank final
		// 무조건 생성자 안에서 값을 넣어야한다.
		bloodType = "O";
	}
	
	void fireWeb() {
		if(isSpider) {
			spider.fireWeb();
		} else {
			System.out.println("지금은 안됨.");			
		}
		
	}
	
	@Override
	void jump() {
		if(isSpider) {
			spider.jump();
		} else {
			super.jump();
		}
	}

	@Override
	public String toString() {
		return "SpiderMan [isSpider=" + isSpider + ", toString()=" + super.toString() + "]";
	}
	
	
}
