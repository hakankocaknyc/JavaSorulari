package interwievAhmethoca;

public class RemoveJunkCharacter {

	public static void main(String[] args) {
		
		String st  = "3Ha45KAN68**%$@@ Ko78)(C^A(K ";
		st = st.replaceAll("[^a-zA-Z]", "");
		System.out.println(st);
		
		
		
	}

}
