package Arrays;

import java.util.Arrays;

public class SwapMaxReverseMethodsForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {12,4,5,2,7};
		System.out.println("Original array value is:"+" "+Arrays.toString(nums));
		//Calling swap function in main method
		swap(nums,1,2);
		//Printing all array values in the console
		System.out.println("Array value after swapping is:"+" "+Arrays.toString(nums));
		//Printing return values provided by methods in console
		System.out.println("Maximum value in array is:"+" "+max(nums));
		System.out.println("Maximum value of  array when range is provided is:"+" "+maxRange(nums,1,3));
		reverseArray(nums);
		System.out.println("Reverse of array is:"+" "+Arrays.toString(nums));

	
		}
	
	
	//Method for swap
	static void swap(int[] nums,int index1,int index2) {
		int temp=nums[index1];
		nums[index1]=nums[index2];
		nums[index2]=temp;

	}
	
	
	//Method to get max value
	static int max(int[] nums) {
		int max=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
			
		}
	return(max);
	}
	
	
	//Method to get max value from index range provided
	static int maxRange(int[] nums,int start,int end) {
		//edge case
		if(start>end) {
			return -1;
		}
		//edge case
		if(nums.length==0) {
			return -1;
		}
		
		int max=0;
		for(int i=start;i<=end;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
			
		}
	return(max);
		
	}
	
	//optimum logic by two pointer 
	static void reverseArray(int[] nums) {
		int start=0;
		int end=nums.length-1;
		while(start<end) {
		swap(nums,start,end);
		start++;
		end--;
		}
	}
	//My initial logic
	/*//Method to reverse an array
	static int[] reverseArray(int[] nums) {
		int temp=0;
		
		int n=nums.length/2;
		if(nums.length%2==1) {
		for(int i=0;i<=n;i++) {
			temp=nums[i];
			nums[i]=nums[nums.length-i-1];
			nums[nums.length-i-1]=temp;
			
		}
		
		}else if(nums.length%2==0) {
			for(int i=0;i<n;i++) {
				temp=nums[i];
				nums[i]=nums[nums.length-i-1];
				nums[nums.length-i-1]=temp;
				
			}
			
		}else {
			System.out.println("invalid array length provided");
		}
		
	return nums;
	}*/

}
