package week2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
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
		ls.add(4);
		Set<Integer> set=new HashSet<Integer>();
		System.out.println("With duplicates-->"+ls);

		boolean flag=true;
		Set <Integer> dset=new LinkedHashSet<>();

		for (int i = 0; i < ls.size(); i++) {
			flag=set.add(ls.get(i));
			if(flag==false) {
				dset.add(ls.get(i));
			}
		}
		System.out.println("without duplicates-->"+set);
		System.out.println("duplicates-->" +dset);


	}

}


