package TimeComplexity;

public class SumAndProductOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Time Complexity
		int sum=0;//O(1)
		int product=1;//O(1)
		int[] array= {1,2,3,4};
		for(int i=0;i<array.length;i++) {//O(n)
			sum+=array[i];//O(1)
			product*=array[i];//O(1)
		
		}
		System.out.println(sum+" "+product);//O(1)

	}

}
//Time Complexity=O(n) Overall.