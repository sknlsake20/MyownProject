
public class StudentDetailsBusiness {
	int rollno,age,math,phy,chem;  
	double total,totalmarks,average;
	String name;
	static final int noofsubjects=3;
    public void display()
    {
        System.out.println("StudentRollno:"+rollno+"  " +"StudentName:"+name+"  "+"StudentAge:"+age+" "+"StudentMathMark:"+math+" "+
    "StudentPhyMark:"+phy+" "+"StudentChemMark:"+chem);
    }
    public double total() {
    	return math+phy+chem;
    }
    public double avg(double totalmarks) {
    	return totalmarks/noofsubjects;
    	
    }
    public void grade(double avg)
    {
        if(avg>75.0)
        {
            System.out.println("A grade");
        }
        else if(avg<=75 && avg>65)
        {
            System.out.println("B grade");
        }
        else if(avg<=65 && avg>35)
        {
            System.out.println("C grade");
        }
        else
        {
            System.out.println("D grade");
        }
    }
}
