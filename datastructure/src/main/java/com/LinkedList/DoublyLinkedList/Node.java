package com.LinkedList.DoublyLinkedList;

public class Node {

	int data;
	protected Node prevNode, nextNode;
	
public Node(){
	prevNode = null;
	nextNode = null;
	data = 0;
}

public Node(int d, Node prv, Node nxt ){
	prevNode = prv;
	nextNode = nxt;
	data = d;
}
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(Node prevNode) {
		this.prevNode = prevNode;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	
	
}
