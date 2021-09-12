package Day8Day9;

import java.util.HashMap;
import java.util.Set;
public class CreateSetMapContainMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(10, "ts");
		hs.put(20, "rc");
		hs.put(30, "rv");
		hs.put(40, "kp");
		hs.put(50, "kk");
		System.out.println(hs);
		Set s=hs.entrySet();
		System.out.println("Set Values:"+s);
}

}
