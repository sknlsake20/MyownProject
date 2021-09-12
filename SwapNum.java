
public class SwapNum {
	int a=30;
	static int b=20;
	public static void main(String[] args) {
		SwapNum s=new SwapNum();
		System.out.println("Swapping before:"+s.a+" "+b);
		s.a=s.a+b;
		b=s.a-b;
		s.a=s.a-b;
		System.out.println("Swapping after:"+s.a+" "+b);

	}

}
