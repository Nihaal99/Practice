package LinearSearchAlgorithm;

import java.util.Arrays;

public class SearchInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Nihaal";
		char target='h';
		//Printing char array
		System.out.println(Arrays.toString(name.toCharArray()));
		//printing boolean if char matches or not
		System.out.println(searchInString2(name,target));
	}
	     //Aliter method
		/*static boolean searchInString1(String name,char target) {
			if(name.length()==0) {
				return false;
			}
			for(int i=0;i<name.length();i++) {
				if(target==name.charAt(i)) {
					return true;
				}
			}
			return false;
			
		}*/
	static boolean searchInString2(String name,char target) {
		if(name.length()==0) {
			return false;
		}
		//for each loop
		for(char  ch:name.toCharArray()) {
			if(target==ch) {
				return true;
			}
		}
		return false;
		
	}
		

	}


