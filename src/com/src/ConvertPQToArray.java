package Day8Day9;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ConvertPQToArray {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(100);
		pq.add(200);
		pq.add(300);
		pq.add(400);
		pq.add(500);
		System.out.println("Priority Queue Elements"+pq);
		List al=new ArrayList(pq);
		System.out.println("Array Elements:"+al);

	}

}
