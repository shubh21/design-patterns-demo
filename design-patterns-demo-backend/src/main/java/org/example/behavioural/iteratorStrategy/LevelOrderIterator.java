package org.example.behavioural.iteratorStrategy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderIterator<T> implements Iterator<T> {
    private Queue<Node<T>> queue = new LinkedList<>();

    public LevelOrderIterator(Node<T> root) {
        if (root != null) {
            queue.offer(root);
        }
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public T next() {
        Node<T> node = queue.poll();
        if (node.getLeft() != null) queue.offer(node.getLeft());
        if (node.getRight() != null) queue.offer(node.getRight());
        return node.getKey();
    }
}
