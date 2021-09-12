package day12;

import java.util.function.IntFunction;

public class MultipleOfThreeAndFive {
	public static void main(String[] args) {
		IntFunction fi=(o1)->
		{
			if(o1%3==0 && o1%5!=0)
			{
				return "Fizz";
			}
			else if(o1%3!=0 && o1%5==0)
			{
				return "Buzz";
			}
			else if(o1%3==0 && o1%5==0)
			{
				return "FizzBuzz";
			}
			else
			{
				return o1;
			}
		};
		System.out.println(fi.apply(9));
		System.out.println(fi.apply(20));
		System.out.println(fi.apply(15));
		System.out.println(fi.apply(8));

	}
}
