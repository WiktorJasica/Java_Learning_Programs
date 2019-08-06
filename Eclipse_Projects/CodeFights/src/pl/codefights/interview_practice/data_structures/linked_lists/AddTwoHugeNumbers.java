package pl.codefights.interview_practice.data_structures.linked_lists;


/*
 * You're given 2 huge integers represented by linked lists. Each linked list element 
 * is a number from 0 to 9999 that represents a number with exactly 4 digits. 
 * The represented number might have leading zeros. 
 * Your task is to add up these huge integers and return the result in the same format.

Example

For a = [9876, 5432, 1999] and b = [1, 8001], the output should be
addTwoHugeNumbers(a, b) = [9876, 5434, 0].

Explanation: 987654321999 + 18001 = 987654340000.

For a = [123, 4, 5] and b = [100, 100, 100], the output should be
addTwoHugeNumbers(a, b) = [223, 104, 105].

Explanation: 12300040005 + 10001000100 = 22301040105.

Input/Output

[execution time limit] 3 seconds (java)

[input] linkedlist.integer a

The first number, without its leading zeros.

Guaranteed constraints:
0 ≤ a size ≤ 104,
0 ≤ element value ≤ 9999.

[input] linkedlist.integer b

The second number, without its leading zeros.

Guaranteed constraints:
0 ≤ b size ≤ 104,
0 ≤ element value ≤ 9999.

[output] linkedlist.integer

The result of adding a and b together, returned without leading zeros in the same format.
 */
public class AddTwoHugeNumbers {
	
	public static void main(String[] args) {

		
	}

	public static ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {
		
		String stNr1 = "0";
	    String stNr2 = "0";
	    String temp = "0";
	    String temp1 = "0";
	    
	    ListNode<Integer> nr1 = new ListNode<Integer> (null);
	    ListNode<Integer> nr2 = new ListNode<Integer> (null);
	    ListNode<Integer> nr3 = new ListNode<Integer> (null);
	    
	    nr1=a;
	    nr2=b;
	    
	    stNr1 = nr1.value.toString();
	    nr1=nr1.next;
	    stNr2 = nr2.value.toString();
	    nr2=nr2.next;
	    
	    while(nr1!=null){
	        
	        temp=nr1.value.toString();
	        int length = temp.length();
	        
	        if(length==1){
	            for(int  i=0; i<3;i++){
	                temp="0"+temp;
	            }
	        }
	        if(length==2){
	            for(int  i=0; i<2;i++){
	                temp="0"+temp;
	            }
	        }
	        if(length==3){
	            for(int  i=0; i<1;i++){
	                temp="0"+temp;
	            }
	        }
	        
	        stNr1=stNr1+temp;
	        nr1=nr1.next;
	    }
	    
	    while(nr2!=null){
	        
	        temp1=nr2.value.toString();
	        int length = temp1.length();
	        
	        if(length==1){
	            for(int  i=0; i<3;i++){
	                temp1="0"+temp1;
	            }
	        }
	        if(length==2){
	            for(int  i=0; i<2;i++){
	                temp1="0"+temp1;
	            }
	        }
	        if(length==3){
	            for(int  i=0; i<1;i++){
	                temp1="0"+temp1;
	            }
	        }
	        
	        stNr2=stNr2+temp1;
	        nr2=nr2.next;
	    }
	    
	    Long sum = Long.valueOf(stNr1) + Long.valueOf(stNr2);
	    
	    String strSum = sum.toString();
	    char strSumChar[] = strSum.toCharArray();
	    String strNode = null;
	    
	    for(int i=strSumChar.length-1; i>0; i--){
	        strNode = strNode + strSumChar[i];
	        if(strNode.length()%4==0){
	            strNode.trim();
	            ListNode<Integer> next = new ListNode<Integer> (Integer.valueOf(strNode));
	            next.next=nr3;
	            nr3=next;   
	            strNode=null;
	        }
	    }
	    
	    return nr3;
	}
}
