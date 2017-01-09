package com.ryanluedders.cs.practice.tree;

public class BinaryTree<T> {
    
    private Node<T> root = null;
    
    public class Node<NT> {
        
        NT value;
        
        Node<NT> left = null;
        
        Node<NT> right = null;

        public NT getValue() {
            return value;
        }

        public void setValue(NT value) {
            this.value = value;
        }

        public Node<NT> getLeft() {
            return left;
        }

        public void setLeft(Node<NT> left) {
            this.left = left;
        }

        public Node<NT> getRight() {
            return right;
        }

        public void setRight(Node<NT> right) {
            this.right = right;
        }

    }
    
    void insert(T value) {
        root = insertOnNode(root, value);
    }
    
    Node<T> insertOnNode(Node<T> root, T value) {
        if (root == null) {
            root = new Node<T>();
            root.setValue(value);
        } else if (value.hashCode() < root.getValue().hashCode()) {
            root.setLeft(insertOnNode(root.getLeft(), value));
        } else {
            root.setRight(insertOnNode(root.getRight(), value));
        }
        return root;
    }
    
    public String toString() {
        return toString(root);
    }
    
    String toString(Node<T> root) {
        String result = "";
        if (root == null) {
            return "null";
        }
        
        result += "{" + nodeToString(root) + "->" + "(" 
                + toString(root.getLeft()) + "," + toString(root.getRight()) + ")}";
        return result;
    }
    
    String nodeToString(Node<T> n) {
        if (n == null) {
            return "null";
        } if (n.getValue() == null) {
            return "value=null";
        }
        return String.valueOf(n.getValue());
    }

}
