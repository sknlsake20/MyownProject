package Day8Day9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("ts");
		hs.add("kp");
		hs.add("kk");
		hs.add("rv");
		hs.add("rc");
		System.out.println("HashSet Elements:"+hs);
		Set<String> ts=new TreeSet<String>(hs);
		System.out.println("TreeSet Elements:");
		for(String name:ts) {
			System.out.println(name);
		}
		

	}

}
