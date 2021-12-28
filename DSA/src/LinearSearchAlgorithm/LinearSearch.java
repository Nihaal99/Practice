package LinearSearchAlgorithm;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,2,14,17};
		int target=17;
		//System.out.println("The index of matched number is:"+" "+linearSearch2(arr,target));
		System.out.println("The  matched number is:"+" "+linearSearch2(arr,target));
		}
	//Method for returning index of matched number
	/*static int linearSearch1(int[] arr,int target) {
		if(arr.length==0) {
			return -1;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			
			}
			
			}
		return -1;
		}*/
	//Method to return the matched element
	static int linearSearch2(int[] arr,int target) {
		for(int element:arr) {
			if(element==target) {
				return element;
			}
		
		}
		if(arr.length==0) {
			return -1;
		}
		return -1;
	}
	

}
