package thanveer;
import java.util.Scanner;
public class Reversestring
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String to Check: ");
String str=sc.nextLine();
ReverseString rs = new ReverseString();
System.out.println(rs.reverseString(str));
}
}
class ReverseString
{
public String reverseString(String str)
{
if(str.isEmpty())
{
return str;
}
else
{
return reverseString(str.substring(1))+str.charAt(0);
}
}
}
