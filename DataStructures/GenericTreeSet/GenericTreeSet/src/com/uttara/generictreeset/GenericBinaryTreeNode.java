package com.uttara.generictreeset;

public class GenericBinaryTreeNode<T extends Comparable<T>>{
	
	private T data;
	private GenericBinaryTreeNode<T> left = null;
	private GenericBinaryTreeNode<T> right = null;
	
	
	public GenericBinaryTreeNode() {
		
	}
	
	
	/**
	 * @param data
	 */
	public GenericBinaryTreeNode(T data) {
		super();
		this.data = data;
	}
	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	/**
	 * @return the left
	 */
	public GenericBinaryTreeNode<T> getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(GenericBinaryTreeNode<T> left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public GenericBinaryTreeNode<T> getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(GenericBinaryTreeNode<T> right) {
		this.right = right;
	}


}
