package com.pragim.java.datastructure;

public class ArrayList {

	
	static int[] k;
	
	public static void main(String[] args) {

		
		sum();
	}
	
	
	public static void sum() {
		
		int[] arr1 = {10,20,30,40,50};
		
		int[] arr2 = {70,90};
		
		System.out.println(arr1.length);
		
		arr1 = arr2;
		
		arr2 = arr1;
		
		System.out.println(arr1.length);
		
		System.out.println(arr2.length);
		
	}
	
	
}
