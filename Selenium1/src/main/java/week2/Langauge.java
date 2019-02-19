package week2;



public class Langauge {





	public static void main(String[] args) {
		String s="Gaya";

		String s1="abcdefghijklmnopqrstuvwxyz";
		String s2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				int n=s2.indexOf(s.charAt(i));
				n=n+3;
				if(n>s2.length()) {
					int n1=n-s2.length();
					System.out.print(s2.charAt(n1));
				}else {
					System.out.print(s2.charAt(n));
				}

			}else {
				int n=s1.indexOf(s.charAt(i));
				n=n+3;
				if(n>s1.length()) {
					int n1=n-s1.length();
					System.out.print(s1.charAt(n1));
				}else {
					System.out.print(s1.charAt(n));
				}

			}

		}

	}}
