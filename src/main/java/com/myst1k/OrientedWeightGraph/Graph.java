package com.myst1k.OrientedWeightGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    List<List<Node>> adjList = new ArrayList<>();

    public Graph(List<Edge> edges) {
        int n = 0;
        for (Edge e : edges) {
            n = Integer.max(n, Integer.max(e.getSrc(), e.getDest()));
        }
        for (int i = 0; i <= n; i++) {
            adjList.add(i, new ArrayList<>());
        }
        for (Edge edge : edges) {
            adjList.get(edge.getSrc()).add(new Node(edge.getDest(), edge.getWeight()));
        }
    }

    @Override
    public String toString() {
        int src = 0;
        int n = adjList.size();

        while (src < n) {
            // вывести текущую вершину и все соседние с ней вершины
            for (Node edge : adjList.get(src)) {
                System.out.printf("%d ——> %s\t", src, edge);
            }
            System.out.println();
            src++;
        }
        return "";
    }
}
