package com.ryanluedders.cs.practice.tree;

import com.ryanluedders.cs.practice.list.LinkedList;

public class Tree<T> {
    
    private Node<T> root = null;
    
    public class Node<NT> {
        
        NT value;
        
        LinkedList<Node<NT>> children = new LinkedList<Node<NT>>();
        
        public NT getValue() {
            return value;
        }

        public void setValue(NT value) {
            this.value = value;
        }
        
        public int childCount() {
        	return children.size();
        }

        public Node<NT> getChild(int idx) {
        	return children.get(idx);
        }
        
        public void addChild(Node<NT> node) {
        	children.addToEnd(node);
        }
        
        public void setChild(int idx, Node<NT> node) {
        	children.replace(idx, node);
        }

    }
    
    void insert(T value) {
        root = insertOnNode(root, value);
    }
    
    Node<T> insertOnNode(Node<T> root, T value) {
    	Node<T> node = new Node<T>();
    	node.setValue(value);
    	
    	if (root == null) {
    		return node;
    	} else {
    		root.addChild(node);
    		return root;
    	}
    }
    
    public String toString() {
        return toString(root);
    }
    
    String toString(Node<T> root) {
        String result = "";
        if (root == null) {
            return "null";
        }
        
        result += "{" + nodeToString(root) + "->" + "(";
        for (int i = 0; i < root.childCount(); i++) {
        	result += toString(root.getChild(i));
        	if (i != root.childCount() - 1) {
        		result += ",";
        	}
        }
        result += ")}";
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
