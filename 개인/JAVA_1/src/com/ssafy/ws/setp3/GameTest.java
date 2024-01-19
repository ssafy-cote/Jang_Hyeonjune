package com.ssafy.ws.setp3;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println();
		System.out.println("1.5판 3승");
		System.out.println("2.3판 2승");
		System.out.println("3.1판 1승");

		Scanner s = new Scanner(System.in);

		int win_count = 0;
		int game_count = 0;
		while (true) {
			System.out.print("번호를 입력하세요. ");
			int select = s.nextInt();
			if (select == 1) {
				win_count = 3;
				game_count = 5;
				break;
			} else if (select == 2) {
				win_count = 2;
				game_count = 3;
				break;
			} else if (select == 3) {
				win_count = 1;
				game_count = 1;
				break;
			} else {
				System.out.println("번호를 잘 못 입력하셨습니다.");
			}
		}
		
		while (true) {
			game_count--;
			int rand = (int) (Math.random() * 3) + 1;
			System.out.print("가위바위보 중 하나 입력: ");
			s = new Scanner(System.in);
			String rcp = s.nextLine();
			rcp.replace("\n", "");
			System.out.println(rcp);
			
			if(rcp.equals("가위")) {
				if (rand == 3) {
					System.out.println("이겼습니다!!!");
					win_count--;
				} else {
					System.out.println("졌습니다!!!");
				}
			} else if(rcp.equals("바위")) {
				if (rand == 1) {
					System.out.println("이겼습니다!!!");
					win_count--;
				} else {
					System.out.println("졌습니다!!!");
				}
			} else if(rcp.equals("보")) {
				if (rand == 2) {
					System.out.println("이겼습니다!!!");
					win_count--;
				} else {
					System.out.println("졌습니다!!!");
				}
			} else {
				game_count++;
				System.out.println("잘 못 입력하셨습니다. \n 가위 바위 보 중에 선택해 주세요.\n");
				continue;
			}
			
			
			
			if(win_count == 0) {
				System.out.println("### 승리!!!");
				break;
			}
			else if(game_count == 0) { 
				System.out.println("### 컴퓨터 승!!!");
				break;
			}
		}

	}

}
