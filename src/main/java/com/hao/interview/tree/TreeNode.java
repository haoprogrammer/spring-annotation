package com.hao.interview.tree;

/**
 * @author: haoprogrammer
 * @date: 2019/5/27 16:48
 * @version: 1.0
 */
public class TreeNode {
  private final char value;
  private TreeNode left;
  private TreeNode right;
  private TreeNode parent;

  public TreeNode(char value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  public char getValue() {
    return value;
  }

  public TreeNode getLeft() {
    return left;
  }

  public void setLeft(TreeNode left) {
    this.left = left;
    if(this.left != null){
      this.left.parent = this;
    }
  }

  public TreeNode getRight() {
    return right;
  }

  public void setRight(TreeNode right) {
    this.right = right;
    if(this.right != null){
      this.right.parent = this;
    }
  }

  public TreeNode getParent() {
    return parent;
  }

  private void setParent(TreeNode parent) {
    this.parent = parent;
  }
}