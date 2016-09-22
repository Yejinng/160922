package string;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("this");	//생성
		
		System.out.println(sb);
		sb.append(" is pencil");	//문자열 덧붙이기
		System.out.println(sb);
		sb.insert(7, " my");		//문자열 삽입
		System.out.println(sb);
		sb.replace(8, 10,"your");	//문자열 대치
		System.out.println(sb);
		sb.setLength(5);			//버퍼크기 조정
		System.out.println(sb);
	}

}
