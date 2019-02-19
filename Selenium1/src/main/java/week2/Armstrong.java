package week2;



public class Armstrong {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the n");
//		int n=sc.nextInt();
		for (int i =100; i <=1000; i++) {

            int n=i;
			int d;
			int N=0;
			while(n>0) {
				d=n%10;
				n=n/10;
				N=N+(d*d*d);
			}
			System.out.print(N+ ",");
		}
	}
}
