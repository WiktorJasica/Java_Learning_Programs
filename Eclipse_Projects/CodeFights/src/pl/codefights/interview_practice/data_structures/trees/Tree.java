package pl.codefights.interview_practice.data_structures.trees;

public class Tree <T> {
	
	public T value;
	
	Tree(T x){
		value = x;
	}

	Tree<T> left;
	Tree<T> right;
}
