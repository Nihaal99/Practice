package LinearSearchAlgorithm;

public class SearchByRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={18,12,-7,3,14,28};
		int start=1;
		int end=4;
		int target=-7;
		System.out.println(searchByRange(nums,start,end,target));
	}
		static boolean searchByRange(int[] nums,int start,int end,int target) {
			if(nums.length==0) {
				return false;
			}
			for(int i=start;i<=end;i++) {
				if(nums[i]==target) {
					return true;
				}
			}
			return false;
		}
		
		
		
		

	

}
