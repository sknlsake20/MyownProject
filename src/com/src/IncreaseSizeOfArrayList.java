package Day8Day9;

import java.util.ArrayList;

public class IncreaseSizeOfArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>(2);
		al.add(100);
		al.add(200);
		System.out.println(al);
		al.ensureCapacity(5);
		al.add(300);
		al.add(400);
		al.add(500);
		System.out.println(al);

	}

}
