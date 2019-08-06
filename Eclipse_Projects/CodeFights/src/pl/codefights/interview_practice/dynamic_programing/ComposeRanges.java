package pl.codefights.interview_practice.dynamic_programing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComposeRanges {

	public static void main(String[] args) {

		int[] tab = { -1, 0, 1, 2, 6, 7, 9 };

		String[] result = composeRanges(tab);

		for (String s : result) {
			System.out.print(s + " ");
		}
	}

	public static String[] composeRanges(int[] nums) {

		int left = 0, right = 0;
		String[] result = null;
		List<String> range = new ArrayList<>();
		
		 if(nums.length==1){
	          result = new String[1];
	          result[0] = ""+nums[0];
	        return result;
	     }
		
		for (int i = 1; i < nums.length; i++) {
			
			if(nums[i]-nums[i-1]==1) {
				right++;
				if(i==nums.length-1) {
					range.add(nums[left]+"->"+nums[right]);
				}
			}
			if(nums[i]-nums[i-1]!=1) {
				if(left==right) {
				range.add(nums[left]+"");
				left=i;
				right=i;
				}
				if(left!=right) {
					range.add(nums[left]+"->"+nums[right]);
					left=i;
					right=i;
				}
			}
			if((i==nums.length-1)&&(nums[i]-nums[i-1]!=1)) {
				range.add(nums[i]+"");
			}
		}
		
		result = range.toArray(new String[range.size()]);

		return result;
	}
}
