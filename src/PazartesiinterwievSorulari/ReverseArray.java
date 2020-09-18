package PazartesiinterwievSorulari;

public class ReverseArray {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6};

		System.out.println("Before reversing:: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\nAfter reversing ::");
		reverseArray(array);
		
	}
	
	public static void reverseArray(int [] array){
		for (int i = 0; i < array.length/2 ; i++) {
			int temporary = array[i]; //1 //2
			array[i] = array[array.length-i-1]; //5 //4
			array[array.length-i-1] = temporary; //1 //2
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		
	}
	

}
