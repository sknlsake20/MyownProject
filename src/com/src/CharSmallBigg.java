import java.util.Scanner;
public class CharSmallBigg {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of characters: ");
		int n=sc.nextInt(); 
		char[] a=new char[n];
		System.out.println("Enter a character: ");
		for(int i=0;i<n;i++) {
			a[i]=Character.toLowerCase((sc.next().charAt(0)));
		}
		System.out.println();
		char min='z';
		for(int j=0;j<n;j++) {
			if(a[j]<min) {
				min=a[j];
			}
			
		}
		System.out.println(min+" is a smallest character");
		char max='a';
		for(int j=0;j<n;j++) {
			if(a[j]>max) {
				max=a[j];
			}
		}
		System.out.println(max+" is a biggest character");
			
		sc.close();
	};

}

		

