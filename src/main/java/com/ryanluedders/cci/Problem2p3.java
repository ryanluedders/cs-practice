package com.ryanluedders.cci;

public class Problem2p3 {
    
    static class SingleLinkedList<T> {
        
        private SingleLinkedListNode<T> root = null;
     
        static class SingleLinkedListNode<T> {
            public T value;
            public SingleLinkedListNode<T> next;
        }
        
        public SingleLinkedListNode<T> add(T t) {
            SingleLinkedListNode<T> node = new SingleLinkedListNode<>();
            node.value = t;
            if (root == null) {
                root = node;  
            } else if (root.next == null) {
                root.next = node;
            } else {
                SingleLinkedListNode<T> next = root;
                while (next.next != null) {
                    next = next.next;
                }
                next.next = node;
            }
            return node;
        }
        
        public String toString() {
            String result = "[";
            SingleLinkedListNode<T> node = root;
            while (node != null) {
                result += node.value + " ";
                node = node.next;
            }
            result = result.trim();
            result += "]";
            return result;
        }
        
        public void deleteNode(SingleLinkedListNode<T> node) {
            if (node == root) {
                root = null;
                return;
            }
            
            SingleLinkedListNode<T> i = node;
            while (i != null && i.next != null) {
                i.value = i.next.value;
                
                if (i.next.next == null) {
                    i.next = null;
                } else {
                    i = i.next;
                }
            }
            
        }
        
    }
    
}
