import java.util.Arrays;
import java.util.Scanner;

public class Dice1_Recursion {

	static int N;
	static int[] dices;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 주사위 3번 던져서 나오는 모든 경우의 수
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		dices = new int[N];
		thro(0);
	}

	public static void thro(int idx) {
		if(idx == N) {
			System.out.println(Arrays.toString(dices));
		} else {
			for(int i=0; i<6; i++) {
				dices[idx] = i+1;
				thro(idx+1);
			}
		}
	}
}
