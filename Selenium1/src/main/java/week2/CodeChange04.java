package week2;

import java.util.Scanner;

public class CodeChange04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a and b:");
		int a=sc.nextInt();
		int b=sc.nextInt();

		while(a<=b) {
			if((a%3==0) &&(a%5==0) ) {
				System.out.print("FIZZBUZZ"+" ");
			}
			else if(a%3==0) {
				System.out.print("FIZZ"+" ");

			}
			else if(a%5==0) {
				System.out.print("BUZZ"+" ");
			}
			else {
				System.out.print(a+" ");
			}
			a++;
		}
		sc.close();

	}

}
