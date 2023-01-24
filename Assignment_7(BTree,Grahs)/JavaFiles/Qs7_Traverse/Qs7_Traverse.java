/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs7_traverse;

import java.util.ArrayList;
/**
 *
 * @author jaspr_000
 */
public class Qs7_Traverse {

    /**
     * @param args the command line arguments
     */
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }

    static void adjacencylist(ArrayList<ArrayList<Integer>> adj, int V) {
        for (int i = 0; i < V; i++) {
            System.out.print(i + "->");
            for (int x : adj.get(i)) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(13);
        for (int i = 0; i < 13; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj, 0, 5);
        addEdge(adj, 0, 1);
        addEdge(adj, 2, 0);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 5);
        addEdge(adj, 3, 2);
        addEdge(adj, 4, 3);
        addEdge(adj, 4, 2);
        addEdge(adj, 5, 4);
        addEdge(adj, 6, 9);
        addEdge(adj, 6, 4);
        addEdge(adj, 6, 8);
        addEdge(adj, 6, 0);
        addEdge(adj, 7, 6);
        addEdge(adj, 7, 9);
        addEdge(adj, 8, 6);
        addEdge(adj, 9, 11);
        addEdge(adj, 9, 10);
        addEdge(adj, 10, 12);
        addEdge(adj, 11, 4);
        addEdge(adj, 11, 12);
        addEdge(adj, 12, 9);
        adjacencylist(adj, 13);
    }
    
}
