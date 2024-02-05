package algo0205;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

/*
 * 백준 2493 탑
 * 
 * 문제 일직선 위에 N개의 높이가 서로 다른 탑을 수평 직선의
 * 왼쪽부터 오른쪽으로 차례로 세우고, 각 탑의 꼭대기에 레이저 송신기를
 * 설치하였다. 모든 탑의 레이저 송신기는 레이저 신호를 지표면과 평행하게
 * 수평 직선의 왼쪽 방향으로 발사하고, 탑의 기둥 모두에는 레이저 신호를
 * 수신하는 장치가 설치되어 있다. 하나의 탑에서 발사된 레이저 신호는
 * 가장 먼저 만나는 단 하나의 탑에서만 수신이 가능하다.
 * 
 * 예를들면 높이가 6,9,5,7,4인 다섯 개의 탑이 수평 직선에 일렬로 서 있고,
 * 모든 탑에서는 주어진 탑 순서의 반대 방향(왼쪽 방향)으로 동시에
 * 레이저 신호를 발사한다고 하자. 그러면 높이가 4인 다섯 번째 탑에서
 * 발사한 레이저 신호는 높이가 7일 네 번째 탑이 수신을 하고,
 * 높이가 7인 네 번째 탑의 신호는 높이가 89인 두 번째 탑이,
 * 높이가 5인 세 번째 탑의 신호도 높이가 9일 두 번째 탑이 수신한다.
 * 높이가 9인 두 번째 탑과 높이가 6인 첫 번째 탑이 보낸
 * 레이저 신호는 어떤 탑에서도 수신을 하지 못한다.
 * 
 * 탑들의 개수 N과 탑들의 톺이가 주어질 때, 각각의 탑에서 발사한
 * 레이저 신호를 어느 탑에서 수신하는지를 알아내는 프로그램을 작성하라.
 * 
 * @입력
 * 첫째 줄에 탑의 수를 나타내는 정수 N이 주어진다. (1<=N<=500000)
 * 둘째 줄에는 N개의 탑들의 높이가 직선상에 놓인 순서대로 주어진다.
 * 탑들의 높이는 1이상 100000000이하의 정수이다.
 * 
 * @출력
 * 첫째 줄에 주어진 탑들의 순서대로 각각의 탑들에서 발사한
 * 레이저 신호를 수신한 탑들의 번호를 하나의 빈칸을 사이에 두고 
 * 출력한다. 만약 레이저 신호를 수신하는 탑이 존재하지 않으면 0을
 * 출력한다.
 * 
 * @해결방안
 * 앞쪽부터 자신의 신호가 닿는 것이 있다면 배열에 따로 저장하기.
 * 초기화를 0으로 해준다.
 * 
 * 단순하게 하면 시간초과가 난다.
 * 입력을 할 당시, 그 이전을 비교하는 것은..?
 * O(n)이 될듯한데.. 변수 idx를 선언한다.
 * 
 * 스택을 구현하여 pop을하며 안쪽의 값을 비교
 * 
 * 
 */

public class Main_BJ_2493_탑_장현준 {
    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        Stack<int[]> stack = new Stack<>(); // 높이와 인덱스 쌍을 저장하는 단일 스택 사용

        StringTokenizer st = new StringTokenizer(br.readLine());
        int get_num;
        for (int i = 0; i < N; i++) {
            get_num = Integer.parseInt(st.nextToken());

            // 더 큰 탑을 찾을 때까지 스택에서 요소를 팝합니다.
            while (!stack.isEmpty() && stack.peek()[0] <= get_num) {
                stack.pop();
            }

            // 스택이 비어있으면 왼쪽에 더 높은 탑이 없습니다.
            // 그렇지 않으면 왼쪽에 가장 높은 탑이 스택의 맨 위에 있습니다.
            if (stack.isEmpty()) {
                arr[i] = 0;
            } else {
                arr[i] = stack.peek()[1];
            }

            // 현재 탑의 높이와 인덱스를 스택에 푸시합니다.
            stack.push(new int[]{get_num, i + 1});
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
