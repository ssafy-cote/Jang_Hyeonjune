package week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class 더맵게 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] scoville = str.split(" ");
		int K = Integer.parseInt(br.readLine());

		int answer = 0;

		PriorityQueue<Integer> heap = new PriorityQueue<>();

		for (String sco : scoville) {
			heap.add(Integer.parseInt(sco));
		}

		while (true) {
			int first = heap.poll();

			if (first >= K)
				break;

			if (heap.size() == 0) {
				answer = -1;
				break;
			}

			first += heap.poll() * 2;
			heap.add(first);
			answer++;
		}

		System.out.println(answer);
	}

}
