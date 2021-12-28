package BinarySearchAlgorithm;

import java.util.Arrays;

public class SearchIn2DSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Strictly sorted array
		int[][] nums= {{3,8,10,15},{17,18,23,25},{27,29,32,35},{37,41,43,45}};
		int target=15;
		System.out.println(Arrays.toString(logic(nums,target)));

	}
static int[] logic(int[][] nums,int target) {
	int row=0;
	int column=nums[row].length-1;
	//This while condition will ensure row and column to remain in valid range so as to avoid array index out of bound exception
	while(row<nums.length && column>=0) {
		if(target>nums[row][column]) {
			row++;
		}else if(target<nums[row][column]) {
			//Binary search in that row
			column=binarySearchIn2DArray(nums,target,row,column);
		} else {
			int[] ans= {row,column};
			return ans;
		}
	}
	int[] ans= {-1,-1};
	return ans;
}
static int binarySearchIn2DArray(int[][] nums,int target,int row,int column) {
	int start=0;
	while(start<=column) {
		int mid=start+(column-start)/2;
		if(target>nums[row][mid]) {
			start=mid+1;
		}else if(target<nums[row][mid]) {
			column=mid-1;
		}else {
			return mid;
			
		}
	}
	return -1;
}
}
