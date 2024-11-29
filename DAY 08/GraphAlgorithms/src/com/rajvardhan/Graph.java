package com.rajvardhan;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Graph {
    private final int INF = 999;
    private int vertexCount;
    private int edgeCount;
    private int adjmat[][];

    public Graph(){

    }

    public Graph(int vertex) {
        vertexCount = vertex;
        adjmat = new int[vertexCount][vertexCount];
        for(int i = 0 ; i < vertexCount ; i++)
            for(int j = 0 ; j < vertexCount ; j++)
                adjmat[i][j] = INF;
    }

    public void accept(Scanner sc) {
        System.out.print("Enter Edge count :: ");
        edgeCount = sc.nextInt();
        System.out.println("Enter Edges (src, dest, wt) Separated By Spaces ");
        for(int i = 0 ; i < edgeCount ; i++) {
            System.out.print("Source      :: ");
            int src = sc.nextInt();
            System.out.print("Destination :: ");
            int dest = sc.nextInt();
            System.out.print("Weight      :: ");
            int wt = sc.nextInt();
            adjmat[src][dest] = wt;
            adjmat[dest][src] = wt;		// comment this line for directed graph
        }
    }

    public void print() {
        System.out.println("Graph : ");
        for(int i = 0 ; i < vertexCount ; i++) {
            for(int j = 0 ; j < vertexCount ; j++) {
                System.out.print(" " + adjmat[i][j]);
            }
            System.out.println();
        }
    }

    public void DFSSpanningTree(int start) {
        Stack<Integer> st = new Stack<>();
        boolean marked[] = new boolean[vertexCount];
        st.push(start);
        marked[start] = true;
        System.out.print("DFS Spanning Tree : ");
        while (!st.isEmpty()) {
            int u = st.pop();
            for (int v = 0; v < vertexCount; v++) {
                // Check if vertex `v` is not marked and there is an edge between `u` and `v`
                if (!marked[v] && adjmat[u][v] != INF) {
                    st.push(v);
                    marked[v] = true;
                    System.out.print("(" + u + "-" + v + ")");
                }
            }
        }
        System.out.println();
    }

    public void BFSSpanningTree(int start) {
        Queue<Integer> st = new LinkedList<>();
        boolean marked[] = new boolean[vertexCount];
        st.offer(start);
        marked[start] = true;
        System.out.print("BFS Spanning Tree : ");
        while (!st.isEmpty()) {
            int u = st.poll();
            for (int v = 0; v < vertexCount; v++) {
                // Check if vertex `v` is not marked and there is an edge between `u` and `v`
                if (!marked[v] && adjmat[u][v] != INF) {
                    st.offer(v);
                    marked[v] = true;
                    System.out.print("(" + u + "-" + v + ")");
                }
            }
        }
        System.out.println();
    }

    public void singleSourcePathLength(int start) {
        Queue<Integer> q = new LinkedList<>();
        boolean marked[] = new boolean[vertexCount];
        int length[] = new int[vertexCount];
        q.offer(start);
        marked[start] = true;
        length[start] = 0;
        System.out.print("Path length tree : ");
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v = 0; v < vertexCount; v++) {
                // Check if vertex `v` is not marked and there is an edge between `u` and `v`
                if (!marked[v] && adjmat[u][v] != INF) {
                    q.offer(v);
                    marked[v] = true;
                    length[v] = length[u] + 1;
                    System.out.print("(" + u + "," + v + ")");
                }
            }
        }
        System.out.println();
        System.out.println("Path Length array : ");
        for (int i = 0; i < vertexCount; i++)
            System.out.println(start + "->" + i + " = " + length[i]);
    }

    public void dijkstrasSPT(int start) {
        boolean spt[] = new boolean[vertexCount];
        int parent[] = new int[vertexCount];
        int dist[] = new int[vertexCount];
        for(int i = 0 ; i < vertexCount ; i++) {
            parent[i] = -1;
            dist[i] = INF;
            spt[i] = false;
        }
        dist[start] = 0;
        int count = 0;
        while(count < vertexCount) {
            int minDist = INF, minDistVertex = -1;
            for(int i = 0 ; i < vertexCount ; i++) {
                if(!spt[i] && dist[i] < minDist) {
                    minDist = dist[i];
                    minDistVertex = i;
                }
            }
            int u = minDistVertex;
            spt[u] = true;
            count++;
            for(int v = 0 ; v < vertexCount ; v++) {
                if(!spt[v] && adjmat[u][v] != INF && dist[u] + adjmat[u][v] < dist[v]) {
                    dist[v] = dist[u] + adjmat[u][v];
                    parent[v] = u;
                }
            }
        }
        System.out.print("SPT : ");
        for(int i = 0 ; i < vertexCount ; i++) {
            System.out.print("(" + parent[i] + "," + i + ")");
        }
        System.out.println("\nShortest distances from " + start + ":");
        for(int i = 0 ; i < vertexCount ; i++)
            System.out.println(start + "->" + i + " = " + dist[i]);
    }
    public void primsMST(int start) {
        boolean mst[] = new boolean[vertexCount];
        int parent[] = new int[vertexCount];
        int key[] = new int[vertexCount];
        for(int i = 0 ; i < vertexCount ; i++) {
            parent[i] = -1;
            key[i] = INF;
            mst[i] = false;
        }
        key[start] = 0;
        int count = 0;
        while(count < vertexCount) {
            int minKey = INF, minKeyVertex = -1;
            for(int i = 0 ; i < vertexCount ; i++) {
                if(!mst[i] && key[i] < minKey) {
                    minKey = key[i];
                    minKeyVertex = i;
                }
            }
            int u = minKeyVertex;
            mst[u] = true;
            count++;
            for(int v = 0 ; v < vertexCount ; v++) {
                if(!mst[v] && adjmat[u][v] != INF && adjmat[u][v] < key[v]) {
                    key[v] = adjmat[u][v];
                    parent[v] = u;
                }
            }
        }
        int wt = 0;
        System.out.print("MST : ");
        for(int i = 0 ; i < vertexCount ; i++) {
            System.out.print("(" + parent[i] + "," + i + ")");
            wt += key[i];
        }
        System.out.println("\nweight : " + wt);
    }

    public void floydWarshalAlgo() {
        int dist[][] = new int[vertexCount][vertexCount];
        for(int u = 0 ; u < vertexCount ; u++) {
            for(int v = 0 ; v < vertexCount ; v++) {
                dist[u][v] = adjmat[u][v];
            }
            dist[u][u] = 0;
        }

        for(int i = 0 ; i < vertexCount ; i++) {
            for(int u = 0 ; u < vertexCount ; u++) {
                for(int v = 0 ; v < vertexCount ; v++) {
                    if(dist[u][i] != INF && dist[i][v] != INF && dist[u][i] + dist[i][v] < dist[u][v])
                        dist[u][v] = dist[u][i] + dist[i][v];
                }
            }
        }

        System.out.println("Distances : ");
        for(int u = 0 ; u < vertexCount ; u++) {
            for(int v = 0 ; v < vertexCount ; v++) {
                System.out.print(dist[u][v] + " ");
            }
            System.out.println("");
        }
    }
}

















