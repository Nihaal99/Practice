package Recursion;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		SumOfDigits sod=new SumOfDigits();
		int value=sod.sumOfDigits(n);
		System.out.println(value);

	}
	public int sumOfDigits(int n) {
		if(n==0 || n<0)
			return 0;
		return n%10+sumOfDigits(n/10);
	}

}
