
package Day8Day9;

import java.util.ArrayList;

public class ArrayListIsEmpty {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());

	}

}
