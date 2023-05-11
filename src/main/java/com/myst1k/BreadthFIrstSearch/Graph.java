package com.myst1k.BreadthFIrstSearch;

import com.myst1k.DepthFirstSearch.Vertex;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {
    private final Vertex[] vertexArray;
    private final int[][] adjMatix;
    private int nVertex;
    private final Queue<Integer> queue;

    public Graph(int sizeVerticies) {
        this.vertexArray = new Vertex[sizeVerticies];
        this.adjMatix = new int[sizeVerticies][sizeVerticies];
        this.nVertex = 0;
        queue = new PriorityQueue<>();
    }

    public void addVertex(char label) {
        vertexArray[nVertex++] = new Vertex(label);
    }
    public void addEdge(int start, int end) {
        adjMatix[start][end] = 1;
        adjMatix[end][start] = 1;


    }
    public void bfs() {
        vertexArray[0].setWasVisited(true);
        queue.add(0);
        displayVertex(0);
        int v2;

        while (!queue.isEmpty()) {
            int v = queue.remove();
            while((v2 = getAdjUnvisitedVertex(v))!=-1){
                vertexArray[v2].setWasVisited(true);
                displayVertex(v2);
                queue.add(v2);
            }
        }
    }
    public void displayVertex(int v) {
        System.out.println("Вершина " + vertexArray[v].getLabel() + " была пройдена");
    }

    private int getAdjUnvisitedVertex(int v) {
        for (int i = 0; i < nVertex; i++) {
            if (adjMatix[v][i] == 1 && !vertexArray[i].isWasVisited()) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        System.out.println(" " + Arrays.toString(vertexArray));
        for (int i = 0; i < 7; i++) {
            System.out.print(vertexArray[i]);
            System.out.println(Arrays.toString(adjMatix[i]));
        }
        return "";
    }
}
