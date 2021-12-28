//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package BinarySearchAlgorithm;

import java.util.Arrays;

public class FirstAndLastPositionInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,7,7,8,8,10};
		int target=7;
		int[] ans=searchRange(nums,target);
		System.out.println(Arrays.toString(ans));

	}

	    
		   public static int[] searchRange(int[] nums, int target){
		        int[] ans={-1,-1};
		        //this will call binarySearch method and the value returned by it will be stored in 0th index of ans array
		        ans[0]=binarySearch(nums,target,true);
		        
		        //if start index is not present then there is no logic of end index that's why below check
		        if(ans[0]!=-1){
		        ans[1]=binarySearch(nums,target,false);
		        }
		        return ans;
		    }
		    
		    
		    
		    //For getting starting and end range we are calling below function twice in searchRange method
		    static int binarySearch(int[] nums,int target,boolean StartIndex){
		        int start=0;
		        int end=nums.length-1;
		        
		           int ans=-1;
		        while(start<=end){
		         
		        int mid=start+(end-start)/2;
		            if(target<nums[mid]){
		                end=mid-1;
		            }else if(target>nums[mid]){
		                start=mid+1;
		                }
		            
		            else{
		                ans=mid;
		                //applying binary search again by reassigning value of start and end after searching target for first time
		                if(StartIndex){
		                    end=mid-1;
		                    
		                }else{
		                    start=mid+1;
		                }
		            }
		      
		    }
		        return ans;
		    }
		}


