package L1;

import java.util.Scanner;

public class calculator {
	
	
	static void method() {
		Scanner sc=new Scanner(System.in);
		System.out.println();
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
			System.out.println("result "+a+"%"+b+"= "+(double)(a%b));
			break;
	
		default:
			System.out.println("error: wrong input");
			break;
		}
	}
		
		public static void main(String[] args) {
			Scanner scr=new Scanner(System.in);
			System.out.println("calculator");
			
			while(true) {
				method();
				System.out.println();
				System.out.println("type 0 (quit) || any (1-9) continue !");
				int res =scr.nextInt();
				if (res==0) {
					break;
				}
				if (res!=0 ) {
					System.out.println("...");
					
				}
				
				
				
			}
			
			
	}
}
