package com.company;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by fraunword on 3/13/14.
 */


public class LRUCache {
    Integer object;

    HashMap<Integer, Node> map = new HashMap<Integer, Node>();
    private Node head;
    private Node tail;

    public LRUCache() {
        head = null;
        tail = null;
    }

    void recentlyUsed(int key) {
        Node node = map.get(key);
        if (node == head) return;
        Node next = node.next;
        Node previous = node.previous;

        node.next = head;
        node.previous = null;
        head = node;

        previous.next = next;

        if (next == null) {
            tail = previous;
        }
        else {
            next.previous = previous;
        }
    }

    Integer get(int key) {
        if (map.containsKey(key)) {
            recentlyUsed(key);
            return head.data;
        }
        else {
            return null;
        }
    }

    void put(int key, int value) {
        if (get(key) == null) {
            Node newNode = new Node(value);
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
            map.put(key, newNode);
        }
        else head.data = value;
    }



}
