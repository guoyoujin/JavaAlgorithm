package com.trycatch.java.algorithm.treenode;

public class TreeNode {
    private TreeNode leftNode;
    private TreeNode rightNode;
    private Long val;

    public TreeNode(Long val){
        this.val = val;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public Long getVal() {
        return val;
    }

    public void setVal(Long val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                ", val=" + val +
                '}';
    }
}
