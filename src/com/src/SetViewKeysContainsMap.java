package Day8Day9;

import java.util.HashMap;
import java.util.Set;

public class SetViewKeysContainsMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(10, "ts");
		hs.put(20, "rc");
		hs.put(30, "rv");
		hs.put(40, "kp");
		hs.put(50, "kk");
		System.out.println(hs);
		Set s=hs.keySet();
		System.out.println("Key Sets Are:"+s);

	}

}
