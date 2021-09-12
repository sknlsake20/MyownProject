import java.util.Scanner;

public class Day {
	public static void main(String args[]) {
		System.out.println("Enter a day:");
		Scanner sc=new Scanner(System.in);
		String day=sc.nextLine();
		switch (day) {
		case "sunday":
			System.out.println(day+": is a first day");
			break;
		case "monday":
			System.out.println(day+": is a second day");
			break;
		case "tuesday":
			System.out.println(day+": is a third day");
			break;
		case "wednesday":
			System.out.println(day+": is a fourth day");
			break;
		case "thursday":
			System.out.println(day+": is a fifth day");
			break;
		case "friday":
			System.out.println(day+": is a sixth day");
			break;
		case "saturday":
			System.out.println(day+": is a seventh day");
			break;
		default:
			System.out.println("Invalid...");
			break;
		}
	}
}
