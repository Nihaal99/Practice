package Recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		Fibonacci value=new Fibonacci();
		int v=value.fibonacci(n);
		System.out.println(v);

	}
	
	public int fibonacci(int n) {
		
		if(n<0)
			return -1;
		if(n==0 || n==1)
			return n;
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
