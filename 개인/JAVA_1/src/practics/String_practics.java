package practics;

import java.util.Scanner;

public class String_practics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
//		//문제1
//		String str1 = "Hell";
//		String str2 = "o Wor";
//		String str3 = "ld";
//		System.out.println("문제1");
//		System.out.println(str1 + str2 + str3);
//		System.out.println();
//		
//		//문제2-1
//		System.out.println("문제2");
//		String str = "my name is ola.";
//		if(str.contains("ol")) {
//			System.out.println("포함");
//		} else {
//			System.out.println("미포함");
//		}
//		
//		//문제2-2
//		if(str.contains("ol")) {
//			System.out.println(str.indexOf("ol"));
//		} else {
//			System.out.println("미포함");
//		}
//		System.out.println();
//		
//		//문제3
//		System.out.println("문제3");
//		String p3str = "    Hello World      ";
//		String p3str2 = s.nextLine().trim();
//		System.out.println(p3str.trim());
//		System.out.println(p3str2.trim());
//		System.out.println();
//		
//		
//		//문제 4-1
//		System.out.println("문제4");
//		char[][] chars = new char[3][5];
//		for (int i=0; i<3; i++) {
//			for(int j=0; j<5; j++) {
//				chars[i][j] = s.next().charAt(0);
//			}
//		}
//		for (int i=0; i<3; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print(chars[i][j] + " ");
//			}
//			System.out.println();
//		}
//		// 문제 4-2
//		chars = new char[3][5];
//		for (int i=0; i<3; i++) {
//			String tmp = s.next().trim();
//			for(int j=0; j<5; j++) {
//				chars[i][j] = tmp.charAt(j);
//			}
//		}
//		for (int i=0; i<3; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print(chars[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		
//		//문제 5-1
//		System.out.println("문제5");
//		String str5 = "Lorem ipsum dolor sit amet";
//		String str5_1 = "Lorem ipsum dolor sit amet";
//		
//		if (str5.equals(str5_1)) {
//			System.out.println("일치");
//		} else {
//			System.out.println("불일치");
//		}
//		//문제 5-2
//		String str52 = "Lorem ipsum dolor sit amet";
//		String str52_2 = "Lorem ipsum dolor sit amet";
//		
//		if(str52.toUpperCase().equals(str52_2.toUpperCase())) {
//			System.out.println("일치");
//		} else {
//			System.out.println("불일치");
//		}
//			System.out.println();
//		
//		
//		//문제 6
//		System.out.println("문제6");
//		String str6 = "Hello World";
//		System.out.println(str6.length());
//		System.out.println();
//		
//		
//		//문제 7
//		System.out.println("문제7");
//		String str7 = "Hello World";
//		System.out.println(str7.substring(3,9));
//		System.out.println();
		
		
		//문제 8-1
		System.out.println("문제8");
		for(int i=0; i<6; i++) {
			String str8 = s.nextLine().trim();
			System.out.println(str8.substring(0,2).equals("ab"));
		}
		//문제 8-2
		for(int i=0; i<6; i++) {
			String str8_2 = s.nextLine().trim();
			System.out.println(str8_2.substring(str8_2.length()-2, str8_2.length()).equals("ab"));
		}
		
		
		//문제 9
		System.out.println("문제9");
		String str91 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam velit metus, porta non tincidunt non, blandit ut nisl. Sed nulla quam, lacinia vel dolor non, efficitur consequat elit. Interdum et malesuada fames ac ante ipsum primis in faucibus. Fusce condimentum sapien vitae tellus consequat, vel suscipit est ultrices. Sed ac rhoncus mi. Nunc euismod semper luctus. Ut in est sed diam malesuada blandit ut non risus. Aenean malesuada elit et lectus feugiat, vitae maximus urna commodo. Proin varius felis sed augue eleifend, condimentum vulputate lacus pellentesque.";
		System.out.println(str91.replace("em", "ab"));
		
		
		//문제 10
		System.out.println("문제10");
		String str10 = "Donec mauris augue rhoncus ut leo at auctor blandit est";
		String[] strs = str10.split(" ");
		for(String tmp10: strs)
			System.out.println(tmp10);
	}

}
