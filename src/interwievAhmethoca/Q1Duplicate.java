package interwievAhmethoca;

public class Q1Duplicate {

	public static void main(String[] args) {
		

		
		int [] arr ={2,3,4,5,2,4,6};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]==arr[j]) {
					
					System.out.println("Duplicate Array is : " + arr[j]);
					
				}
			}
			
		}

		
		
		
		String [] str = {"ali","hasan", "hakan", "ali","hakan"};
		
		
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				
				if (str[i]== str[j]) {
					System.out.println("Duplicate String Array is : " + str[j]);
					
				}
				
			}
			
		}
	}

}
