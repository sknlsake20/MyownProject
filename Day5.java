package mohil;
import java.util.*;
public class Cars {
public static void main(String[] args) {
CarRace cr=new CarRace();
Thread t1=new Thread(new Runnable(){
public void run()
{
cr.petrol_point();
cr.piston_point();
}
});
Thread t2=new Thread(new Runnable(){
public void run()
{
cr.petrol_point();
cr.piston_point();
}
});
Thread t3=new Thread(new Runnable(){
public void run()
{
cr.petrol_point();
cr.piston_point();
}
});
Thread t4=new Thread(new Runnable(){
public void run()
{
cr.petrol_point();
cr.piston_point();
}
});
Thread t5=new Thread(new Runnable(){
public void run()
{
cr.petrol_point();
cr.piston_point();
}
});
Thread t6=new Thread(new Runnable(){
public void run()
{
cr.petrol_point();
cr.piston_point();
}
});
Thread t7=new Thread(new Runnable(){
public void run()
{
	cr.petrol_point();
	cr.piston_point();
	}
	});
	Thread t8=new Thread(new Runnable(){
	public void run()
	{
	cr.petrol_point();
	cr.piston_point();
	}
	});
	t1.setName("Petronas");
	t2.setName("Ferrari");
	t3.setName("Lamborghini");
	t4.setName("Benz");
	t5.setName("BMW");
	t6.setName("Massarati");
	t7.setName("Citron");
	t8.setName("Audi");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	t6.start();
	t7.start();
	t8.start();
	}
	}
	class CarRace
	{
	int ctr1=1,ctr2=1,ctr3=1;
	synchronized void petrol_point()
	{
	for(int i=0;i<=100;i++)
	{
	if(i==100)
	{
	System.out.println("The "+ctr1+"st Car Rechead Petrol Point is: "+Thread.currentThread().getName());
	ctr1++;
	try {
	Thread.sleep(200);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
	}
	}
	synchronized void piston_point()
	{
	for(int i=0;i<=100;i++)
	{
		if(i==100)
		{
		System.out.println("The "+ctr2+"st Car Rechead piston Point is: "+Thread.currentThread().getName());
		ctr2++;
		notifyAll();
		}
		}
		}
	}
