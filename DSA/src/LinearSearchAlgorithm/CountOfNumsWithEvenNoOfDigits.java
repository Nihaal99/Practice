package LinearSearchAlgorithm;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class CountOfNumsWithEvenNoOfDigits {
	public static void main(String[] args) {
		int[] nums= {12,345,2,6,7896};
		//printing value obtained from countDigitsOfNumber method in main method
		System.out.println("The count of numbers with even number of digits in an array is:"+" "+countDigitsOfNumber(nums));
		
	}
	static int countDigitsOfNumber(int[] nums) {
		int count=0;
		//Iterating on each element of array by for each loop
		for(int num:nums) {
			//Calling findEven Method and if findEven returns true if statement will get executed and count will be increased
		if(findEven(num))
			count++;
		
		}
		return count;
	}
	
	
	static boolean findEven(int num) {
		//Calling countDigits method and storing the value returned by it in k
		int k=countDigits(num);
		//returning boolean 
			return k%2==0;
		
			
		
	}
	
	//Method to count digits of num 
	static int countDigits(int num) {
		int k=0;
		while(num!=0) {
			k++;
		num=num/10;
		}
		return k;
	}

	//Initial approach
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {12,345,2,6,7896};
		System.out.println("The count of numbers with even number of digits in an array is:"+" "+logic(nums));
	}
	static int logic(int[] nums) {
		int count=0;
		int k=0;
		for(int num:nums) {
			while(num!=0) {
				k++;
				num=num/10;
			}
			if(k%2==0) {
				count++;
			}
			k=0;
		}
		return count;

	}*/
}

