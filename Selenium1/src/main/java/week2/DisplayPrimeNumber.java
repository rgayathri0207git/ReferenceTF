package week2;

public class DisplayPrimeNumber {
	public static void main(String[] args) {
		int n=30;
System.out.print("1");
		for (int i = 2; i <=n; i++) {
			int c=0;
			for (int j = 2; j < i; j++) {

				if(i%j==0) {
					c++;
				}


			}
			if (c==0) {
				System.out.print(","+i);
			}

		}
	}


}