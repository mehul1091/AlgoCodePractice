package com.m.LinkedList;

public class LinkedList {
	
	private int data;
	private LinkedList next;
	
	public LinkedList(int d) {
		this.data = d;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LinkedList getNext() {
		return next;
	}

	public void setNext(LinkedList next) {
		this.next = next;
	}
	
	public static void main(String[] args) {
		
		//Creating Linked List with elements
		LinkedList firstNode = new LinkedList(2);
		LinkedList secondNode = new LinkedList(7);
		LinkedList thirdNode = new LinkedList(11);
		LinkedList fourthNode = new LinkedList(16);
		
		LinkedList head = firstNode;
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = fourthNode;
		fourthNode.next = null;
		
		System.out.println("size of the List is: " + printTheList(head));
	}

	private static int printTheList(LinkedList head) {
		LinkedList temp;
		temp = head;
		int size = 0;
		while (temp != null) {
			System.out.print(temp.getData());
			
			if (temp.getNext() != null) {
				System.out.print("-->");
			}
			temp = temp.getNext();
			size++;
		}
		System.out.println();
		return size;
	}
}
