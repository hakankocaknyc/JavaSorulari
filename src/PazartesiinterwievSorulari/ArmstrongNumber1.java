package PazartesiinterwievSorulari;

public class ArmstrongNumber1 {

	public static void main(String[] args) {
		 
		isArmstrong(153);
		// 153 =1^3 + 5^3 + 3^3 Armstrong
		//1,153,
	}
	public static void isArmstrong(int number){
		int armstrong =0;
		for (int i = number; i >0; i=i/10) {
			int rem= i % 10;
			armstrong=armstrong + rem*rem*rem;
		}System.out.println("Sum of Digitis..." + armstrong);
		if(armstrong==number){
			System.out.println("Armstrong number: " + armstrong);
		}else{
			System.out.println(" Not Armstrong number");
		}
	}

}
