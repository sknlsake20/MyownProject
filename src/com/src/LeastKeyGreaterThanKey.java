package Day8Day9;

import java.util.TreeMap;

public class LeastKeyGreaterThanKey {

	public static void main(String[] args) {
		TreeMap<Integer,String> ts=new TreeMap<Integer,String>();
		ts.put(10, "ts");
		ts.put(20, "rc");
		ts.put(30, "rv");
		ts.put(40, "kp");
		ts.put(50, "kk");
		System.out.println(ts);
		System.out.println(ts.ceilingEntry(15));
		System.out.println(ts.ceilingEntry(32));
	}

}
