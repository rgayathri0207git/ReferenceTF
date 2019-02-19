package week2;

public class Sum {

	public static void main(String[] args) {
		
		Integer[] iArray= {1,1,1,1,1,1,1,1,1};
		int sum=0;
		int size=iArray.length;
		for (int i = 0; i < size; i++) {
			sum=sum+iArray[i];
		}
System.out.println("Sum of the numbers in array: "+sum);
System.out.println("Size of the Array: "+size);
	}

}
