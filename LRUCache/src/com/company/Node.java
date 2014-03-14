package com.company;

/**
 * Created by fraunword on 3/13/14.
 */
public class Node {
    public Integer data;
    public Node previous;
    public Node next;
    public Node(int a) {
        data = new Integer(a);
        previous = null;
        next = null;
    }
}
