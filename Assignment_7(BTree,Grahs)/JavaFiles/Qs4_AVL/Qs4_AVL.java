/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs4_avl;

import static java.lang.Double.max;

/**
 *
 * @author jaspr_000
 */
public class Qs4_AVL {

    /**
     * @param args the command line arguments
     */
    Node root;

    public static void main(String[] args) {
        // TODO code application logic here    
        Qs4_AVL tree = new Qs4_AVL();
        tree.root = tree.insert(tree.root, 28);
        tree.root = tree.insert(tree.root, 39);
        tree.root = tree.insert(tree.root, 35);

        System.out.println("Preorder traversal"
                + " of constructed tree is : ");
        tree.preOrder(tree.root);
    }

    int height(Node N) {
        if (N == null) {
            return 0;
        }
        return N.height;
    }

    int getBalance(Node N) {
        if (N == null) {
            return 0;
        }

        return height(N.left) - height(N.right);
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
 
        // Perform rotation
        x.right = y;
        y.left = T2;
 
        // Update heights
        y.height = (int) (max(height(y.left), height(y.right)) + 1);
        x.height = (int) (max(height(x.left), height(x.right)) + 1);
 
        // Return new root
        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
 
        // Perform rotation
        y.left = x;
        x.right = T2;
 
        //  Update heights
        x.height = (int) (max(height(x.left), height(x.right)) + 1);
        y.height = (int) (max(height(y.left), height(y.right)) + 1);
 
        // Return new root
        return y;
    }
 

    Node insert(Node node, int key) {
        if (node == null) {
            return (new Node(key));
        } else if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            return node;
        }

        // update height of ancestor node
        node.height = (int) (1 + max(height(node.left), height(node.right)));

        // check the balance factor of parent node
        int balance = getBalance(node);

        // left subtree is larger - LEFT LEFT CASE
        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        // RIGHT RIGHT CASE
        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }

        //LEFT RIGHT CASE
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        //RIGHT LEFT CASE
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}

class Node {

    int key, height;
    Node left, right;

    Node(int d) {
        key = d;
        height = 1;
    }
}
