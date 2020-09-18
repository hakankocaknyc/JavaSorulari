package interwievSorulari;

import java.util.Arrays;

public class Arrayler {

	public static void main(String[] args) {
//		boolean checkDup =true;
		
		 int []arr1 = {1,2,3,4,5,6,7,8};
		int []arr2 = {3,4,0,10,11,8 ,5};
		
//		System.out.println(Arrays.toString(arr1));
		
		for (int i = 0; i < arr1.length; i++) {
 		 
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i]== arr2[j]){
					System.out.println("intersection Found : " + arr1[i]);
				}
			}
			
		}
			
		 
		
		
		
		
		
		
		
	}
}
