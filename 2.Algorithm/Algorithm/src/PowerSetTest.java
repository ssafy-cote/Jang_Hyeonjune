import java.util.Arrays;
import java.util.Scanner;

// N개의 원소를 입력받아 가능한 모든 부분집합 생성 후 목표합이 되는 경우 찾기
// 1<=N<=10
public class PowerSetTest {

	static int N, input[];
	static boolean isSelected[];
	static int target;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		N = s.nextInt();
		target = s.nextInt();
		input = new int[N];
		isSelected = new boolean[N];

		for (int i = 0; i < N; i++) {
			input[i] = s.nextInt();
		}

		generateSubSet(0, 0);
	}

	private static void generateSubSet(int cnt, int sum) { // sum : 기존 부분집합의 구성요소돌의 합
		// 기저조건
		if (cnt == N) { // 모든 원소가 고려 되었다면 부분집합을 구성하는 원소들의 합이 목표합이 되는지 체크
			if (sum == target) {
				for (int i = 0; i < N; i++) {
					if(isSelected[i])
						System.out.print(input[i] + "\t");
				}
				System.out.println();
			}
			return;
		}

		// 유도파트
		isSelected[cnt] = true; // 부분 집합에 포함
		generateSubSet(cnt + 1, sum + input[cnt]);
		isSelected[cnt] = false; // 부분 집합에 비포함
		generateSubSet(cnt + 1, sum);

	}
}
