package com.ssafy.day4.d_object;

import java.util.Objects;

public class Product {
    private String sn;

    public Product(String sn) {
        this.sn = sn;
        sn.toString();
    }

    // TODO: toString, equals, hashCode를 적절히 재정의해보자.
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Product sn : " + sn;
    }
    
    @Override
    public boolean equals(Object obj) {
    	// TODO Auto-generated method stub
    	
    	return ((Product) obj).sn.equals(this.sn);
    }
    
    @Override
    public int hashCode() {
    	// TODO Auto-generated method stub
    	return Objects.hash(sn);
    }
    // END
   

}
