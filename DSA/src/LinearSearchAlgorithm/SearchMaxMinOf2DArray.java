package LinearSearchAlgorithm;

import java.util.Arrays;

public class SearchMaxMinOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2D array creation
		int[][] nums= {
				{23,4,1},
				{125,12,3,9},
				{78,99,34,56},
				{18,15}
		};
		int target=34;
		//To print array containing row and column of matched element
		System.out.println(Arrays.toString(getIndexOfSearchElement(nums,target)));
		//Printing boolean match or not
		System.out.println(searchElement(nums,target));
		System.out.println("Max value is:"+" "+maxIn2DArray(nums));
		System.out.println("Min value is:"+" "+minIn2DArray(nums));
	}
	
	//Boolean Method for search element in 2D array
	static boolean searchElement(int[][] nums,int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				if(nums[i][j]==target) {
					return true;
				}
			}
			
		}
		return false;
	}
	
	//Method to search and get index of matched element
	static int[] getIndexOfSearchElement(int[][] nums,int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				if(nums[i][j]==target) {
					return new int[]{i,j};
					/*//Aliter to return 1D array for understanding		
					int[] arr= {i,j};
					return arr;*/
					
				}
			}
	}
		return new int[] {-1,-1};
		/*//Aliter to return 1D array for understanding
		int[] ar= {-1,-1};
		return ar;*/
	}
	//Method to get minimum value from 2D-array
   static int maxIn2DArray(int[][] nums) {
	   int max=Integer.MIN_VALUE;//Integer.MIN_VALUE is minimum value of integer
	   for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				if(nums[i][j]>max) {
					max=nums[i][j];
					
				}
			}
			}
	   return max;
   }
 //Method to get maximum value from 2D-array
   static int minIn2DArray(int[][] nums) {
	   int min=Integer.MAX_VALUE;//Integer.MIN_VALUE is minimum value of integer
	   for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				if(nums[i][j]<min) {
					min=nums[i][j];
					
				}
			}
			}
	   return min;
   }
}

	


