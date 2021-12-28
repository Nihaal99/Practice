package BinarySearchAlgorithm;
//Ceiling=smallest element in an array greater than or equal to target
public class CeilingOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,3,5,9,14,16,18};
		int target=4;
		System.out.println(Logic(array,target));
		}
	
	static int Logic(int[] array,int target) {
		int start=0;
		int end=array.length-1;
		
		
		

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
			
	
		
		return start;
	
	}
}
