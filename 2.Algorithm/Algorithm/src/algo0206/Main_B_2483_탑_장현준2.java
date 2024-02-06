package algo0206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main_B_2483_탑_장현준2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// 0:번호, 1:높이
		Deque<int[]> stack = new ArrayDeque<>();

		StringTokenizer st = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder();
		A :for (int i = 0; i < N; i++) {
			int height = Integer.parseInt(st.nextToken()); // 현재 탑 높이

//			1. 비교할 탑의 정보가 없는 경우(스택이 비어있는 경우)
//			   => 0을 출력 후, 스택에 현재 탑의 정보 저장
			if (stack.isEmpty()) {
				sb.append(0).append(" ");
				stack.push(new int[] { i, height });
				continue;
			}

			while (!stack.isEmpty()) {
				int[] top = stack.peek(); // 비교할 탑 정보

//			1) 스택에서 꺼낸 탑 높이 < 현재 탑 높이
				if (top[1] < height) {
//				스택에서 꺼낸 탑 정보를 스택에서 삭제 후, 스택에서 탑 정보를 하나 꺼내 탐색을 이어감
					stack.pop();
				}

//			2) 스택에서 꺼낸 탑 높이 > 현재 탑 높이
				else {
					//스택에서 꺼낸 탑의 번호 출력 후, 현재 탑의 정보를 스택에 저장
					sb.append(top[0]).append(" ");
					stack.push(new int[] {i, height});
					continue A;
				}
			}
			
			// 모든 스택의 정보와 비교했을 때, 더 높은 탑을 찾지 못함
			sb.append(0).append(" ");
			stack.push(new int[] { i, height });
			
		}
		
		System.out.println(sb);
	}

}
