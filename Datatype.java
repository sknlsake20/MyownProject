import java.util.Scanner;

public class Datatype {

	public static void main(String[] args) {
	   byte b;
       short s;
       int i;
       long l;
       float f;
       double d;
       String str;
       char c;
       Scanner sc=new Scanner(System.in);
       System.out.println("Entre a byte");
       b=sc.nextByte();
       System.out.println(b);
       System.out.println("Entre a short");
       s=sc.nextShort();
       System.out.println(s);
       System.out.println("Entre a int");
       i=sc.nextInt();
       System.out.println(i);
       System.out.println("Entre a long");
       l=sc.nextLong();
       System.out.println(l);
       System.out.println("Entre a float");
       f=sc.nextFloat();
       System.out.println(f);
       System.out.println("Entre a double");
       d=sc.nextDouble();
       System.out.println(d);
       System.out.println("Entre a String");
       str=sc.nextLine();
       System.out.println(str);
       c=sc.next().charAt(0);
       System.out.println(c);
       

	}

}
