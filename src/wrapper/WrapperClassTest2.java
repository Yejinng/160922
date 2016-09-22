package wrapper;

public class WrapperClassTest2 {

	public static void main(String[] args) {
		//Auto Boxing
		//int i = Integer.parseInt("12345");
		//Integer i2 = new Integer (i);
		Integer i2 = Integer.parseInt("12345");
		double d = Double.parseDouble("3.14");
		int num = Character.getNumericValue('A');
		int i3 = Integer.parseInt("f",16);
		String s = Integer.toBinaryString(15);
		int countBit = Integer.bitCount(15);
		String hexstr = Integer.toHexString(2345);
		String s2 = String.valueOf(i2);
		
		System.out.println(i2);
		System.out.println(d);
		System.out.println(num);
		System.out.println(i3);
		System.out.println(s);
		System.out.println(countBit);
		System.out.println(hexstr);
		System.out.println(s2);
		
	}

}
