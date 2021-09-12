package com.src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMarks {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(12,"Ta",99,98,100,297));
		al.add(new Student(13,"selvi",56,67,67,190));
		al.add(new Student(15,"ab",78,56,89,223));
		al.add(new Student(17,"cd",78,32,56,166));
		al.add(new Student(14,"ef",78,56,52,186));
		al.add(new Student(18,"gh",52,78,56,186));
		al.add(new Student(19,"ij",90,98,89,277));
		al.add(new Student(11,"kl",92,89,78,259));
		al.add(new Student(16,"mn",42,30,45,117));
		Student s=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(s);
		List<Student> l=al.stream().sorted((i1,i2)->((Student)i1).name.length()>((Student)i2).name.length()?-1:1).collect(Collectors.toList());
		System.out.println(l);
		List<Student> l1=al.stream().sorted((i1,i2)->((Student)i1).total/3>((Student)i2).total/3?-1:1).collect(Collectors.toList());
		System.out.println(l1);
	}

}
class Student implements Comparable{
	int sid;
	String name;
	int mathmark,sciencemark,socialmark;
	int total;
	
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", mathmark=" + mathmark + ", sciencemark=" + sciencemark
				+ ", socialmark=" + socialmark + ", total=" + total + "]";
	}



	public Student(int sid, String name, int mathmark, int sciencemark, int socialmark, int total) {
		super();
		this.sid = sid;
		this.name = name;
		this.mathmark = mathmark;
		this.sciencemark = sciencemark;
		this.socialmark = socialmark;
		this.total = total;
	}



	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		return (s.total>this.total)?-1:1;
		
	}
	
	
}
