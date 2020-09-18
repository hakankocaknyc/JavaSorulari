package interwievSorulari;

public class UniqueCharacters {

	public static void main(String[] args) {
		//Check if a given String has unique characters or not.

		String text = "The weather is so nice today!";
		String text1 = "palindrome";

		
		System.out.println(unique(text1));
		System.out.println(unique(text));
	}
	
	public static boolean unique(String str){
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;
			for (int j = i+1; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				return false;
			}
		}
		return true;
	}
	
	
	

}
