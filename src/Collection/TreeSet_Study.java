package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Study {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add("Akshay");
		ts.add("Koyale");
		ts.add("Abhijit");
		ts.add("Koyale");
		ts.add("Latur");
		ts.add("Mahesh");
		ts.add("Akash");
		ts.add("Maharashtra");
		ts.add("India");
        //ts.add(null);
        
        System.out.println(ts);
        System.out.println(ts.isEmpty());
		System.out.println(ts.contains("India"));
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts);
		System.out.println("=============================");
		
       Iterator it= ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}System.out.println("=============================");
		
		
		for(Object o:ts)
		{
			System.out.println(o);
		}


		
		
		
		
		
		
		

	}

}
