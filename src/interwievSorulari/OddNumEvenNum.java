package interwievSorulari;

public class OddNumEvenNum {

	public static void main(String[] args) {
		 
			System.out.println(isEven(75));
	}

	
	
	public static boolean isEven(int num){
		
		if (num %2 ==0){
			System.out.println("this is even number");
			return true;
		}
		else{
			System.out.println("This is odd  number");
			return false;
		}
	}
}
