package org.example.behavioural.iteratorStrategy;

import java.util.Comparator;
import java.util.Iterator;

public class BinarySearchTree<T> {

    private final Node<T> root;
    private final Comparator<T> comparator;

    public BinarySearchTree(Node<T> node, Comparator<T> comparator){
        this.root = node;
        this.root.left = null;
        this.root.right = null;

        if(comparator == null){
            throw new IllegalArgumentException("Comparator can not be null");
        }

        this.comparator = comparator;
    }

    public boolean contains(Node<T> key){
        Node<T> current = root;

        while(current!=null){
            if(comparator.compare(current.getKey(), key.getKey())==0){
                return true;
            } else if(comparator.compare(current.getKey(), key.getKey())<0){
                current = current.left;
            } else{
                current = current.right;
            }
        }
        return false;
    }

    private void addAtLeft(Node<T> parent, Node<T> node){
        parent.left = node;
    }

    private void addAtRight(Node<T> parent, Node<T> node){
        parent.right = node;
    }


    public void insertNode(Node<T> node) {
        if (node == null) throw new NullPointerException("Node cannot be null");

        Node<T> parent = findPositionInTree(node);
        if (parent == null) return; // Shouldn’t happen, but safety

        int cmp = comparator.compare(node.getKey(), parent.getKey());
        if (cmp < 0) {
            addAtLeft(parent, node);
        } else if (cmp > 0) { // Only >, not >=
            addAtRight(parent, node);
        }
        // If cmp == 0, do nothing (duplicate ignored)
    }

    private Node<T> findPositionInTree(Node<T> node) {
        Node<T> current = root;
        Node<T> parent = null;

        while (current != null) {
            parent = current;
            int cmp = comparator.compare(node.getKey(), current.getKey());
            if (cmp < 0) {
                current = current.left;
            } else if (cmp > 0) {
                current = current.right;
            } else {
                return current; // Duplicate found, return it
            }
        }
        return parent;
    }

    public Iterator<T> iterator(TraversalType type){
        return switch (type) {
            case INORDER -> new InOrderIterator<>(root);
            case POSTORDER -> new PostOrderIterator<>(root);
            default -> new LevelOrderIterator<>(root);
        };
    }

    public Iterator<T> iterator() {
        return iterator(TraversalType.LEVELORDER);
    }

}
