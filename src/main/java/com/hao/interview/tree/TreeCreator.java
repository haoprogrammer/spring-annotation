package com.hao.interview.tree;

import sun.reflect.generics.tree.Tree;

/**
 * @author: haoprogrammer
 * @date: 2019/5/27 16:49
 * @version: 1.0
 */
public class TreeCreator {

  public TreeNode createSampleTree(){
    TreeNode root = new TreeNode('A');
    root.setLeft(new TreeNode('B'));
    root.getLeft().setLeft(new TreeNode('D'));
    root.getLeft().setRight(new TreeNode('E'));
    root.getLeft().getRight().setLeft(new TreeNode('G'));
    root.setRight(new TreeNode('C'));
    root.getRight().setRight(new TreeNode('F'));

    return root;
  }


  public TreeNode createTree(String preOrder, String inOrder){
    if (preOrder.isEmpty()) {
      return null;
    }

    char rootValue = preOrder.charAt(0);
    int rootIndex = inOrder.indexOf(rootValue);

    TreeNode root = new TreeNode(rootValue);
    root.setLeft(
        createTree(preOrder.substring(1, 1 + rootIndex),inOrder.substring(0, rootIndex))
    );
    root.setRight(
        createTree(preOrder.substring(1 + rootIndex), inOrder.substring(rootIndex + 1))
    );

    return root;
  }

  public String postOrderTree(String preOrder, String inOrder){
    //for this need to be careful
    if(preOrder.isEmpty()){
      return "";
    }

    char rootValue = preOrder.charAt(0);
    int rootIndex = inOrder.indexOf(rootValue);

    return postOrderTree(
              preOrder.substring(1, 1 + rootIndex),
              inOrder.substring(0, rootIndex)) +
        postOrderTree(
            preOrder.substring(1 + rootIndex),
            inOrder.substring(rootIndex + 1)) +
        rootValue;


  }

  public static void main(String[] args) {
    TreeCreator treeCreator = new TreeCreator();
    TreeTraversal treeTraversal = new TreeTraversal();

    TreeNode sampleTree = treeCreator.createTree("ABDEGCF","DBGEACF");
    treeTraversal.postOrder(sampleTree);
    System.out.println();
    System.out.println(treeCreator.postOrderTree("ABDEGCF","DBGEACF"));
  }



}