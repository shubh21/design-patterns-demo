package org.example.behavioural.iteratorStrategy;

import java.util.Iterator;
import java.util.Stack;

public class PostOrderIterator<T> implements Iterator<T> {
    private Stack<Node<T>> stack1 = new Stack<>();
    private Stack<Node<T>> stack2 = new Stack<>();
    private Node<T> current;

    public PostOrderIterator(Node<T> root) {
        current = root;
        if (current != null) {
            stack1.push(current);
            while (!stack1.isEmpty()) {
                Node<T> node = stack1.pop();
                stack2.push(node);
                if (node.getLeft() != null) stack1.push(node.getLeft());
                if (node.getRight() != null) stack1.push(node.getRight());
            }
        }
    }

    @Override
    public boolean hasNext() {
        return !stack2.isEmpty();
    }

    @Override
    public T next() {
        return stack2.pop().getKey();
    }
}
