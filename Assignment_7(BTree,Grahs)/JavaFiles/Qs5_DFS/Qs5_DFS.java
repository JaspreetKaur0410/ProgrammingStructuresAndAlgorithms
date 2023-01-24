/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs5_dfs;

/**
 *
 * @author jaspr_000
 */
import java.io.*;
import java.util.*;
 
// This class represents a
// directed graph using adjacency
// list representation
class Qs5_DFS {
    private int V; // No. of vertices
 
    // Array  of lists for
    // Adjacency List Representation
    private LinkedList<Integer> adj[];
 
    // Constructor
    @SuppressWarnings("unchecked") Qs5_DFS(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
 
    // Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        adj[v].add(w); // Add w to v's list.
    }
 
    // A function used by DFS
    void DFSUtil(int v, boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");
 
        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
 
    // The function to do DFS traversal.
    // It uses recursive
    // DFSUtil()
    void DFS(int v)
    {
        // Mark all the vertices as
        // not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];
 
        // Call the recursive helper
        // function to print DFS
        // traversal
        DFSUtil(v, visited);
    }
 
    // Driver Code
    public static void main(String args[])
    {
        Qs5_DFS g = new Qs5_DFS(11);
 
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
 
        System.out.println(
            "Following is Depth First Traversal "
            + "(starting from vertex 1)");
 
        g.DFS(1);
    }
}
