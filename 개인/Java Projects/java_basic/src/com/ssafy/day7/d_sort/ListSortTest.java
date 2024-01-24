package com.ssafy.day7.d_sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ssafy.day7.b_set.SmartPhone;

public class ListSortTest {

	private List<String> names = Arrays.asList("Hi", "Java", "World", "Welcome");

	public void basicSort() {
		// TODO: names를 이름의 오름차순, 또는 그 역순으로 정렬해서출력하시오.
		Collections.sort(names);
		System.out.println(names);
		// END
	}

	public void sortPhone() {
		// TODO: 전화 번호에 따라 SmartPhone을 정렬해보자.
		List<SmartPhone> phones = Arrays.asList(new SmartPhone("010"), new SmartPhone("111"), new SmartPhone("001"),
				new SmartPhone("100"));
		Collections.sort(phones); // Comparable을 상속 받아야지만 사용이 가능하다. ctl 찍어서 확인해보기
		System.out.println(phones);
		// END
	}

	public void stringLengthSort() {
		// TODO: 문자열의 길이에 따라 names를 정렬해보자.
		//		Collections.sort(names, new StringLengthComparator());
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int len1 = o1.length();
				int len2 = o2.length();
				return Integer.compare(len1, len2);
			}

		});

		Collections.sort(names, (o1, o2) -> {
			int len1 = o1.length();
			int len2 = o2.length();
			return Integer.compare(len1, len2);
		});
		
		Collections.sort(names, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
		// END
		System.out.println(names); // [Hi, Java, World, Welcome]
	}

	public static void main(String[] args) {
		ListSortTest st = new ListSortTest();
		st.basicSort();
		st.sortPhone();
		st.stringLengthSort();
	}

}
