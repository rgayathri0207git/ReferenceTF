package week2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the n:");
		int n= sc.nextInt();
		int a=0,b=1;
		int sum=0;
		System.out.print(a +","+b);

		if(n>=1) {
			while(sum<=n) {
				sum=a+b;
				a=b;
				b=sum;
				if(sum<=n) {
					System.out.print(","+sum);
				}}

		}
sc.close();

	}

}
