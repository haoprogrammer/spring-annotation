package com.hao.interview.loop;

import com.hao.interview.common.Node;
import com.hao.interview.recursion.LinkedListCreator;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: haoprogrammer
 * @date: 2019/5/27 14:27
 * @version: 1.0
 */
public class LinkedListDeletor {

  public Node deleteEquals(Node head, int value) {
    Node prev = head;
    //Loop invariant:
    //list nodes from head up to prev has been processed
    //(Nodes with values equals to value are deleted)

    while (head != null && head.getValue() == value) {
      head = head.getNext();
    }

    if (head == null) {
      return null;
    }

    while (prev.getNext() != null) {

      if (prev.getNext().getValue() == value) {
        //delete it
        prev.setNext(prev.getNext().getNext());
      } else {
        prev = prev.getNext();
      }

    }
    return head;
  }


  public static void main(String[] args) {
    LinkedListDeletor linkedListDeletor = new LinkedListDeletor();
    LinkedListCreator creator = new LinkedListCreator();
    Node.printLinkedList(
        linkedListDeletor.deleteEquals(creator.createLinkedList(Arrays.asList(1,2,3)),2));
    Node.printLinkedList(
        linkedListDeletor.deleteEquals(creator.createLinkedList(Arrays.asList(2,2,3)),2));
    Node.printLinkedList(
        linkedListDeletor.deleteEquals(creator.createLinkedList(new ArrayList<Integer>()),2));
  }

}