package interwievSorulari;

import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenArrayList {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Size of Array?");
		int size = scanner.nextInt();

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter a number: ");
			int num = scanner.nextInt();
			numbers.add(num);
		}
		
		System.out.print("Even Numbers : ");
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 == 0) {
				System.out.print(numbers.get(i) + " ");
			}
		}

		System.out.print("\nOdd Numbers : ");
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 != 0) {
				System.out.print(numbers.get(i) + " ");
			}
		}
		
		

	}

}
