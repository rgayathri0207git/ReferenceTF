package week2;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String action=sc.next();

		switch (action){

		case "Add": 
			System.out.println("Addition:"+ (a+b));
			break;
		case "Subtract": 
			System.out.println("subtraction:"+ (a-b));
			break;
		case "Multiple": 
			System.out.println("Multiplication:"+ (a*b));
			break;
		case "Divide": 
			System.out.println("Division:"+ (a/b));
			break;


		}
		sc.close();
	}



}





