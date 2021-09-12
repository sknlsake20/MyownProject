package Day8Day9;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ConvertPQToString {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add("ts");
		pq.add("rc");
		pq.add("rv");
		pq.add("rk");
		pq.add("kk");
		System.out.println("Priority Queue Elements"+pq);
		String str=pq.toString();
		System.out.println("String Elements:"+str);

	}

}
