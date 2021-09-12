package Day8Day9;

import java.util.HashSet;

public class CompareRetainElemSameInBothSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("ts");
		hs.add("kp");
		hs.add("kk");
		hs.add("rv");
		hs.add("rc");
		System.out.println("First HashSet :"+hs);
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("ts");
		hs1.add("kp");
		hs1.add("pk");
		hs1.add("rv");
		hs1.add("rc");
		System.out.println("Second HashSet :"+hs1);
		hs.retainAll(hs1);
		System.out.println("Retains HashSet :"+hs);
	}

}
