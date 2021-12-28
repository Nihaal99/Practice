package BinarySearchAlgorithm;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Original array int[] nums= {3,7,15,18,19,21,25,29};
		 *  When rotated by k=2
		 * It becomes array given in question
		 * In the question we need to find target in
		 * rotated sorted array and return -1 if target is not present
		 */
		int[] nums = { 15, 18, 19, 21, 25, 29, 3, 7 };
		int k = 2;
		int target = 29;
		System.out.println(Logic(nums, k, target));

	}

	static int Logic(int[] nums, int k, int target) {
		int start = 0;
		int end = nums.length - 1;
		if (target <= nums[nums.length - 1]) {
			start = nums.length - k;
		} else {
			end = nums.length - k - 1;
		}
		return binarySearch(nums, target, start, end);

	}

	static int binarySearch(int[] nums, int target, int start, int end) {

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
