package com.searchingTechnique;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int [] arr = {10,15,20,25,30,35,40,45,50,55,60};
		int end = arr.length-1;
		int start = 0;
		int key = 50;
		int mid;
		while(start <= end){
			
			mid = (start + end)/2;
			if(key == arr[mid]){
				System.out.println("Position := "+ mid);
				return;
			}else{
				
				if(key < arr[mid]){
					end = mid - 1;
				}else{
					start = mid + 1;
				}
			}
		}
		
		
		
		
		
		
	}
	

}
