
public class operatorExample {
	public static void main(String args[]) {
		System.out.println("//------Arithmetic operators------//");
		System.out.println("Addition:"+(20+30));
		System.out.println("Subtraction:"+(30-20));
		System.out.println("Multiplication:"+(30*20));
		System.out.println("Division:"+(30/2));
		System.out.println("Reminder:"+(30%5));
		System.out.println("Division:"+(30/2));
		
		System.out.println("//Assignment operators//");
		int a=50;
		System.out.println("Assign"+a);
		
		System.out.println("//-------Relational operators-------//");
		System.out.println("Greater:"+(10>20));
		System.out.println("Lesser:"+(1<5));
		System.out.println("Greaterthanequal:"+(30>=20));
		System.out.println("Lessthanequal:"+(15<=12));
		System.out.println("Equalto:"+(20==20));

		System.out.println("//------Logical operators------//");
		boolean c=true;
		boolean d=false;
		System.out.println("Logicaland:"+(c && d));
		System.out.println("Logicalor:"+(c || d));
		System.out.println("Logicalnot:"+(c ^ d));
		
		System.out.println("//------Bitwise operators------//");
		int i=5;
		int j=7;
		System.out.println("Bitwiseand:"+(i & j));
		System.out.println("Bitwiseaor:"+(i | j));
		System.out.println("Bitwisenegotiation:"+(~i));
		
		System.out.println("//------shift operators------//");
		System.out.println("leftshift:"+(10 << 2));
		System.out.println("rightshift:"+(10 >> 2));
		
		System.out.println("//------conditional operators------//");
		System.out.println("conditional:"+(50>10?50:10));
		
	}

}
