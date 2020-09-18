package interwievAhmethoca;

public class Q2FindMissinNumArray {

	public static void main(String[] args) {
		
		
		// int a [] = {1,2,4,5};
		// 1+2+4+5= 12;
		//1+2+3+4+5 = 15;
		
		int a [] = {1,2,4,5,6,7,8};
		
		int sum =0;
		
		for (int i = 0; i < a.length; i++) {
			sum =sum +a[i]; //12;
		}
		System.out.println("Sum : " + sum);
		
		int sum1 = 0;
		
		
		for (int j = 1;j <=8; j++) {
			sum1 = sum1 + j;
			
		}
		System.out.println("Sum1 : " + sum1);
		System.out.println(sum1-sum);
	}

}
