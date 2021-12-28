package TimeComplexity;

public class PrintPairsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] customarray= {1,2,3,4};
		PrintPairsOfArray printPairsOfArray=new PrintPairsOfArray();//instance of class in main method to call PrintPairs method.
		printPairsOfArray.PrintPairs(customarray);
	}
	void PrintPairs(int[]array) {
		for(int i=0;i<array.length;i++) {//O(n)
			for(int j=0;j<array.length;j++) {//O(n)
				if(i!=j)//O(1)
					System.out.println(array[i]+","+array[j]);	
			}
		}

	}

}
//Overall time complexity=O(n)*O(n)=O(n^2)(neglecting O(1) terms).