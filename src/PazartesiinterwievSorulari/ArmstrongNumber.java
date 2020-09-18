package PazartesiinterwievSorulari;

import java.util.ArrayList;

public class ArmstrongNumber {

	public static void main(String[] args) {

		isArmstrong(100000);

	}

	// 153 = 1^3 + 5^3 + 3^3 Armstrong number
	public static void isArmstrong(int number) {
		ArrayList<Integer> armstrongNumbers = new ArrayList<>();
		for (int j = 1; j < number; j++) {
			int armstrong = 0;
			for (int i = j; i > 0; i = i / 10) {
				int rem = i % 10; // 1
				armstrong = armstrong + rem * rem * rem; // 250 + 1 = 251
			}
			if (armstrong == j) {
				armstrongNumbers.add(j);
			}

		}
		System.out.println(armstrongNumbers);

	}

	// if (armstrong == number) {
	// System.out.println("Armstrong number");
	// }else{
	// System.out.println("Not armstrong number");
	// }

}
