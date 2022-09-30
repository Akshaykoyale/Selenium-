package Collection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudy {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		
		al.add("Akshay");
		al.add("Koyale");
		al.add('A');
		al.add(25);
		al.add(1995);
		al.add(174.5f);
		al.add(null);
		al.add(null);
		al.add(true);
		al.add(78+"Kg");
		al.add("Hi");
		al.add("Hello");
		
		System.out.println(al);
		System.out.println(al.size());
	    System.out.println(al.get(0));
	    System.out.println(al.get(5));
		System.out.println(al.indexOf("Hello"));
		System.out.println(al.lastIndexOf("Koyale"));
		System.out.println(al.contains("Akshay"));
		System.out.println(al.contains("akshay"));
		System.out.println(al.remove(4));
		al.add(1, "Pune");
		System.out.println(al);
		System.out.println(al.remove("Pune"));
		System.out.println(al);
		System.out.println("=============================");
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println("=============================");
		
		for(int i=0; i<=10; i++) {
			System.out.println(al.get(i));
		}
		System.out.println("=============================");
		
		for(int i=10; i>=al.size()-11; i--) {
			System.out.println(al.get(i));
		}
		System.out.println("=============================");
		
		Iterator it= al.iterator();
	   while(it.hasNext())
		   {
		   System.out.println(it.next());
	   }
	   System.out.println("=============================");
	  
	   for(Object o:al)
		{
			System.out.println(o);
		}

	}

}
