package Day8Day9;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateAllElemArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
