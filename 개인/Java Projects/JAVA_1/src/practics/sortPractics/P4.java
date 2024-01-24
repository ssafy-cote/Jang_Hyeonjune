package practics.sortPractics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아래와 같은 Employee 클래스가 존재할 때 해당 클래스를 
		// 정렬이 가능한 클래스로 만들어보세요. ( 사번 기준 오름차순 )

		Employee[] emps = {
				new Employee("5","설한결","no.1", 5000),
				new Employee("2","남궁소라","no.2", 3000),
				new Employee("3","오버들","no.3", 1000),
				new Employee("1","탁아람","no.3", 1000),
				new Employee("7","권철", "no.4", 500),
				new Employee("4","유바다","no.4", 500),
				new Employee("6","풍우람","no.4", 500),
		};
		Arrays.sort(emps);// 5번
		System.out.println(Arrays.toString(emps));
		Arrays.sort(emps, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getEn().compareTo(o1.getEn());
			}

		});// 6번
		System.out.println(Arrays.toString(emps));
		//7번
		System.out.println("7번");
		Arrays.sort(emps, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getLevel().compareTo(o2.getLevel());
			}

		});
		System.out.println(Arrays.toString(emps));
		//8번
		System.out.println("8번");
		Arrays.sort(emps, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getLevel().compareTo(o1.getLevel());
			}

		});
		System.out.println(Arrays.toString(emps));

		//9번
		System.out.println("9번");
		List<Employee> emp_list = Arrays.asList(emps);
		Collections.sort(emp_list);
		System.out.println(emp_list);
		
		//9번
		System.out.println("10번");
		List<Employee> emp_list2 = Arrays.asList(emps);
		Collections.sort(emp_list2, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.getLevel().equals(o2.getLevel())) {
					return o1.getName().compareTo(o2.getName());
				}
				return o1.getLevel().compareTo(o2.getLevel());
			}
			
		});
		System.out.println(emp_list2);
	}

}

class Employee implements Comparable<Employee> {
	private String en;    //사번
	private String name;  //이름
	private String level; //직책
	private int salary;   //월급


	public Employee(String en, String name, String level, int salary){
		this.en = en;
		this.name = name;
		this.level = level;
		this.salary = salary;
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return en.compareTo(o.en);
	}

	@Override
	public String toString() {
		return "Employee [en=" + en + ", name=" + name + ", level=" + level + ", salary=" + salary + "]\n";
	}

	public String getEn() {
		return en;
	}

	public void setEn(String en) {
		this.en = en;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}