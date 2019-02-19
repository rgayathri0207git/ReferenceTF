package week2;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n:");
		int n=sc.nextInt();
		int N=n;
		int r=0;
		while(N!=0) {
			int d=N%10;
			N=N/10;
			r=r*10+d;
		}
		System.out.println("Reversed number:"+r);
		if(r==n) {
			System.out.println(n+ " is palindrome");
		}
		else {
			System.out.println(n+ " is not palindrome");
		}
		sc.close();
	}
}
