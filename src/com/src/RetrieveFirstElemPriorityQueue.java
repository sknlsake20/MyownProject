package Day8Day9;

import java.util.PriorityQueue;

public class RetrieveFirstElemPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(100);
		pq.add(200);
		pq.add(300);
		pq.add(400);
		pq.add(500);
		System.out.println(pq);
		System.out.println("First Element Retreive in PriorityQueue:"+pq.peek());

	}

}
