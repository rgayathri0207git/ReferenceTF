package week2;

public class duplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] n= {1,3,4,4,5,2,4,6,7,8};
		int count;

		for (int i = 0; i < n.length; i++) {
			count=0;
			for (int j =0; j < n.length; j++) {
				if(n[i]==n[j]) {
					count=count+1;
				}

			}
			if(count<=1) {
				System.out.print(" "+n[i]);
			}

		}

	}

}
