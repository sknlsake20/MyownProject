package Day8Day9;

import java.util.TreeSet;

public class GetElemInTreeSetLesser {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(100);
		ts.add(200);
		ts.add(300);
		ts.add(400);
		ts.add(500);
		System.out.println(ts);
		System.out.println("Lesser : "+ts.lower(200));

	}

}
