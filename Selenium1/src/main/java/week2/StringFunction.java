package week2;

public class StringFunction {

	public static void main(String[] args) {
		String str1="Gayathri"; //String literal
		String str2="Gayathri";
		String str3=new String("Gayathri");//String object
		String str4=new String("Gayathri");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));
		
	}

}
