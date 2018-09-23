package com.trycatch.java.algorithm.treenode;

import org.junit.Test;

public class TreeNodeMethodTest {

    @Test
    public void preTravereBtree(){
        TreeNodeMethod.preTravereBtree(TreeNodeMethod.getTreeNode());
    }

    @Test
    public void inTravereBtree(){
        TreeNodeMethod.inTravereBtree(TreeNodeMethod.getTreeNode());
    }

    @Test
    public void endTravereBtree(){
        TreeNodeMethod.endTravereBtree(TreeNodeMethod.getTreeNode());
    }

    @Test
    public void createTreeNode(){
        Long[] array = {9L,15L,20L,35L,10L};
        TreeRoot treeRoot = new TreeRoot();
        for (int i=0; i<array.length;i++){
            TreeNodeMethod.createTreeNode(treeRoot,array[i]);
        }
        System.out.println(treeRoot.getTreeNodeRoot().toString());
        TreeNodeMethod.inTravereBtree(treeRoot.getTreeNodeRoot());
    }

    @Test
    public void getTreeHeight(){
        System.out.println(TreeNodeMethod.getTreeHeight(TreeNodeMethod.getTreeNode()));
    }


    @Test
    public void getTreeMax(){
        System.out.println(TreeNodeMethod.getTreeMax(TreeNodeMethod.getTreeNode()));
    }

    @Test
    public void isValidBst(){
        System.out.println(TreeNodeMethod.isValidBst(TreeNodeMethod.getTreeNode(),Long.MIN_VALUE,Long.MAX_VALUE));
        System.out.println(TreeNodeMethod.isValidBst(TreeNodeMethod.getNotBTreeNode(),Long.MIN_VALUE,Long.MAX_VALUE));
    }

    @Test
    public void getTreeNodeNum(){
        System.out.println(TreeNodeMethod.getTreeNodeNum(TreeNodeMethod.getTreeNode()));
        System.out.println(TreeNodeMethod.getTreeNodeNum(TreeNodeMethod.getNotBTreeNode()));
    }


    @Test
    public void isValidEqu(){
        System.out.println(TreeNodeMethod.isValidEqu(TreeNodeMethod.getTreeNode(),TreeNodeMethod.getTreeNode()));
        System.out.println(TreeNodeMethod.isValidEqu(TreeNodeMethod.getNotBTreeNode(),TreeNodeMethod.getTreeNode()));
    }
}
