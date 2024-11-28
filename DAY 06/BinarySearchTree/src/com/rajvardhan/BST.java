package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value) {
			data = value;
			left = right = null;
		}
	}
	
	private Node root;
	public BST() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void addNode(int value) {
		//1. create node for given value
		Node newnode = new Node(value);
		//2. if BST is empty
		if(root == null)
			// add newnode into root itself
			root = newnode;
		//3. if BST is not empty
		else {
			//3.1 create trav reference and start at root
			Node trav = root;
			while(true) {
				//3.2 if value is less than current node data
				if(value < trav.data) {
					//3.2.1 if left of current node is empty
					if(trav.left == null) {
						// add newnode into left of current node
						trav.left = newnode;
						break;
					}
					//3.2.2 if left of current node is not empty
					else
						// go into one left
						trav = trav.left;
				}
				//3.3 if value is greater or equal than current node data
				else {
					//3.3.1 if right of current node is empty
					if(trav.right == null) {
						// add newnode into rigth of current node
						trav.right = newnode;
						break;
					}
					//3.3.2 if right of current node is not empty
					else
						// go into one right
						trav = trav.right;
				}
			}//3.4 repeat step 3.2 and 3.3 untill node is added into BST
		}
	}
	
		
	public Node[] binarySearchWithParent(int key) {
		//1. create trav and start at root
		Node trav = root;
		Node parent = null;
		while(trav != null) {
			//2. compare key with current node data
			if(key == trav.data)
				// if key is equal return true
				break;
			parent = trav;
			//3. if key is less than current data, go into left
			if(key < trav.data)
				trav = trav.left;
			//4. if key is greater than current data, go into right
			else
				trav = trav.right;
		}// 5. repeat till leaf nodes
		//6. if key is not found
		if(trav == null)
			parent = null;
		Node arr[] = new Node[] {trav, parent};
		return arr;
	}
	
	public void deleteNode(int key) {
		//1. search node to be deleted along with its parent
		Node arr[] = binarySearchWithParent(key);
		Node temp = arr[0], parent = arr[1];
		//2. if node is not found
		if(temp == null)
			return;
		//3. if node is having two childs
		if(temp.left != null && temp.right != null) {
			//1. find predecessor of temp
			Node pred = temp.left;
			parent = temp;
			while(pred.right != null) {
				parent = pred;
				pred = pred.right;
			}
			//2. replace value of predecessor into temp
			temp.data = pred.data;
			//3. move temp of predecessor to delete space of predecessor
			temp = pred;
		}
		//4. if node is having single child (right child)
		if(temp.left == null) {
			if(temp == root)
				root = temp.right;
			else if(temp == parent.left)
				parent.left = temp.right;
			else if(temp == parent.right)
				parent.right = temp.right;
		}
		//5. if node is having single child (left child)
		if(temp.right == null) {
			if(temp == root)
				root = temp.left;
			else if(temp == parent.left)
				parent.left = temp.left;
			else if(temp == parent.right)
				parent.right = temp.left;
		}
	}
	
	private int height(Node trav) {
		//1. if sub tree is absent return -1
		if(trav == null)
			return -1;
		//2. find height of left sub tree
		int hl = height(trav.left);
		//3. find height of right sub tree 
		int hr = height(trav.right);
		//4. find the max height
		int max = hl > hr ? hl : hr;
		//5. add 1 to max height and return
		return max + 1;
	}
	
	public int height() {
		return height(root);
	}
	
	public void deleteAll() {
		root = null;
	}
	
}













