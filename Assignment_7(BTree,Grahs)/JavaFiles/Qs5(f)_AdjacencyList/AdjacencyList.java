/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaspr_000
 */

import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author rajiv
 */
public class AdjacencyList {

    private final int V;

     private LinkedList<Integer> adj[];

    AdjacencyList(int v) {
        V = v;
        adj = new LinkedList[v + 1];
        for (int i = 1; i <= v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    void displayAdjacencyList() {
        for (int i = 1; i <= V; i++) {
            System.out.print(i + "->");
            for (int x : adj[i]) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyList g = new AdjacencyList(9);
        g.addEdge(5, 7);
        g.addEdge(4, 6);
        g.addEdge(3, 7);
        g.addEdge(3, 9);
        g.addEdge(6, 7);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(2, 3);
        g.addEdge(4, 7);
        g.addEdge(4, 8);
        g.displayAdjacencyList();
    }
}
