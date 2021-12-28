package BinarySearchAlgorithm;

import java.util.Arrays;

//Amazon
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class PositionOfAnElementInInfiniteSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Assuming the array to be infinite sorted array where we don't know the end of
		 * array As we don't know the size of array,here we will find the target by
		 * taking smallest box and then increasing the box size considering box size of
		 * two and then incrementing size of box by multiples of two
		 */
		int[] nums = { 2, 5, 8, 12, 14, 17, 18, 19, 26, 28, 31, 34, 35, 37, 49, 107, 108, 112 };
		int target = 49;
		System.out.println("The index of target element is:"+" "+ans(nums,target));

	}

	/*
	 * In this method we will check whether target element lies in a box and if not
	 * then we will find that element in next box and so on. When target is greater
	 * than end then move to next box
	 */
	public static int ans(int[] nums, int target) {
		int tempstart = 0;
		int end = 1;
		while (target > nums[end]) {

			int start = end + 1;
			// Formula:end=end+box*2
			end = end + (end - tempstart) * 2;
			/* While start will get modified in next while loop but for calculating end in
			 next loop we need previous loop start value so it will be stored in
			 tempstart*/
			tempstart = start;

		}
		/* When the box in which target is located is found,then we will apply binay
		 search to find target value index.*/
		return binarySearchLogic(nums, target, tempstart, end);
	}

	static int binarySearchLogic(int[] nums, int target, int start, int end) {

		while (start <= end) {
			// So as to keep mid within range of int
			int mid = start + (end - start) / 2;
			if (target > nums[mid]) {
				start = mid + 1;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}

		}
		return -1;

	}
}
