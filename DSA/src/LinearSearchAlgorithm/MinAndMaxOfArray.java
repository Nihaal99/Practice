package LinearSearchAlgorithm;

public class MinAndMaxOfArray {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,-4,7,9,-15};
		System.out.println("The min value of array is:"+" "+minOfArray(nums));
		System.out.println("The max value of array is:"+" "+maxOfArray(nums));
		
	}
	     //Method for minimum of array
		 static int minOfArray(int[] nums) {
			 int min=nums[0];
			 for(int element:nums) {
				 if(element<min) {
					 min=element;
				 }
				 
				 
			 }
			 return min;
		 }
		 //Method for maximum of array
		 static int maxOfArray(int[] nums) {
			 int max=nums[0];
			 for(int element:nums) {
				 if(element>max) {
					 max=element;
				 }
				 
				 
			 }
			 return max;
		 }

	}


