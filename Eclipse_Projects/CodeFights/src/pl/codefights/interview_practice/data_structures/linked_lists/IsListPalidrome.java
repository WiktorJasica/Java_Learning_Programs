package pl.codefights.interview_practice.data_structures.linked_lists;

/*
 * Try to solve this task in O(n) time using O(1) additional space, where n is the number
 *  of elements in l, since this is what you'll be asked to do during an interview.

Given a singly linked list of integers, determine whether or not it's a palindrome.

Example

For l = [0, 1, 0], the output should be
isListPalindrome(l) = true;
For l = [1, 2, 2, 3], the output should be
isListPalindrome(l) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] linkedlist.integer l

A singly linked list of integers.

Guaranteed constraints:
0 ≤ list size ≤ 5 · 105,
-109 ≤ element value ≤ 109.

[output] boolean

Return true if l is a palindrome, otherwise return false.
 */
public class IsListPalidrome {

	public static void main(String[] args) {
		
	}
	
	
	// Definition for singly-linked list:
	// class ListNode<T> {
	//   ListNode(T x) {
//	     value = x;
	//   }
	//   T value;
	//   ListNode<T> next;
	// }
	//
	static boolean isListPalindrome(ListNode<Integer> l) {
		
		ListNode<Integer> current = l;
	    ListNode<Integer> rev = null;
	    
	    while(current != null) {

	        ListNode<Integer> newNode = new ListNode<>(current.value); 
	        newNode.next = rev;
	        rev = newNode; 
	                
	        current = current.next;
	    }
	    
	    ListNode<Integer> temp = l;
	    while(temp != null) {
	        if((long) temp.value != (long)rev.value) {
	            return false;
	        }
	        temp = temp.next;
	        rev = rev.next;
	        
	    }
	    return true;
		
	}
}
