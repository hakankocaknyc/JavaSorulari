package interwievSorulari;

import java.util.Scanner;

public class faktoriyel {

	public static void main(String[] args) {
		 
		 int factoriel =1;
		 
		Scanner scan  =new Scanner(System.in);
		int num = scan.nextInt();
		for(int i =1; i <= num; i++){
			factoriel*= i;
			System.out.println(factoriel);
		}
	 

	}

}
