package org.example.behavioural.iteratorStrategy;

import java.util.Iterator;
import java.util.Stack;

public class InOrderIterator<T> implements Iterator<T> {
    private Stack<Node<T>> stack = new Stack<>();
    private Node<T> current;

    public InOrderIterator(Node<T> root) {
        current = root;
    }

    @Override
    public boolean hasNext() {
        return current != null || !stack.isEmpty();
    }

    @Override
    public T next() {
        while (current != null) {
            stack.push(current);
            current = current.getLeft();
        }
        Node<T> node = stack.pop();
        current = node.getRight();
        return node.getKey();
    }
}
