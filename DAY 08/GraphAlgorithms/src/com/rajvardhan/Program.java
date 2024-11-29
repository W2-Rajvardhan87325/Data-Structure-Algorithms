package com.rajvardhan;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Graph graph=new Graph();
        int vertex;
        int choice;
        int start;
        do {
            System.out.println("\t\tGRAPH ALGORITHMS");
            System.out.println("1. CREATE GRAPH\n2. DISPLAY GRAPH\n3. DFS SPANNING TREE\n4. BFS SPANNING TREE\n5. SINGLE SOURCE\n6. PRIMS ALGORITHM\n7. DIJKSTRA ALGORITHM \n8. FLOYD WARSHALL ALGORITHM\n9. EXIT");
            System.out.print("Enter the Choice :: ");
            choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter the Vertexes :: ");
                    vertex=sc.nextInt();
                    graph=new Graph(vertex);
                    graph.accept(sc);
                    break;
                case 2:
                    graph.print();
                    break;
                case 3:
                    System.out.print("Enter the start node :: ");
                    start=sc.nextInt();
                    graph.DFSSpanningTree(start);
                    break;

                case 4:
                    System.out.print("Enter the start node :: ");
                    start=sc.nextInt();
                    graph.BFSSpanningTree(start);
                    break;

                case 5:
                    System.out.print("Enter the start node :: ");
                    start=sc.nextInt();
                    graph.singleSourcePathLength(start);
                    break;

                case 6:
                    System.out.print("Enter the start node :: ");
                    start=sc.nextInt();
                    graph.primsMST(start);
                    break;

                case 7:
                    System.out.print("Enter the start node :: ");
                    start=sc.nextInt();
                    graph.dijkstrasSPT(start);
                    break;

                case 8:
                    graph.floydWarshalAlgo();
                    break;

                case 9:
                    System.out.println("Exiting Code...");
                    break;
                default:
                    System.out.println("Invalid Choice...!");
                    break;
            }
        }while (choice!=9);
        sc.close();
    }
}
