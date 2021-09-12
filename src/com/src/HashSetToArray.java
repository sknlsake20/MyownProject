package Day8Day9;

import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("ts");
		hs.add("kp");
		hs.add("kk");
		hs.add("rv");
		hs.add("rc");
		System.out.println("HashSet Elements:"+hs);
		String[] new_array = new String[hs.size()];
	    hs.toArray(new_array);
	    System.out.println("Array elements: ");
	    for(String element : new_array){
	    	System.out.println(element);
		}
	}

}
