
public class StudentDetailsMain {

	public static void main(String[] args) {
		StudentDetailsBusiness be=new StudentDetailsBusiness();
		   be.rollno=10;
		   be.name="Tamil";
		   be.age=21;
		   be.math=90;
		   be.phy=80;
		   be.chem=50;
		   be.display();
		   be.totalmarks=be.total();
		   be.average=be.avg(be.totalmarks);
		   System.out.println(StudentDetailsBusiness.noofsubjects);
		   System.out.println(be.totalmarks);
		   System.out.println(be.average);
		   be.grade(be.average);
		   
		   

	}

}
