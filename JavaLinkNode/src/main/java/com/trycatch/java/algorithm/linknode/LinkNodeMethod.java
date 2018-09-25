package com.trycatch.java.algorithm.linknode;

public class LinkNodeMethod {

    public static Node getLinkedList(){
        Node linkNode1 = new Node();
        linkNode1.data = 1;
        Node linkNode2 = new Node();
        linkNode2.data = 2;
        Node linkNode3 = new Node();
        linkNode3.data = 3;
        Node linkNode4 = new Node();
        linkNode4.data = 4;
        Node linkNode5 = new Node();
        linkNode5.data = 5;
        Node linkNode6 = new Node();
        linkNode6.data = 6;
        linkNode1.next = linkNode2;
        linkNode2.next = linkNode3;
        linkNode3.next = linkNode4;
        linkNode4.next = linkNode5;
        linkNode5.next = linkNode6;
        return linkNode1;

    }

    /**
     * 单链表递归反转
     * @param node
     * @return
     */
    public static Node reverseLinkedList(Node node){
        System.out.println(node);
        if (node == null || node.next == null) {
            return node;
        } else {
            Node headNode = reverseLinkedList(node.next);
            node.next.next = node;
            node.next = null;
            return headNode;
        }
    }

    /**
     * 单链表迭代反转
     * @param node
     * @return
     */
    public static Node reverseLinkedList2(Node node){
        Node preNode = null;
        while (node!=null){
            Node tmp = node; //保存当前node的直
            node = node.next;//把node的下一个子节点，赋给node
            tmp.next = preNode;//把子node赋给tmp
            preNode = tmp;//把新得到的node赋给preNode
        }
        return preNode;
    }
}
