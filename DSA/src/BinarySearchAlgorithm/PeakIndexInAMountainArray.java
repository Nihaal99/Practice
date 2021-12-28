package BinarySearchAlgorithm;

public class PeakIndexInAMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {24,69,75,99,79,78,67,36,26,19};
		System.out.println(PeakIndex(arr));

	}
	static int PeakIndex(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while (start <= end) {
			// So as to keep mid within range of int
			int mid = start + (end - start) / 2;
			if (arr[mid-1] > arr[mid]) {
				end=mid-1;
			} else if (arr[mid+1]>arr[mid]) {
				start = mid+1;
			} else {
				return mid;
			}
			
		}
		return -1;

	
	}

}
