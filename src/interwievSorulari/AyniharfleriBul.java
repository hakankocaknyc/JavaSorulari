package interwievSorulari;
		public class AyniharfleriBul {
		void counter(String text){
			int count = 0;
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) != ' ') {
					count++;
				}
			}
			System.out.println(count);
		}	
		public static void main(String[] args) {
		//Check if a given String has unique(duplicate) characters or not.
		String text = "New Jersey      ";
		String text1 = "Texas";
		new AyniharfleriBul().counter(text);
		checkUnique(text);
		checkUnique(text1);
		System.out.println(checkUnique1(text1));
		System.out.println(checkUnique1(text));
		}
		 public static void checkUnique(String str) {
		 for (int i = 0; i < str.length(); i++) {
		for (int j = i+1; j+1 < str.length(); j++) {
		if (str.charAt(i)==str.charAt(j)) {
		System.out.println("Duplicate Found : " + str.charAt(i));
		}
		}
		}
		 }
		 //Texas
		  public static boolean checkUnique1(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j) &&!( str.charAt(i) == ' ' && str.charAt(j) == ' ')) {
					return true;
				}                
		}
		}
		  return false;
		} 
		}