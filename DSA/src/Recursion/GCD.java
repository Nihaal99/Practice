

package Recursion;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		GCD v=new GCD();
		int value=v.gcd(a, b);
		System.out.println(value);

	}
	public int gcd(int a,int b) {
		if(a<0 || b<0)
			return -1;
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}

}
