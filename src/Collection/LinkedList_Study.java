package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Study {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add('A');
		ll.add("Akshay");
		ll.add("Koyale");
		ll.add(25);
		ll.add(1995);
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(25));
		System.out.println(ll.indexOf("Koyale"));
		System.out.println(ll.lastIndexOf("Akshay"));
		System.out.println(ll.get(5));
		ll.add(1, 15);
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		ll.set(0, "Latur");
		System.out.println(ll);
		System.out.println("==============================================");
		
		Iterator it =ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}System.out.println("==============================================");
		
		ListIterator li = ll.listIterator();
		while(li.hasNext()){
			System.out.println(li.next());
		}System.out.println("==============================================");
		
		for(int i=0; i<=ll.size()-1; i++) {
			System.out.println(ll.get(i));
				}
		
		System.out.println("=======================");
		for(Object o:ll) {
			System.out.println(o);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
