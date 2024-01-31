import java.util.Arrays;
import java.util.Scanner;

public class Dice1_switch {

	static boolean[] isSelected;
	static int N;
	static int[] numbers;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 주사위 3번 던져서 나오는 모든 경우의 수
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		numbers = new int[N];

		int mode = s.nextInt();
		switch (mode) {
		case 1: // 중복순열
			dice1(0);
			break;
		case 2: // 순열 : 중복 관리
			isSelected = new boolean[7];
			dice2(0);
			break;
		case 3: // 조합
			dice3(0, 1);
			break;
		case 4:// 중복조합
			dice4(0, 1);
			break;
		}
	}

	// 순열 : 중복관리
	private static void dice2(int cnt) { // 주사위 던지기(cnt : 기존까지 던진 주사위 횟수)
		if (cnt == N) { // 기저조건
			System.out.println(Arrays.toString(numbers));
			return;
		}
		// 요도파트
		for (int i = 1; i <= 6; i++) { // 모든 주사위 눈의 수를 시도(i:주사위눈의수)
			if (isSelected[i])
				continue;
			numbers[cnt] = i;
			isSelected[i] = true;

			dice2(cnt + 1); // 다음 주사위 전지러 가기

			isSelected[i] = false;
		}
	}

	// 중복순열
	public static void dice1(int cnt) {
		if (cnt == N) {
			System.out.println(Arrays.toString(numbers));
		} else {
			for (int i = 0; i < 6; i++) {
				numbers[cnt] = i + 1;
				dice1(cnt + 1);
			}
		}
	}

	// 조합
	private static void dice4(int idx, int start) {
		if (idx == N) {
			System.out.println(Arrays.toString(numbers));
			return;
		}
		// 시작점부터 가능한 끝까지 선택하는 시도
		for (int i = start; i <= 6; i++) {
			numbers[idx] = i; // 선택한 수 저장
			dice4(idx + 1, i + 1); // 현재 선택한 수의 다음부터 선택하도록 시작점 주기!!!
		}
	}

	// 중복조합
	private static void dice3(int idx, int start) {
		if (idx == N) {
			System.out.println(Arrays.toString(numbers));
			return;
		}
		// 시작점부터 가능한 끝까지 선택하는 시도
		for (int i = start; i <= 6; i++) {
			numbers[idx] = i; // 선택한 수 저장
			dice3(idx + 1, i); // 현재 선택한 수의 다음부터 선택하도록 시작점 주기!!!
		}
	}
}
