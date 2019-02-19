package week2;

public class array {

	public static void main(String[] args) {
		String str="My name is gayathri";
		String temp="";
		boolean b=true;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' ') {
				temp=temp+str.charAt(i);
			}else {
				b=isPalindrome(temp);
				if(b==false) {
					System.out.println("not palindrome");
					for (int j = str.length()-1; j>=0; j--) {
						System.out.print(str.charAt(j));
					}
					break;				}
				temp=null;
			}
		}
		if(b==true) {
			System.out.println("it is Palindrome");
		}
	}

	public static boolean isPalindrome(String s) {
		String r="";
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
		}
		if(s.equals(r)) {
			return true;
		}
		return false;
	}
}
