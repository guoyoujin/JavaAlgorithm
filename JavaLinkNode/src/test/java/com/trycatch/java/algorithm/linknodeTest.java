package com.trycatch.java.algorithm;

import com.trycatch.java.algorithm.linknode.LinkNodeMethod;
import org.junit.Test;

public class linknodeTest {
    @Test
    public void reverseLinkedList(){
        System.out.println(LinkNodeMethod.reverseLinkedList(LinkNodeMethod.getLinkedList()));
    }

    @Test
    public void reverseLinkedList2(){
        System.out.println(LinkNodeMethod.reverseLinkedList2(LinkNodeMethod.getLinkedList()));
    }
}
