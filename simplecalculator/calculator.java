package simplecalculator;

import java.util.*;
import java.lang.*;

//addition.................
class addition
{
Scanner s = new Scanner(System.in);
int num1,num2,sum;
void add()
{
System.out.println("\n\nEnter the 1st number : ");
int a = s.nextInt();

System.out.println("\n\nEnter the 2nd number : ");
int b = s.nextInt();

num1=a;
num2=b;
sum=a+b;
}
void display()
{
System.out.println("\n\nThe addition oof two numbers is "+sum);
}
}

//subtraction...................
class subtraction
{
Scanner s = new Scanner(System.in);
int num1,num2,subtract;
void sub()
{
System.out.println("\n\nEnter the 1st number : ");
int a = s.nextInt();

System.out.println("\n\nEnter the 2nd number : ");
int b = s.nextInt();

num1=a;
num2=b;
subtract=a-b;
}
void display()
{
System.out.println("\n\nThe subtraction oof two numbers is "+subtract);
}
}

//multiplication.......................
class multiplication
{
Scanner s = new Scanner(System.in);
int num1,num2,multiply;
void mul()
{
System.out.println("\n\nEnter the 1st number : ");
int a = s.nextInt();

System.out.println("\n\nEnter the 2nd number : ");
int b = s.nextInt();

num1=a;
num2=b;
multiply=a*b;
}
void display()
{
System.out.println("\n\nThe product oof two numbers is "+multiply);
}
}

//division.......................
class division
{
Scanner s = new Scanner(System.in);
int num1,num2,divide;
void div()
{
System.out.println("\n\nEnter the 1st number : ");
int a = s.nextInt();

System.out.println("\n\nEnter the 2nd number : ");
int b = s.nextInt();

num1=a;
num2=b;
divide=a/b;
}
void display()
{
System.out.println("\n\nThe division oof two numbers is "+divide);
}
}

public class calculator {
	public static void main(String []args)
	{

	Scanner s = new Scanner(System.in);
	do
	{
	System.out.println("__________________________________________________________________________________________________________");
	System.out.println("\n\nChoose the opertion you want to perform (1 // 2 // 3// 4 // 5)");
	System.out.print("\n\n1. Addition\n2.Sutration\n3. Multiplication\n4. Division\n5. Exit\n\n Choose any number : ");
	int option = s.nextInt();

	switch(option)
	{
	case 1 :
	         addition a1 = new addition();
	         a1.add();
	         a1.display();
	break;
	case 2 :
	 subtraction a2 = new subtraction();
	  a2.sub();
	         a2.display();
	break;
	case 3 :
	 multiplication a3 = new multiplication();
	a3.mul();
	         a3.display();
	break;
	case 4 :  division a4 = new division();
	a4.div();
	         a4.display();
	break;
	case 5 :  System.exit(0);
	break;
	}

	}while(true);
	}
}
