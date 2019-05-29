package com.hao.interview.common;

/**
 * @author: haoprogrammer
 * @date: 2019/5/23 16:01
 * @version: 1.0
 */
public class Node {

  private final int value;

  private Node next;

  public Node(int value) {
    this.value = value;
    this.next = null;
  }

  public int getValue() {
    return value;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public static void printLinkedList(Node head) {
    while (head != null){
      System.out.print(head.getValue());
      System.out.print("  ");
      head = head.getNext();
    }
    System.out.println();

  }


}