package pl.codefights.core.allthecrossroads;

public class KnapsackLight {

	public static void main(String[] args) {
		System.out.println(knapsackLight(4, 3, 3, 4, 4));
	}
	
	public static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {

	    int currentWeight = weight1 + weight2;
	    int maxVal= value1+value2;
	    
	    if((maxW<weight1) && (maxW<weight2)){
	        return 0;
	    }
	    if(currentWeight>maxW){
	        if(maxW<weight1){
	            return value2;
	        }
	        if(maxW<weight2){
	            return value1;
	        }
	        if((weight1<=maxW) && (weight2<=maxW)){
	            if(value1>value2){
	                return value1;
	            }
	            else{
	                return value2;
	            }
	        }
	    }
	    return maxVal;
	}
}
