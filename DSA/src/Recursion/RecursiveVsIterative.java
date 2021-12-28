package Recursion;

public class RecursiveVsIterative {
	//Recursive Method
	/*static int powerOfTwo(int n) {
		if(n==0){
			return 1;
			}
		else {
			int power=2*powerOfTwo(n-1);
			return power;
		}
		
	}*/


//Iterative Method
static int powerOfTwo(int n) {
	int i=0;
	int power=1;
	while(i<n) {
		power*=2;
		i=i+1;
	}
	return power;
}
}