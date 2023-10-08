/*
  创建一个双端队列, 并实现project1A中的功能
 */

public class LinkedListDeque<T> {
    // create a node
    private class Node{
        private T first;
        private Node next;
        private Node prev;
        private Node(T i, Node p, Node n) {
            first = i;
            next = n;
            prev = p;
        }
    }

    //size
    private int size;
    //create a sentinel node
    private Node sentinel = new Node(null, null, null);

    //create a empty list
    public LinkedListDeque() {
        size = 0;
    }


}