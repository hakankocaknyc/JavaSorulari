package interwievAhmethoca;

public class Q3PrimeNumber {

	public static void main(String[] args) {
		System.out.println(PrimeNum(5));
		 
	}

	public static boolean PrimeNum(int num){
		
		if(num <=1){
			 
			return false;
		}
		
		
		for(int i = 2; i < num ; i++){
			
			if(num % i == 0){
				return false;
			}
		}
		return true;
		 
	}
}
