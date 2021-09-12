package com.src;

import java.util.Comparator;
import java.util.TreeSet;

public class Barcode {
		public static void main(String[] args) {
			    TreeSet ts=new TreeSet(new Things(0,0,null));
				ts.add(new Things(10,100,"ts"));
				ts.add(new Things(20,300,"rc"));
				ts.add(new Things(30,500, "rv"));
				ts.add(new Things(40,400, "kp"));
				ts.add(new Things(50, 350,"kk"));
			    System.out.println(ts);

		}

}
class Things implements Comparator{
		int barcode;
		int price;
		String name;
		public Things(int barcode, int price, String name) {
			super();
			this.barcode = barcode;
			this.price = price;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Things [barcode=" + barcode + ", price=" + price + ", name=" + name + "]";
		}
		public int compare(Object o1, Object o2) {
			Things t1=(Things)o1;
			Things t2=(Things)o2;
			if(t1.barcode>t2.barcode) {
				return -1;
			}
			else if(t1.barcode<t2.barcode){
				return 1;
			}
			return 0;
		}
		
	}




