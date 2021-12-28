package BinarySearchAlgorithm;

/*It is opposite of Ceiling of number
largest element of an array less than or equal to target
eg. if target is 15 then it will return 14*/
public class FloorOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 14;
		System.out.println("The index of answer is: "+Logic(array, target));
	}

	static int Logic(int[] array, int target) {
		int start = 0;
		int end = array.length - 1;
		//If my target element is greater than the largest number in an array
		if(target>array[array.length-1])
			return -1;

		while (start <= end) {
			// So as to keep mid within range of int
			int mid = start + (end - start) / 2;
			if (target > array[mid]) {
				start = mid + 1;
			} else if (target < array[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}

		}

		/*
		 * Only we need to return end in this case where in Ceiling of a number we need
		 * to return start
		 */
		return end;

	}
}
