package week2;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();

		switch(n) {
		case 1:System.out.println("It is january and it has 31 days");
		break;
		case 2:System.out.println("It is february and it has 28 days");
		break;
		case 3:System.out.println("It is March and it has 31 days");
		break;
		case 4:System.out.println("It is April and it has 30 days");
		break;

		case 5:System.out.println("It is May and it has 31 days");
		break;
		case 6:System.out.println("It is June and it has 30 days");
		break;
		case 7:System.out.println("It is july and it has 31 days");
		break;
		case 8:System.out.println("It is Augest and it has 31 days");
		break;
		case 9:System.out.println("It is September and it has 30 days");
		break;
		case 10:System.out.println("It is October and it has 31 days");
		break;

		case 11:System.out.println("It is November and it has 30 days");
		break;
		case 12:System.out.println("It is December and it has 31 days");
		break;

		}
		sc.close();
	}
}


