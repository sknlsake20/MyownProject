package Day8Day9;

import java.util.ArrayList;

public class PrintAllUsePosElem {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		System.out.println("ArrayElements:"+al);
		for(int i=0;i<al.size();i++) {
			System.out.println(i+" - Position Of Element:"+al.get(i));
		}

	}

}
