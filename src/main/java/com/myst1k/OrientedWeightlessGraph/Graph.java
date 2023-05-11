package com.myst1k.OrientedWeightlessGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    List<List<Integer>> adjList = new LinkedList<>();

    public Graph(List<Edge> edges) {
        int n = 0;
        for (Edge e : edges) {
            n = Integer.max(n, Integer.max(e.getFrom(), e.getTo()));
        }

        for (int i = 0; i <= n; i++) {
            adjList.add(i, new ArrayList<>());
        }
        for (Edge current : edges) {
            adjList.get(current.getFrom()).add(current.getTo());
        }
    }

    @Override
    public String toString() {
        int src = 0;
        int n = adjList.size();
        while (src < n)
        {
            // вывести текущую вершину и все соседние с ней вершины
            for (int dest: adjList.get(src)) {
                System.out.print("(" + src + " ——> " + dest + ")\t");
            }
            System.out.println();
            src++;
        }
        return "";
    }
}
