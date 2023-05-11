package com.myst1k.OrientedWeightlessGraph;

import java.util.Arrays;
import java.util.List;

public class Main {
//                 0        4
//                / \       |
//               2---1      5
//                \
//                 3
    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(
                new Edge(0, 1), new Edge(1, 2), new Edge(2, 0), new Edge(2, 1), new Edge(3, 2),
                new Edge(4,5), new Edge(5, 4));
        Graph graph = new Graph(edges);
        System.out.println(graph);
    }
}
