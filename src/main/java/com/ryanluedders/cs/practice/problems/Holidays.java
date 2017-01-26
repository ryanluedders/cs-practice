package com.ryanluedders.cs.practice.problems;

import java.util.ArrayList;
import java.util.List;

public class Holidays {
    
    static class HolidayTreeNode<T> {
        public int idx;
        public T value;
        public List<HolidayTreeNode<T>> childNodes = new ArrayList<>();
    }
    
    static class HolidayTree {
        public HolidayTreeNode<Integer> root = new HolidayTreeNode<Integer>();
        
        public int size() {
            return size(root);
        }

        static int size(HolidayTreeNode<Integer> input) {
            int result = 1;
            if (input != null) {
                for (int i = 0; i < input.childNodes.size(); i++) {
                    result += size(input.childNodes.get(i));
                }
            }
            return result;
        }
        
        public String toString() {
            List<List<String>> strings = new ArrayList<List<String>>();
            
            toString(strings, root, 0);
            
            String result = "";
            for (List<String> l : strings) {
                result += l.toString() + "\n";
            }
            return result;            
        }
        
        static void toString(List<List<String>> strings, HolidayTreeNode<Integer> root, int level) {
            if (strings.size() <= level) {
                strings.add(new ArrayList<String>());
            }
            
            if (root == null) {
                strings.get(level).add("null");
            } else {
                strings.get(level).add(String.valueOf(root.value));
                
                for (HolidayTreeNode<Integer> n : root.childNodes) {
                    toString(strings, n, level + 1);
                }
            }
        }
        
    }
    
    public static HolidayTree buildTree(int[][] flightTimes, int[][] holidaysPerWeek, int maxFlight) {
        HolidayTree tree = new HolidayTree();

        HolidayTreeNode<Integer> n = new HolidayTreeNode<>();
        n.idx = -1;
        n.value = null;
        tree.root = n;
        
        addToTree(tree.root, holidaysPerWeek, flightTimes, maxFlight, 0);
        
        return tree;
    }
    
    public static void addToTree(HolidayTreeNode<Integer> base, int[][] holidaysPerWeek, int[][] flightTimes, int maxFlight, int week) {
        if (base != null) {
            for (int j = 0; j < holidaysPerWeek[0].length; j++) {
                HolidayTreeNode<Integer> next = null;
                if (base.idx == -1 || flightTimes[base.idx][j] <= maxFlight) {
                    next = new HolidayTreeNode<>();
                    next.idx = j;
                    next.value = holidaysPerWeek[week][j];
                }
                
                if (week + 1 < holidaysPerWeek.length) {
                    addToTree(next, holidaysPerWeek, flightTimes, maxFlight, week + 1);
                }
                
                base.childNodes.add(next);
            }
        }
    }
    
    public static int findMaximumPath(HolidayTree tree) {
        return getMaxChild(tree.root);
    }
    
    public static int getMaxChild(HolidayTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        
        int rootValue = (root.value == null) ? 0 : root.value;
        
        if (root.childNodes.isEmpty()) {
            return rootValue;
        }
        
        int maxChildValue = -1;
        for (HolidayTreeNode<Integer> c : root.childNodes) {
            int childValue = getMaxChild(c);
            if (childValue > maxChildValue) {
                maxChildValue = childValue;
            }
        }
        
        return maxChildValue + rootValue;
    }

}
