package Day8Day9;

import java.util.HashSet;

public class CompareTwoHashSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("ts");
		hs.add("kp");
		hs.add("kk");
		hs.add("rv");
		hs.add("rc");
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("ts");
		hs1.add("kp");
		hs1.add("pk");
		hs1.add("rv");
		hs1.add("rc");
		HashSet<String> result=new HashSet<String>();
		for(String name:hs1) {
			System.out.println(hs.contains(name)?"Yes":"No");
		}
	}

}
