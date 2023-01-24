/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs5_bfs;
import java.io.*;
import java.util.*;
/**
 *
 * @author jaspr_000
 */
public class Qs5_BFS {

   private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists
 
    // Constructor
    Qs5_BFS(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    // Function to add an edge into the graph
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
 
    // prints BFS traversal from a given source s
    void BFS(int s)
    {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];
 
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);
 
        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");
 
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
 
    // Driver method to
    public static void main(String args[])
    {
        Qs5_BFS g = new Qs5_BFS(10);
 
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
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 1)");
 
        g.BFS(1);
    }
    
}
