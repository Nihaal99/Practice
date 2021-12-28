package BinarySearchAlgorithm;

public class SearchInRotatedSortedArrayLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,3};
		int target=1;
System.out.println(search(nums,target));
	}
	
	public static int search(int[] nums, int target) {
        int start = 0;
		int end = nums.length-1;
        
        //Calling pivotElement method to find the index of pivot element in array.
        int pivot=pivotElement(nums,start,end);//1
        //Reassigning start and end value for input to binarySearchLogic method.
        start=0;
        end=nums.length-1;
        if(nums.length!=1){
        if(target>nums[pivot]){
            return -1;
        }else if( target<=nums[nums.length-1]){
            start=pivot+1;
            
           }else{
            end=pivot;
            }
        }
        
         return binarySearchLogic(nums,target,start,end);
        
    }
    
    //Pivot index finding
        static int pivotElement(int nums[],int start,int end){
            if(nums.length==1){
                return 0;
            }
     int mid = start + (end - start) / 2;
        while(nums[mid]<nums[mid+1]){
           
            start=mid+1;
             mid = start + (end - start) / 2;
        }
        return mid;
        }
		
		//Binary Search Function
    static int binarySearchLogic(int[] nums, int target,int start,int end) {
	while (start <= end) {
			// So as to keep mid within range of int
			int mid = start + (end - start) / 2;
			if (target > nums[mid]) {
				start= mid + 1;
			} else if (target < nums[mid]) {
				end = mid-1;
			}else{
                return mid;
            } 
		}
		return -1;

	}

}
