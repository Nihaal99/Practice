package Recursion;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int pow=scn.nextInt();
		PowerOfNumber pon=new PowerOfNumber();
		int value=pon.powOfNo(n,pow);
		System.out.println(value);
		

	}
	public int powOfNo(int n,int pow) {
		if(pow==0)
			return 1;
		if(pow<0 || n<0)
			return-1;
		return n*powOfNo(n,pow-1);
	}

}
