package algo0130;

public class Loop_Permu {

	static int N = 5;	// 1~5까지의 숫자
	static int R = 3;	// 뽑을 갯수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if(i==j) continue;
				for (int k = 0; k <= N; k++) {
					if(i==k || j==k) continue;
					//i,j,k
					System.out.printf("%d %d %d%n", i,j,k);
				}
			}
			
		}
	}

}
