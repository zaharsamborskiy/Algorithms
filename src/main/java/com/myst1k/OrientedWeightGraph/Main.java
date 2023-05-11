package com.myst1k.OrientedWeightGraph;

import java.util.Arrays;
import java.util.List;

public class Main {
//                 0        4
//              5 / \ 6     |3
//               2-4-1      5
//               10\
//                 3
    public static void main(String[] args) {
        //Вход (x,y,w) где от x до y ребро с весом w
        List<Edge> edges = Arrays.asList(
                new Edge(0, 1, 6), new Edge(1, 2, 7), new Edge(2, 0, 5),
                new Edge(2, 1, 4), new Edge(3, 2, 10), new Edge(4, 5, 1),
                new Edge(5, 4, 3));
        Graph graph = new Graph(edges);
        System.out.println(graph);
    }
}
