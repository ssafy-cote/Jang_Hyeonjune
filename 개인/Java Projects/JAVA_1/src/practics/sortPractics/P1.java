package practics.sortPractics;

import java.util.Arrays;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double 형 배열을 오름차순으로 정렬한 뒤, 출력해보세요.
		double[] doubles = {-0.5, 2.10, 30.11, -10.22, 13.44};
		
		Arrays.sort(doubles);
		System.out.println(Arrays.toString(doubles));
	}

}
