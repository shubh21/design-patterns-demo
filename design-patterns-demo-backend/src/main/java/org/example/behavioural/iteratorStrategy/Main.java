package org.example.behavioural.iteratorStrategy;

import java.util.Comparator;
import java.util.Iterator;

public class Main {

    public static void main(String[] args){
        Address address = new Address.AddressBuilder().setLat(1200).setLon(1000).setHouseNum(23).setStreetNum(2).build();
        Comparator<Address> addressComparator = Comparator.comparing(Main::getComparisonKey);
        Node<Address> addressNode = new Node<>( address);

        BinarySearchTree<Address> bst = new BinarySearchTree<>(addressNode, addressComparator);

        Address address1 = new Address.AddressBuilder().setLat(1200).setLon(1000).setHouseNum(23).setStreetNum(6).build();
        Address address2 = new Address.AddressBuilder().setLat(1200).setLon(1000).setHouseNum(21).setStreetNum(4).build();
        Address address3 = new Address.AddressBuilder().setLat(1201).setLon(1000).setHouseNum(23).setStreetNum(4).build();
        Address address4 = new Address.AddressBuilder().setLat(1200).setLon(1100).setHouseNum(23).setStreetNum(4).build();
        Address address5 = new Address.AddressBuilder().setLat(1200).setLon(1000).setHouseNum(23).setStreetNum(1).build();

        Node<Address> addressNode1 = new Node<>( address1);
        Node<Address> addressNode2 = new Node<>( address2);
        Node<Address> addressNode3 = new Node<>( address3);
        Node<Address> addressNode4 = new Node<>( address4);
        Node<Address> addressNode5 = new Node<>( address5);

        bst.insertNode(addressNode1);
        bst.insertNode(addressNode2);
        bst.insertNode(addressNode3);
        bst.insertNode(addressNode4);
        bst.insertNode(addressNode5);


        Iterator<Address> inOrder = bst.iterator(TraversalType.INORDER);
        while (inOrder.hasNext()) {
            System.out.println(inOrder.next());
        }

        System.out.println("\nPost-order Traversal:");
        Iterator<Address> postOrder = bst.iterator(TraversalType.POSTORDER);
        while (postOrder.hasNext()) {
            System.out.println(postOrder.next());
        }

        System.out.println("\nLevel-order Traversal:");
        Iterator<Address> levelOrder = bst.iterator(TraversalType.LEVELORDER);
        while (levelOrder.hasNext()) {
            System.out.println(levelOrder.next());
        }

    }

    private static String getComparisonKey(Address k1) {

        return String.format("%ds%ds%ds%d",
                k1.getHouseNum(), k1.getStreetNum(), k1.getLat(), k1.getLon());
    }
}
