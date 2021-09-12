import java.util.Scanner;

public class CheckPosNeg {
	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		
		if(num1>0) {
			System.out.println(num1+" is a positive");
			if(num1%2==0) {
				System.out.println(num1+" is a even number also");
			}
			else if(num1%2!=0){
				System.out.println(num1+" is a odd number also");
			}
		}
		else{
			System.out.println(num1+" is a negative");
			if(num1%2==0) {
				System.out.println(num1+" is a even number also");
			}
			else if(num1%2!=0){
				System.out.println(num1+" is a odd number also");
			}
		}

	}

}
