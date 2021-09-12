import java.util.Scanner;

public class EachDigitEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int i,j;
		int array[][] = new int[n][m];
    
        System.out.println("Enter "+n +" "+ m+" elements ");
        for(i=0; i < n; i++)
        {
        	for(j=0;j<m;j++) {
        		array[i][j] = sc.nextInt();
        	}
        }
        
        for(i=0; i < n; i++)
        {
        	for(j=0;j<m;j++) {
        		if(array[i][j]%2==0) {
        			System.out.println(array[i][j]+" is a even number");
        		}
        		else {
        			System.out.println(array[i][j]+" is a odd number");
        		}
        		System.out.println();
        	}
        	//System.out.println();
        }

	}

}
