package com.searchingTechnique;

public class InterpolationSearch {

	public static void main(String[] args) {
		

		int [] arr = {10,15,20,25,30,35,40,45,50,55,60};
		
		int high = arr.length-1;
		
		int low = 0;
		
		int key = 45;
		
		int mid = -1;
		
		while (arr[low] <= key && arr[high] >= key) {
			
			 if(low == high || arr[low] == arr[high]){
				 System.out.println("Value not Found");
				 return ;
			 }
			
			 mid = low + ((high-low)/(arr[high]-arr[low])) * (key - arr[low]);
			 		 
			 if(arr[mid] == key){
				 System.out.println("Key Postion =="+mid);
				 return;
			 }else{
				 if (arr[mid] < key){
					 low = mid +1;
				 }else if( arr[mid] > key){
					 high = mid -1;
				 }
			 }
			
			/*if Lo equals to Hi OR A[Lo] equals to A[Hi]
			         EXIT: Failure, Target not found
			      end if
			      
			      Set Mid = Lo + ((Hi - Lo) / (A[Hi] - A[Lo])) * (X - A[Lo]) 

			      if A[Mid] = X
			         EXIT: Success, Target found at Mid
			      else 
			         if A[Mid] < X
			            Set Lo to Mid+1
			         else if A[Mid] > X
			            Set Hi to Mid-1
			         end if
			      end if*/
			
			
			
		}

	}

}
