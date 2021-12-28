package BinarySearchAlgorithm;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This array is not strictly sorted
		int[][] nums= {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
		int target=49;
        System.out.println("Index of target element is: "+Arrays.toString(binarySearchIn2DArray(nums,target)));
	}
	//O(n) time complexity
	static int[] binarySearchIn2DArray(int[][] nums,int target){
		int row=0;
		int column=nums[row].length-1;
		int[] ans={-1,-1};
		while(row<nums.length && column>=0) {
			if(target<nums[row][column]) {
				column--;
			}else if(target>nums[row][column]) {
				row++;
			}else {
				ans[0]=row;
				ans[1]=column;
				return ans;
			}
		}
		return ans;
	}
	

}
