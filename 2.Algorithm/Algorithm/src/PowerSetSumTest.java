import java.util.Arrays;
import java.util.Scanner;

// N개의 원소를 입력받아 가능한 모든 부분집합 생성
// 1<=N<=10
public class PowerSetSumTest {

	static int N, input[];
	static boolean isSelected[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		N = s.nextInt();
		input = new int[N];
		isSelected = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			input[i] = s.nextInt();
		}
		
		generateSubSet(0);
	}

	private static void generateSubSet(int cnt) {
		//기저조건
		if(cnt == N) { // 모든 원소가 고려 되었다면
			for (int i = 0; i < N; i++) {
				System.out.print((isSelected[i]?input[i]:"X") + "\t");
				
			}
			System.out.println();
			return;
		}
		
		//유도파트
		isSelected[cnt] = true;		// 부분 집합에 포함
		generateSubSet(cnt+1);
		isSelected[cnt] = false;	// 부분 집합에 비포함
		generateSubSet(cnt+1);
		
	}
}
