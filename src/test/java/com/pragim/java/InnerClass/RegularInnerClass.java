package com.pragim.java.InnerClass;

public class RegularInnerClass {

	class Inner{
		
		public void m1() {
			
			System.out.println("Inner Class!!!");
		}
		
	}
	

    public static void main(String[] args) {
    	
    	System.out.println("Outer class");
    	
    	RegularInnerClass outer = new RegularInnerClass();
    	
    	RegularInnerClass.Inner i = outer.new Inner();
    	
    	i.m1();
    }
	
	
}
