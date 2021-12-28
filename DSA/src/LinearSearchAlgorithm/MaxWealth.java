package LinearSearchAlgorithm;
//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int accounts[][]={{2,8,7},{7,1,3},{1,9,5}};
		System.out.println("Maximum wealth is: "+maximumWealth(accounts));

	}
	
	    public static int maximumWealth(int[][] accounts) {
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<accounts.length;i++){
	                    int colsum=0;
	            for(int j=0;j<accounts[i].length;j++){
	                colsum+=accounts[i][j];
	            }
	            if(colsum>=max){
	                max=colsum;
	            }
	        }
	        return max;
	    }
	    
	}


