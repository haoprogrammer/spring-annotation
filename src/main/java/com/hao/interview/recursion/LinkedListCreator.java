package com.hao.interview.recursion;

import com.hao.interview.common.Node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author: haoprogrammer
 * @date: 2019/5/23 16:00
 * @version: 1.0
 */
public class LinkedListCreator {


  /**
   * @description:
   * @param: [data]   the data to create the list
   * @return: com.hao.interview.common.Node 1. head of the linked list. 2. The returned linked
   * list ends with last node with getNext() == null
   * @auther: haoprogrammer
   * @date: 2019/5/23 17:08
   */
  public Node createLinkedList(List<Integer> data) {
    if (data.isEmpty()) {
      return null;
    }
    Node firstNode = new Node(data.get(0));

    //去掉第一号元素后剩下的所有元素
    Node headOfSublist = createLinkedList(data.subList(1, data.size()));
    firstNode.setNext(headOfSublist);
    return firstNode;
  }


  /**
   * @description:
   * @param: [size]
   * @return: com.hao.interview.common.Node
   * @auther: haoprogrammer
   * @date: 2019/5/26 21:06
   */
  public Node createLargeLinkedList(int size){

    Node prev = null;
    Node head = null;

    for (int i = 0; i <= size ; i++) {
      Node node = new Node(i);
      if(prev != null){
        prev.setNext(node);
      }else {
        head = node;
      }
      prev = node;
    }
    return head;
  }



  public static void main(String[] args) {
    LinkedListCreator creator = new LinkedListCreator();
    Node.printLinkedList(
        creator.createLinkedList(new ArrayList<Integer>()));
    Node.printLinkedList(
    creator.createLinkedList(Arrays.asList(1)));
    Node.printLinkedList(
    creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5)));

  }
}