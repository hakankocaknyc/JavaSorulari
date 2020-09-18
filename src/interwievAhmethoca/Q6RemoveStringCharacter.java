package interwievAhmethoca;

public class Q6RemoveStringCharacter {

	public static void main(String[] args) {
		

		String s ="#$6 latin string  6790";// 6    6790
		s = s.replaceAll("[^ 0-9]", " ");
		System.out.println(s);
		
		
		String sl= "nedir -( bu anla><987_09miyorum";//nedir  bu anlamiyorum
		sl=sl.replaceAll("[^ a-z]","/" );
		System.out.println(sl);
		
		
		String h = "B*u n.a)s$i&l b*i9r se>,  y";//Bu nasil bir sey
		h=h.replaceAll("[^ a-zA-Z ]","");
		
		System.out.println(h);
	}

}
