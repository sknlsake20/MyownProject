package Day8Day9;

import java.util.HashMap;

public class MapContainsMappingSpecifyValue {

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(10, "ts");
		hs.put(20, "rc");
		hs.put(30, "rv");
		hs.put(40, "kp");
		hs.put(50, "kk");
		System.out.println(hs);
		if(hs.containsValue("rv")) {
			System.out.println("Yes it contains");
		}
		else {
			System.out.println("Not contains");
		}

	}

}
