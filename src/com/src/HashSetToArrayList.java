package Day8Day9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class HashSetToArrayList {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("ts");
		hs.add("kp");
		hs.add("kk");
		hs.add("rv");
		hs.add("rc");
		System.out.println("HashSet Elements:"+hs);
		List<String> as=new ArrayList<String>(hs);
		System.out.println("ArrayList Elements:");
		for(String name:as) {
			System.out.println(name);
		}
		

	}

}
