package practics.H0119;
class Calculator {
	private static String manuFacturer = "LG";

	private static int remainBattery;		

	static {
		manuFacturer = "Samsung";
	}
	{
		chargeBattery();
	}
	public Calculator() {
		chargeBattery();
	}
	int plus(int x, int y) {
		remainBattery--;
		return x+y;
	}
	void chargeBattery() {
		remainBattery += 50;
	}
	int getRemainBattery(){
		return remainBattery;
	}
	static void productIntro() {
		System.out.println(manuFacturer);
	}
}

public class Test12 {
	public static void main(String[] args) {

		Calculator.productIntro();

		Calculator cal = new Calculator();
		
		Calculator cal2 = new Calculator();
		
		for(int i=0; i<5; i++) {
			cal.plus(10, 5);
		}
		
		System.out.println(cal.getRemainBattery());
		System.out.println(cal2.getRemainBattery());

	}
}