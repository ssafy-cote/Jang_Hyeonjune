package practics;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int R = 3;   //행
		int C = 4;   //열
		int[][] arr = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
		};
		System.out.println("행우선");
		System.out.println("정방향");
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("역방향");
		for(int i=R-1; i>=0; i--) {
			for(int j=C-1; j>=0; j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("열우선");
		System.out.println("정방향");
		for(int i=0; i<C; i++) {
			for(int j=0; j<R; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("역방향");
		for(int i=C-1; i>=0; i--) {
			for(int j=R-1; j>=0; j--) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		System.out.println("지그재그");
		System.out.println("정방향");
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				if(i==1) {
					System.out.print(arr[i][C-j-1] + " ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("역방향");
		for(int i=R-1; i>=0; i--) {
			for(int j=C-1; j>=0; j--) {
				if(i==1) {
					System.out.print(arr[i][C-j-1] + " ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
