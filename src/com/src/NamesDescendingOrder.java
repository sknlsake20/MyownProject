package com.src;

import java.util.Comparator;
import java.util.PriorityQueue;

public class NamesDescendingOrder {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue(new Mycomparator());
		pq.offer(new Employee(8500,"Tamil"));
		pq.offer(new Employee(3600,"Selvi"));
		pq.offer(new Employee(6400,"Kumari"));
		pq.offer(new Employee(9700,"Valli"));
		pq.offer(new Employee(5700,"Vini"));
		pq.offer(new Employee(5800,"Darsini"));
		System.out.println(pq);
	}

}
class Employee{
	double sal;
	String name;
	public Employee(double sal, String name) {
		this.sal = sal;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EmployeeSalary:"+sal+" EmployeeName:"+name;
	}
	
	
}
class Mycomparator implements Comparator{

	public int compare(Object o1, Object o2) {
		Employee e=(Employee)o1;
		Employee e1=(Employee)o2;
		if(e.name.compareTo(e1.name)>0) {
			return -1;
		}
		else if(e.name.compareTo(e1.name)<0) {
			return 1;
		}
		return 0;
		
	}
	
}


