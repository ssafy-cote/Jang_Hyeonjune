package com.ssafy.day7.b_set;

import java.util.Objects;

// TODO: SmartPhone이 다른 SmartPhone과 번호를 기준으로 비교가능하게 처리하시오.
 public class SmartPhone implements Comparable<SmartPhone> {

    // END

    String number;

    public SmartPhone(String number) {
        this.number = number;
    }

    public String toString() {
        return "전화 번호: " + number;
    }

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof SmartPhone phone) {
			return this.number.equals(phone.number);
		}
		return false;
	}


    // TODO: 동일한 번호의 SmartPhone이면 하나만 추가될 수 있도록 처리하시오.
	@Override
	public int compareTo(SmartPhone o) {
		return number.compareTo(o.number);
	}


    
    // END

}
