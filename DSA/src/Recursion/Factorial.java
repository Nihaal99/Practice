package Recursion;

import java.util.Scanner;

 class Factorial {
	 public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	Factorial recursion=new Factorial();
	int value=recursion.factorial(n);
	System.out.println(value);
	
	 }
	
	
	public int factorial(int n) {
		if(n<0) {
			return -1;
		}
		if(n==1 || n==0) {
			return 1;
		}
		return n*factorial(n-1);
	}

}
