package common_use_class;

public class ObjectsTest {

	static Object obj;
	
	public static void main(String[] args) throws Exception{
		
		String s = new String("fkit.org");
		System.out.println("s.charAt(5)" + s.charAt(5));
		String s1 = new String("abcdefghijklmn");
		String s2 = new String("abcdefghij");
		String s3 = new String("abcdefghijalmn");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		String r1 = ".org";
		String r2 = "fkit.org";
		System.out.println(r2.endsWith(r1));
		char[] f1 = {'I',' ','l','o','v','e',' ','j','a','v','a'};
		String f2 = new String("ebj");
		f2.getChars(0, 3, f1, 7);
		System.out.println(f1);
		String e = "www.fkit.org";
		String ee = "it";
		System.out.println(e.indexOf('r'));
		System.out.println(e.indexOf('r', 2));
		System.out.println(e.indexOf(ee));
		String e2 = "www";
		String e3 = "fkit";
		System.out.println(e.startsWith(e2));
		System.out.println(e.startsWith(e3, 4));
		System.out.println(e.toUpperCase());
		System.out.println(e.toLowerCase());
		
	}
	

}
