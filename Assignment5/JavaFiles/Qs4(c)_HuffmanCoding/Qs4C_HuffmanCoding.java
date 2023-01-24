/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs4.c._huffmancoding;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *
 * @author jaspr_000
 */
public class Qs4C_HuffmanCoding {

    static Node root;
    private static Map<Character, String> charPrefixHashMap = new HashMap<>();
    
    
    public static void main(String[] args) {
        String input = "Students want to transfer files with gmail";
        System.out.println("Input String is -> " + input);
        System.out.println("");
        encode(input);
        StringBuilder s = new StringBuilder();
        if (charPrefixHashMap != null) {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                s.append(charPrefixHashMap.get(c));
            }
        }
        decode(s.toString());
    }

    public static void encode(String input) {
        // map to store character and its corrosponding frequency
        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            freq.put(input.charAt(i), freq.getOrDefault(input.charAt(i), 0) + 1);
        }

        System.out.println("Map for characters and its frequencies " + freq);
        System.out.println("");

        constructTree(freq, input);

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            s.append(charPrefixHashMap.get(c));
        }
    }

    public static void constructTree(Map<Character, Integer> freq, String input) {
        // pq will have priority based on frequency. Node with lowest frequency has highest priority.
        PriorityQueue<Node> pq = new PriorityQueue<Node>(input.length(), new Comparison());
        for (var entry : freq.entrySet()) {
            Node node = new Node();
            node.setData(entry.getKey());
            node.setFrequency(entry.getValue());
            node.setLeft(null);
            node.setRight(null);
            pq.add(node);
        }

        root = null;

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
//            System.out.println("left"+" "+left.data);
//            System.out.println("right"+" "+right.data);
            Node new_node = new Node();
            new_node.data = '-';
            new_node.frequency = left.frequency + right.frequency;
            new_node.left = left;
            new_node.right = right;
            root = new_node;
            pq.add(new_node);
        }
        displayTree(root, "");
    }

    public static void displayTree(Node root, String code) {
        // the node is a leaf node
        if (root.left == null && root.right == null) {
            System.out.println(root.data + "->" + " " + code);
            charPrefixHashMap.put(root.data, code.toString());
            return;
        }
        displayTree(root.left, code + '0');
        displayTree(root.right, code + '1');
    }

    private static void decode(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        Node temp = root;
        System.out.println("");
        System.out.println("Encoded String is -> " + s);

        for (int i = 0; i < s.length(); i++) {
            int j = Integer.parseInt(String.valueOf(s.charAt(i)));

            if (j == 0) {
                temp = temp.left;
                if (temp.left == null && temp.right == null) {
                    stringBuilder.append(temp.data);
                    temp = root;
                }
            }
            if (j == 1) {
                temp = temp.right;
                if (temp.left == null && temp.right == null) {
                    stringBuilder.append(temp.data);
                    temp = root;
                }
            }
        }
        System.out.println("");
        System.out.println("Decoded string is -> " + stringBuilder.toString());

    }
}

class Comparison implements Comparator<Node> {

    @Override
    public int compare(Node o1, Node o2) {
        return o1.frequency - o2.frequency;
    }

}
