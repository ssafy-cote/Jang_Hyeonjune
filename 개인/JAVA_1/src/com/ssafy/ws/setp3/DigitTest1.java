package com.ssafy.ws.setp3;

public class DigitTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i=0; i<5; i++) {
//			for(int j=1; j<5-i+1; j++) {
//				System.out.print((i * 5 - i) + j + "\t");
//			}
//			System.out.println();
//		}
		int count = 1;
		for(int i=0; i<5; i++) {
			for(int k=0; k<i; k++)
				System.out.print("\t");
			for(int j=i; j<5; j++) {

				System.out.print(count + "\t");
				count++;
			}
			System.out.println();
		}

	}

}
