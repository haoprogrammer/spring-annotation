package com.hao.interview.tree;

/**
 * @author: haoprogrammer
 * @date: 2019/5/27 16:49
 * @version: 1.0
 */
public class TreeTraversal {


  public void preOrder(TreeNode root){
    if (root == null){
      return;
    }
    System.out.print(root.getValue());
    preOrder(root.getLeft());
    preOrder(root.getRight());
  }

  public void inOrder(TreeNode root){
    if (root == null){
      return;
    }
    inOrder(root.getLeft());
    System.out.print(root.getValue());
    inOrder(root.getRight());
  }

  public void postOrder(TreeNode root){
    if (root == null){
      return;
    }
    postOrder(root.getLeft());
    postOrder(root.getRight());
    System.out.print(root.getValue());
  }


  public static void main(String[] args) {
    TreeCreator treeCreator = new TreeCreator();
    TreeTraversal treeTraversal = new TreeTraversal();

    TreeNode sampleTree = treeCreator.createSampleTree();
    treeTraversal.preOrder(sampleTree);
    System.out.println();

    treeTraversal.inOrder(sampleTree);
    System.out.println();

    treeTraversal.postOrder(sampleTree);
    System.out.println();

  }

}