package com.myst1k.DepthFirstSearch;

public class Main {
//    B - E
//   /
//  A - C
//   \
//    D - F - G
//    Time = O(N2)
    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addVertex('A'); //0
        graph.addVertex('B'); //1
        graph.addVertex('C'); //2
        graph.addVertex('D'); //3
        graph.addVertex('E'); //4
        graph.addVertex('F'); //5
        graph.addVertex('G'); //6

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,4);
        graph.addEdge(3,5);
        graph.addEdge(5,6);

        System.out.println(graph);
        graph.dfs();
    }
}
