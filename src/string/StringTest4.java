package string;

public class StringTest4 {

	public static void main(String[] args) {
		String s1 = "aBcAbCabcABC";

		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("abc"));
		System.out.println(s1.length());
		System.out.println(s1.replace("a", "R"));
		System.out.println(s1.replaceAll("abc", "123"));
		System.out.println(s1.substring(0, 3));
		System.out.println(s1.toUpperCase());
	
	
	String a = " ab cd     ";
	String b = ",efg";
	
	String c = a.concat(b);
	
	System.out.println(c);
	System.out.println(a +b);
	
	System.out.println("----" + a.trim() + "----");
	System.out.println("----" + a.replaceAll(" ", "") + "----");
	//
	// [0-9] + 0 1 2 3 345 4123
	//[a-zA-Z]+
	//|
	//정규식 알아두면 좋다!
	
	String[] t = b.split(",");
	for(String k : t){
		System.out.println(k);
		}
	
	//+연산자
	String[] arr = {"hello", "world","java"};
	String str = "";
	for(String str2 : arr){
		str += str2;
	}
	System.out.println(str);
	
	//String str2 = "hello" +"world" + "java";
	StringBuffer sb = new StringBuffer("hello");
	sb.append("world");
	sb.append("java");
	
	String str2 = new StringBuffer("hello").append("world").append("java").toString();
	System.out.println(str2);
	
	}
}
