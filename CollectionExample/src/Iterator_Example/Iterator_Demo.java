package Iterator_Example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Iterator_Demo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("green");
		list.add("white");
		list.add("red");
		list.add("red");
		//System.out.println("list with duplicates:" + list);

		list.remove("green");

list.remove(1);
System.out.println(list);

		/*
		 * //use set to remove duplicates Set<String>uniqueset = new HashSet<>(list);
		 * 
		 * //create another list to remove
		 * 
		 * List<String>listwithoutduplicates= new ArrayList<>(uniqueset);
		 * 
		 * System.out.println("llist without dulicates")
		 * ;
		 * 
		 * 
		 * Iterator<String>itertorex = listwithoutduplicates.iterator();
		 * while(itertorex.hasNext()) { System.out.println(itertorex.next()); }
		 * 
		 * 
		 */
		/*
		 * for (String item : listwithoutduplicates) { System.out.println(item); }
		 */

		/*
		 * System.out.println(list); list.add("black");
		 * 
		 * System.out.println(list);
		 */

		/*
		 * Iterator<String>iterator1 = list.iterator();
		 * 
		 * while(iterator1.hasNext()) { System.out.println(iterator1.next());
		 * 
		 * 
		 * }
		 */
		// System.out.println(it);

		// list.add("violet"); System.out.println(list);

	}

}
