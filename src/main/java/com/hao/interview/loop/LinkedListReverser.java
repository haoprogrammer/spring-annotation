package com.hao.interview.loop;

import com.hao.interview.common.Node;
import com.hao.interview.recursion.LinkedListCreator;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: haoprogrammer
 * @date: 2019/5/25 22:26
 * @version: 1.0
 */
public class LinkedListReverser {


  /**
   * @description:
   * @param: []
   * @return: void
   * @auther: haoprogrammer
   * @date: 2019/5/26 20:50
   */
  public Node linkedListReverser(Node head){
    Node newHead = null;
    Node currentHead = head;

    //loop Invariant
    //newHead points to the linkedList already reversed
    //currentHead points to the linkedList not yet reversed
    while(currentHead != null){
      //loop invariant holds
      Node next = currentHead.getNext();
      currentHead.setNext(newHead);
      newHead = currentHead;
      currentHead = next;

    }
    return newHead;

  }

  public static void main(String[] args) {

    LinkedListCreator creator = new LinkedListCreator();
    LinkedListReverser reverser = new LinkedListReverser();
    Node.printLinkedList(
        reverser.linkedListReverser(creator.createLargeLinkedList(5)));
    Node.printLinkedList(
        reverser.linkedListReverser(creator.createLargeLinkedList(0)));
    Node.printLinkedList(
        reverser.linkedListReverser(creator.createLargeLinkedList(100)));

    reverser.linkedListReverser(creator.createLargeLinkedList(1000000));
    System.out.println("done");
  }
}

