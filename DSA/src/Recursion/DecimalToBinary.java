package Recursion;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		DecimalToBinary dtb=new DecimalToBinary();
		int value=dtb.decimalToBinary(n);
		System.out.println(value);

	}
	public int decimalToBinary(int n) {
		if(n==0)
			return 0;
		if(n<0)return -1;
		return (n%2)+10*decimalToBinary(n/2);
	}

}
