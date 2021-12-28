//To identify if a problem is of binary search sorted arrays in asc or desc or hint regard this will be given in question
package BinarySearchAlgorithm;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here we are not concerned about sorting array in ascending or decending
		// order,we take sorted arrays
		int array[] = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
		Scanner scn = new Scanner(System.in);
	System.out.println("Enter the target element: ");
	int target = scn.nextInt();
		
		System.out.println("The target element is at index: " + binarySearchLogic(array, target));

	}

	static int binarySearchLogic(int[] array, int target) {
		int start = 0;
		int end = array.length-1;
		
		

		while (start <= end) {
			// So as to keep mid within range of int
			int mid = start + (end - start) / 2;
			if (target > array[mid]) {
				start= mid + 1;
			} else if (target < array[mid]) {
				end = mid-1;
			} else {
				return mid;
			}
			
		}
		return -1;

	}

}
