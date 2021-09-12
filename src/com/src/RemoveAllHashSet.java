package Day8Day9;

import java.util.HashSet;

public class RemoveAllHashSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("ts");
		hs.add("kp");
		hs.add("kk");
		hs.add("rv");
		hs.add("rc");
		System.out.println(hs);
		hs.clear();
		System.out.println("Remove All in hashset : "+hs);

	}

}
