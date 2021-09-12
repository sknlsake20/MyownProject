package Day8Day9;

import java.util.TreeSet;

public class RetrieveRemoveFirstElemTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(100);
		ts.add(200);
		ts.add(300);
		ts.add(400);
		ts.add(500);
		System.out.println(ts);
		System.out.println("First Element :"+ts.first());
		System.out.println(ts);
		System.out.println("First element removed:"+ts.pollFirst());
		System.out.println("First Element after remove :"+ts);
	}

}
