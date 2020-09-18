package interwievSorulari;

import java.util.Scanner;

public class polindrome {
 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scanner.nextInt();
		int reversedNum = 0, originalNum, remainderNum;
		originalNum = num;
		while (num != 0) {
			remainderNum = num % 10;
			reversedNum = reversedNum * 10 + remainderNum;
			num /= 10;
		}
		if (reversedNum == originalNum) {
			System.out.println(originalNum + " is a polindrome.");
		} else {
			System.out.println(originalNum + " is not polindrome.");
		}


















	}

}
