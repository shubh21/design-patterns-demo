package org.example.behavioural.iteratorStrategy;

public class Node <T> {

    private final T key;
    Node<T> left;
    Node<T> right;

    public Node<T> getLeft() {
        return left;
    }

    public Node<T> getRight() {
        return right;
    }

    public Node(T key) {
        if(key == null)
            throw new NullPointerException();
        this.key = key;
    }

    public T getKey() {
        return key;
    }
}
