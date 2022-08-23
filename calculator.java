package L1;

import java.util.Scanner;

public class calculator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("give operator type ( + , - , / , % , *)?");
		String operator = sc.next();
		System.out.println("input first number:");
		double a =sc.nextDouble();
		System.out.println("input second number:");
		double b=sc.nextDouble();
		
		switch (operator)
		{
		case "+":
			System.out.println(a+"+"+b+"= "+ (double)(a+b));
			break;
		case "-":
			System.out.println(a+"-"+b+"= "+(double)(a-b));
			break;
		case "/":
			System.out.println(a+"/"+b+"= "+(double)(a/b));
			break;
		case "*":
			System.out.println(a+"*"+b+"= "+(double)(a*b));
			break;
		case "%":
			System.out.println(a+"%"+b+"= "+(double)(a%b));
			break;
		
		default:
			System.out.println("error: wrong input");
			break;
		}
	}

}
