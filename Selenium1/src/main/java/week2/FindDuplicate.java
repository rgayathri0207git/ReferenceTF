package week2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		
		

		List<Integer> ls=new ArrayList<>();
		
		ls.add(1);
		ls.add(1);
		ls.add(3);
		ls.add(3);
		ls.add(2);
		ls.add(2);
		Set<Integer> set=new HashSet<Integer>();
		set.addAll(ls);
		System.out.println("With duplicates-->"+ls);
		//System.out.println("without duplicate-->"+set);
		List<Integer> ls1=new ArrayList<>();
		ls1.addAll(set);

		for (int i = 0; i < ls1.size(); i++) {
			int c=0;
			for (int j = i+1; j < ls.size(); j++) {
				if(ls1.get(i)==ls.get(j)) {
					c++;
				}

			}
			if(c>=1) {
				System.out.print(ls1.get(i)+" ");
			}
			//			else {
			//				System.out.println("no");
			//			}
		}

	}

}
