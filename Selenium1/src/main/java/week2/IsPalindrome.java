package week2;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter string");
//		String s=sc.next();
		String s="AABBAA aa";
		String r="";
		
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
		}
		System.out.println(s);
		System.out.println(r);
		if(s.equalsIgnoreCase(r))
				{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		/*sc.close();*/
	}

}



