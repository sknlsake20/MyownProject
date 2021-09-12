package day3assignment;
import java.util.Scanner;

public class Employee1 {
	String name[]=new String[10000];
    String town[]=new String[10000];
    int age[]=new int[10000];
    int salary[]=new int[10000];
    private int i=0;
    void add(String name,String town,int age,int salary)
    {
    	this.name[i]=name;
    	this.town[i]=town;
    	this.age[i]=age;
    	this.salary[i]=salary;
    	i++;
    }
    int addnew(int n)
    {
    	System.out.println("Please add new employee details...");
    	Scanner sce=new Scanner(System.in);
    	this.name[n]=sce.next();
    	this.town[n]=sce.next();
    	this.age[n]=sce.nextInt();
    	this.salary[n]=sce.nextInt();
    	System.out.println("New employee added..");
    	i=++n;
    	return n++;
    }
    int delete(int a,int n)
    {
    	for(int j=a;j<n-1;j++)
    	{
    		name[j]=name[j+1];
    		town[j]=town[j+1];
    		age[j]=age[j+1];
    		salary[j]=salary[j+1];
    	}
    	i=n-1;
    	return n-1;
    }
    void updatename(int c)
    {
    	System.out.println("Please update emp name....");
    	Scanner scc=new Scanner(System.in);
    	name[c]=scc.next();
    	System.out.println("Emp name updated...");
    }
    void updatetown(int c)
    {
    	System.out.println("Please update emp town....");
    	Scanner scc=new Scanner(System.in);
    	town[c]=scc.next();
    	System.out.println("Emp town updated...");
    }
    void updateage(int c)
    {
    	System.out.println("Please update emp age....");
    	Scanner scc=new Scanner(System.in);
    	age[c]=scc.nextInt();
    	System.out.println("Emp age updated...");
    }
    void updatesalary(int c)
    {
    	System.out.println("Please update emp salary....");
    	Scanner scc=new Scanner(System.in);
    	salary[c]=scc.nextInt();
    	System.out.println("Emp salary updated...");
    }
    void updateall(int c)
    {
    	System.out.println("Please update all emp details....");
    	Scanner scc=new Scanner(System.in);
    	name[c]=scc.next();
    	town[c]=scc.next();
    	age[c]=scc.nextInt();
    	salary[c]=scc.nextInt();
    	System.out.println("All emp details updated...");
    }
    void display(int total)
    {
    	for(int k=0;k<total;k++)
    	{
    		System.out.println("Emp name:"+name[k]+"|"+"Emp town:"+town[k]+"|"+"Emp age:"+age[k]+"|"+"Emp salary:"+salary[k]+"|");
    	}
    }
    void exit()
    {
    	System.exit(0);
    }
    
	public static void main(String[] args) {
		
		int a,b,c;
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Employee1 t=new Employee1();
		   for(int i=0;i<n;i++)
		   {
		 
			   System.out.println("Enter employee detail:");
			   t.add(sc.next(),sc.next(),sc.nextInt(),sc.nextInt());
		   }
		   System.out.println("1. addnew employee");
		   System.out.println("2. delete employee");
		   System.out.println("3. edit employee");
		   System.out.println("4. display all employee");
		   System.out.println("5. exit");

		   System.out.println("Choose from above menu");
		   int m=sc.nextInt();
		   if(m==1)
		   {
			   n=t.addnew(n);
			   System.out.println("new employee added..and now total no of employee is:"+n);
			   t.display(n);
		   
		   }
		   else if(m==2)
		   {
			   System.out.println("Enter a position of a employee to delete.......");
			   a=sc.nextInt();
			   n=t.delete(a,n);
			   System.out.println("Employee deleted successfully...and now total no of employee is:"+n);
			   t.display(n);
		   }
		else if(m==3)
		{
		  System.out.println("1.Update emp name");
		  System.out.println("2.Update emp town");
		  System.out.println("3.Update emp age");
		  System.out.println("4.Update emp salary");
		  System.out.println("5.Update all");
		 
		  System.out.println("Choose from above:");
		  b=sc.nextInt();
		  if(b==1)
		  {
		  System.out.println("Enter a position of a emp name to update...");
		  c=sc.nextInt();
		  t.updatename(c);
		  }
		  else if(b==2)
		  {
		  System.out.println("Enter a position of a emp town to update...");
		  c=sc.nextInt();
		  t.updatetown(c);
		  }
		  else if(b==3)
		  {
		  System.out.println("Enter a position of a emp age to update...");
		  c=sc.nextInt();
		  t.updateage(c);
		  }
		  else if(b==4)
		  {
		  System.out.println("Enter a position of a emp salary to update...");
		  c=sc.nextInt();
		  t.updatesalary(c);
		  }
		  else
		  {
		  System.out.println("Enter a position of a emp to update all emp details...");
		  c=sc.nextInt();
		  t.updateall(c);
		  }
		  t.display(n);
		}
		else if(m==4)
		{
		 t.display(n);
		}
		else
		{
		t.exit();
		}

	}

		

	

}
