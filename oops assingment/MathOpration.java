import java.util.Scanner;
class MathOpration
{
	static void add(int a, int b)
	{
		int sum = a+b;
		
		System.out.println("sum = "+sum);
	}
	
	static void subtract(int a, int b)
	{
		int sub = a-b;
		
		System.out.println("sub = "+sub);
	}
	static void multiply(int a, int b)
	{
		int mul = a*b;
		
		System.out.println("mul = "+mul);
	}
	static void power(int a, int b)
	{
		double pow= Math.pow(a,b);
		
		System.out.println("pow = "+pow);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first number: ");
		int a= sc.nextInt();
		System.out.println("Enter second number: ");
		int b= sc.nextInt();
		
		MathOpration.add(a,b);
		MathOpration.subtract(a,b);
		MathOpration.multiply(a,b);
		MathOpration.power(a,b);
	}
}