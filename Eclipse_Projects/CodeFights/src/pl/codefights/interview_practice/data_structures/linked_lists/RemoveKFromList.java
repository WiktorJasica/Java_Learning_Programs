package pl.codefights.interview_practice.data_structures.linked_lists;

/*
 * Note: Try to solve this task in O(n) time using O(1) additional space, where n is the number of elements in the list, 
 * since this is what you'll be asked to do during an interview.

Given a singly linked list of integers l and an integer k, remove all elements from list l that have a value equal to k.

Example

For l = [3, 1, 2, 3, 4, 5] and k = 3, the output should be
removeKFromList(l, k) = [1, 2, 4, 5];
For l = [1, 2, 3, 4, 5, 6, 7] and k = 10, the output should be
removeKFromList(l, k) = [1, 2, 3, 4, 5, 6, 7].
Input/Output

[execution time limit] 3 seconds (java)

[input] linkedlist.integer l

A singly linked list of integers.

Guaranteed constraints:
0 ≤ list size ≤ 105,
-1000 ≤ element value ≤ 1000.

[input] integer k

An integer.

Guaranteed constraints:
-1000 ≤ k ≤ 1000.

[output] linkedlist.integer

Return l with all the values equal to k removed.
 */
public class RemoveKFromList {

	public static void main(String[] args) {
		
		
	}

	ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {

		ListNode<Integer> temp = new ListNode<>(0);
	    temp.next = l;
	    ListNode<Integer> head = temp;
	    
	    while(head.next != null){
	        if(head.next.value == k){
	            head.next = head.next.next;
	        } else {
	            head = head.next;
	        }
	    }
	    return temp.next;
		
	}

}
