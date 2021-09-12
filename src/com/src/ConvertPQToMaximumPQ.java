package Day8Day9;

import java.util.PriorityQueue;

public class ConvertPQToMaximumPQ {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(100);
		pq.add(200);
		pq.add(300);
		pq.add(400);
		pq.add(500);
		System.out.println("Priority Queue Elements"+pq);
		Integer val = null;
		System.out.println("Maximum PQ:");
		while( (val = pq.poll()) != null) {
			System.out.print(val+"  ");
		}
		System.out.print("\n");
		 
	}

}
