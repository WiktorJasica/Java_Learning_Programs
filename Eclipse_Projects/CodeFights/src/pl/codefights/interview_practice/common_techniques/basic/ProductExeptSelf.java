package pl.codefights.interview_practice.common_techniques.basic;

public class ProductExeptSelf {
	
	public static void main(String[] args) {
		int[] nums= {52, 40, 2, 78, 49, 70, 39, 26, 58, 58, 52, 93, 80, 64, 33, 72, 29, 17, 81, 83, 48, 9, 49, 82, 67, 76, 54, 64, 6, 48, 16, 82, 67, 56, 32, 98, 14, 47, 48, 26, 56, 54, 80, 13, 32, 18, 4, 73, 45, 65};
		int m=530;
		System.out.println(productExeptSelf(nums, m));
		
	}

	public static long productExeptSelf(int[] nums, int m) {
		int n=nums.length;
		long f[] = new long[n];
		long sum = 0;
		
	    
	    for(int i=0; i<nums.length; i++){
	        f[i]=1;
	        for(int j=0;j<nums.length;j++){
	            if(i==j){
	                continue;
	            }
	            f[i]=((f[i]*nums[j])%m);
	        }
	    }
	    System.out.println();
	    for(long i:f) {
	    	System.out.print(i+" ");
	    }

	    
	    for(long i:f) {
	    	sum+=i;
	    }
		System.out.println(sum);
		return sum%m;
	}
}
