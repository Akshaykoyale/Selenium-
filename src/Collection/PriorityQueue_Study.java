package Collection;

import java.util.PriorityQueue;

public class PriorityQueue_Study {

	public static void main(String[] args) {
	
		PriorityQueue pq = new PriorityQueue();
		
		pq.add("Akshay");
		pq.add("Koyale");
		pq.add("Latur");
		pq.add("Akshay");
		pq.add("Abhijit");
		pq.add("pune");
		
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq);
		
        pq.poll();
		System.out.println("remove method "+pq.remove());
		pq.poll();
		pq.poll();
		System.out.println(pq);
		


	}

}
