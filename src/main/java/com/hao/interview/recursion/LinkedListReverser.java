package com.hao.interview.recursion;

import com.hao.interview.common.Node;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: haoprogrammer
 * @date: 2019/5/23 21:24
 * @version: 1.0
 */
public class LinkedListReverser {


  /**
   * @description: reverses a linked list
   * @param: [head] the linked list to reverse
   * @return: com.hao.interview.common.Node head of the reversed linked list
   * @auther: haoprogrammer
   * @date: 2019/5/23 21:34
   */
  public Node reverseLinkedList(Node head){
    //size == 0
    if (head == null){
      return null;
    }
    //size == 1
    if (head.getNext() == null){
      return head;
    }


    Node newHead = reverseLinkedList(head.getNext());
    //第二个节点的下一跳指向头
    head.getNext().setNext(head);
    head.setNext(null);
    return newHead;

  }


  public static void main(String[] args) {
    LinkedListCreator creator = new LinkedListCreator();
    LinkedListReverser reverser = new LinkedListReverser();
    Node.printLinkedList(reverser.reverseLinkedList(
        creator.createLinkedList(new ArrayList<Integer>())));
    Node.printLinkedList(reverser.reverseLinkedList(
        creator.createLinkedList(Arrays.asList(1))));
    Node.printLinkedList(reverser.reverseLinkedList(
        creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5))));

  }

}