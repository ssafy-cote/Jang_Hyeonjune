package com.ssafy.ws.setp3;

public class DigitTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1;

		for (int i = 0; i < 10; i+=2) {
			if (i < 6 && i % 2 == 0) {
				for (int k = 0; k < i/2; k++)
					System.out.print("\t");
			} else {
				for (int k = i + 1; k/2 < 4; k++)
					System.out.print("\t");
			}
			if (i < 6) {
				for (int j = i; j < 5; j++) {
					System.out.print(count + "\t");
					count++;
				}
			} else if(i >= 6 && i % 2 == 0) {
				for (int j = i-2; j >= 2; j-=1) {
					System.out.print(count + "\t");
					count++;
				}
			}
			System.out.println();
		}
	}

}
