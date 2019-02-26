package com.datastructures;

class Node{
	int data;
	Node link;
	
	Node(int data){
		this.data = data;
	}
}

public class LinkedList {
	Node head;
	
	public void add(int data) {
		
		Node n1=new Node(data);
		//if linked list is empty
		if(head == null) {
			head = n1;
		} else {
			Node last = head;
			while(last.link != null) {
				last = last.link;
			}
			last.link = n1;
		}
		
		
	}
	private int peek() {
		if(head == null) {
			System.out.println("No elements are there in list");
			return -1;
		} else {
			return head.data;
		}
	}
	private int poll() {
		if(head == null) {
			System.out.println("No elements are there in list");
			return -1;
		} else {
			int temp = head.data;
			head= head.link ;
			return temp;
		}
	}
	private int removeLast() {
		if(head == null) {
			System.out.println("No elements to remove");
			return -1;
		} else {
			Node temp = head;
			Node removeNode=head;
			while(temp.link != null) {
				removeNode = temp;
				temp=temp.link;
			}
			removeNode.link = null;
			int value = temp.data;
			return value;
		}
	}
	private void printAll() {
		Node temp= head;
		if(head == null) {
			System.out.println("List is empty");
		} else {
			while(temp.link != null) {
				System.out.print(temp.data+" ");
				temp=temp.link;
			}
			System.out.print(temp.data);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		LinkedList list =new LinkedList();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(16);
		list.add(17);
		list.add(18);
		System.out.println("Printing all added elements");
		list.printAll();
		System.out.println("Implementing peek method");
		int peekelement = list.peek();
		System.out.println(peekelement);
		System.out.println("Printing elements after calling peek method");
		list.printAll();
		System.out.println("Implementing poll method");
		int pollelement = list.poll();
		System.out.println(pollelement);
		System.out.println("Printing elements after calling poll method");
		list.printAll();
		System.out.println("Implementing remove last method");
		System.out.println(list.removeLast());
		System.out.println("Printing elements after calling remove last method");
		list.printAll();
	}
}
