package com.hao.interview.tree;

/**
 * @author: haoprogrammer
 * @date: 2019/5/27 21:40
 * @version: 1.0
 */
public class InOrder {

  public TreeNode inOrderNext(TreeNode node){
    if (node.getRight() != null){
      return first(node.getRight());
    }else{
      while(node.getParent() != null && node.getParent().getLeft() != node ){
        node = node.getParent();
      }

      //node.getParent == null|| node is left child of its parent
      return node.getParent();
    }
  }


  public TreeNode first(TreeNode node){
    if(node == null){
      return null;
    }
    TreeNode curNode = node;

    while (curNode.getLeft() != null ){
      curNode = curNode.getLeft();
    }
    return curNode;
  }


  public void traverse(TreeNode root){
    for(TreeNode node = first(root); node != null; node = inOrderNext(node)){
      System.out.print(node.getValue());
    }
    System.out.println();
  }


  public static void main(String[] args) {
    TreeCreator creator = new TreeCreator();
    InOrder inOrder = new InOrder();

    TreeNode sampleTree = creator.createSampleTree();

    creator.createSampleTree();
    inOrder.traverse(sampleTree);


    inOrder.traverse(creator.createTree("",""));
    inOrder.traverse(creator.createTree("A","A"));
    inOrder.traverse(creator.createTree("AB","BA"));

  }


}