package off0117;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeManager manager = new EmployeeManager();
		
		Employee emp1 = new Employee("1","하이머1", "회장");
        Employee emp2 = new Employee("2","하이머2", "사장");
        Employee emp3 = new Employee("3","하이머3", "부장");
        Employee emp4 = new Employee("4","하이머4", "이사");
        Employee emp5 = new Employee("5","하이머5", "대리");
        
        manager.insert(emp1);
        manager.insert(emp2);
        manager.insert(emp3);
        manager.insert(emp4);
        manager.insert(emp5);
        
//        //임시 체크
//        for(int i=0; i<10; i++) {
//        	System.out.println(manager.emps[i].name);
//        }
        
        manager.deleteByEn("3");
        
        Employee[] emps = manager.getEmployees();
        for(Employee e : emps) {
        	System.out.println(e.name);
        }
        
        
	}

}
