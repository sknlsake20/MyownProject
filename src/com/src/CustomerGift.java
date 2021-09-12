package com.src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerGift {
	public static void main(String args[]) {
		
	
	ArrayList<customer> al=new ArrayList();
	al.add(new customer(12,"Tamil",4000));
	al.add(new customer(15,"Selvi",8000));
	al.add(new customer(11, "pqr",8900));
	
	al.add(new customer(58, "mno",6700));
	
	al.add(new customer(45, "jkl",7900));
	
	al.add(new customer(89, "ghi",2400));
	
	al.add(new customer(98, "def",3900));
	//TreeSet ts=new TreeSet(al);
	//System.out.println(ts);
	//System.out.println(ts.first());
	long result=al.stream().filter(o->((customer)o).amount>5000).count();
	System.out.println(result);
	//al.stream().sorted((o1,o2)->((customer)o1).amount>((customer)o2).amount)?-1:1);
	//System.out.println();
	customer c=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(c);
}
}
	
class customer implements Comparable{
	int cid;
	String cname;
	double amount;
	
	public customer(int cid, String cname, double amount) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "customer [cid=" + cid + ", cname=" + cname + ", amount=" + amount + "]";
	}

	@Override
	public int compareTo(Object o) {
		customer c=(customer)o;
		
		return (c.cid>this.cid)?1:-1;
	}
	
	
	
}
