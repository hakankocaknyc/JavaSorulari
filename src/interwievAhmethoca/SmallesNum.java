package interwievAhmethoca;

import java.util.Arrays;

public class SmallesNum {

	public static void main(String[] args) {
		 
		int []arr ={23,455,678,43,8,1};
		
		
		Arrays.sort(arr);
		
		System.out.println(arr[0]);
		
		
		int max =arr [0];
		int min = arr[0]; 
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>max){
				
				
				max=arr[i];
				
			}else if ( arr[i]< min){
				
				min=arr[i];
			}
			
				
			}
			System.out.println("Max :" + max ) ;
//			System.out.println(min);
		}
		
	}


