/*
 * 프로그래머스 주식가격
 * 
 * 
 * 
 * 
 */

package programmers;

import java.util.Arrays;

public class Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1,2,3,2,3};
		int[] result = new int[prices.length];
		
		for(int i=0; i<prices.length; i++) {
			for(int j=i+1; j<prices.length;j++) {
				result[i]++;
				if(prices[j] < prices[i]) {
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(result));
	}

}
