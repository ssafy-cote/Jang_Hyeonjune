package off0117;

import java.util.Arrays;

public class EmployeeManager {

	final int MAX_SIZE = 100;
	//사원 목록 정보
	Employee[] emps = new Employee[MAX_SIZE];
	int size;
	
	
	//사원 목록 반환
	public Employee[] getEmployees() {
		return Arrays.copyOf(emps, size);		
	}
	
	//사원 등록 기능
	public void insert(Employee e) {
		// 배열을 순회하면서 null을 찾는다.
		for(int i=0; i<MAX_SIZE; i++) {
			if(emps[i]==null) {
				emps[i] = e;
				size++; // 사원 수 증가
				break;
			}
		}
		
	}
	
	//사번을 통한 사원 정보 조회
	public Employee findByEn(String en) {
		for(int i=0; i<size; i++) {
			if(emps[i].en.equals(en)) {
				return emps[i];
			}
		}
		return null;
		
	}
	
	//사번을 통한 사원 정보 삭제
	public void deleteByEn(String en) {
		for(int i=0; i<size; i++) {
			if(emps[i].en.equals(en)) {
				emps[i] =emps[size-1];
				emps[size-1] = null;
				size--; // 사원 수 감소
				return;
			}
		}
	}
	
}
