package PazartesiinterwievSorulari;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println(isPrime(3));

	}
	
	public static boolean isPrime(int number){
		int count = 0;
		if (number > 1) {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				return true;
			}
		}
		
		return false;
	}

}
