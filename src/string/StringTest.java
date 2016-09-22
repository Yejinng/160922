package string;

public class StringTest {

	public static void main(String[] args) {
		String s = "c:\\temp";	//  \\ => 역슬래쉬를 출력하기 위한 이스케이프	
		
		// \t => tab
		// \r => carriage return
		// \n => new line
		
		System.out.println(s);
		
		String s1 = "\"hello\"";	//	\" => "을 출력하기 위한 이스케이프
		System.out.println(s1);
		
		
		System.out.print(" hello\tworld\n");
		System.out.println("==============");
		
		System.out.println(" hello\tworld");
		System.out.println("==============");
		System.out.println("hello\nworld");
	}

}
