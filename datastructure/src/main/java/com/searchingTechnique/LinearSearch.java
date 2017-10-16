package com.searchingTechnique;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,45,56,21,23};
		int searchValue = 30;
		
		for(int i = 0; i < arr.length;i++){
			if(arr[i] == searchValue){
				System.out.println("value position =="+i);
				break;
			}
		}
		
	}

}
