package BinarySearchAlgorithm;

import java.util.Scanner;

//This code will check weather order is ascending or descending and will apply logic if array is asc or dscaccordingly
public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
		Scanner scn = new Scanner(System.in);
	System.out.println("Enter the target element: ");
	int target = scn.nextInt();
		
		System.out.println("The target element is at index: " + orderAgnosticBS(array, target));
	}
	static int orderAgnosticBS(int[] array, int target) {
		
		int start = 0;
		int end = array.length-1;
		/*find whether the array is sorted in ascending or descending order
		Convininent way is to make comparison between first and last element*/
		boolean isAsc=array[start]<array[end];
		

		while (start <= end) {
			// So as to keep mid within range of int
			int mid = start + (end - start) / 2;
			if(target==array[mid]) {
				return mid;
			}
			if(isAsc) {
			if (target > array[mid]) {
				start= mid + 1;
			} else if (target < array[mid]) {
				end = mid-1;
			}
			}else {
				if (target < array[mid]) {
					start= mid + 1;
				} else if (target > array[mid]) {
					end = mid-1;
				}
			}
		}
		return -1;

	}
}
