package com.capg.datastructures;

public class MyLinkedList {

	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/**
	 * UC2 Adding elements in a Linked List
	 * 
	 * @param newNode
	 */
	public void add(INode newNode) {

		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	/**
	 * UC3 Appending elements in a Linked List
	 * 
	 * @param newNode
	 */
	public void append(INode newNode) {

		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	/**
	 * UC4 Inserting elements between two nodes
	 * 
	 * @param myNode
	 * @param newNode
	 */
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	/**
	 * UC5 Deleting the first element from a linked list
	 * @return
	 */
	public INode deleteFirst() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
}
