package com.myst1k.DepthFirstSearch;

import java.util.Arrays;
import java.util.Stack;

public class Graph {
    private final Vertex[] vertexArray;
    private final int[][] adjMatrix;
    private int nVerts;
    private final Stack<Integer> stack;

    public Graph(int sizeVertex) {
        this.vertexArray = new Vertex[sizeVertex];
        this.adjMatrix = new int[sizeVertex][sizeVertex];
        this.nVerts = 0;
        this.stack = new Stack<>();
    }

    public void addVertex(char label) {
        vertexArray[nVerts++] = new Vertex(label);
    }
    public void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    public void dfs() {
        vertexArray[0].setWasVisited(true); // ставим посещаемость
        displayVertex(0);
        stack.push(0); // добавляем в стек 1 элемент столбца и ряда

        while (!stack.empty()) {
            int v = getAdjUnvisitedVertex(stack.peek()); //достаем индекс вершины, если есть 1
            if (v == -1) { // если непройденных смежных вершин нету
                stack.pop(); // элемент извлекается из стека
            } else  {
                vertexArray[v].setWasVisited(true);
                displayVertex(v);
                stack.push(v);
            }
        }
    }
    public void displayVertex(int v) {
        System.out.println("Вершина " + vertexArray[v].getLabel() + " была пройдена");
    }
    private int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < nVerts; j++) {
            if (adjMatrix[v][j] == 1 && !vertexArray[j].isWasVisited()) {
                return j; //возвращает первую найденную вершину
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        System.out.println(" " + Arrays.toString(vertexArray));
        for (int i = 0; i < 7; i++) {
            System.out.print(vertexArray[i]);
            System.out.println(Arrays.toString(adjMatrix[i]));
        }
        return "";
    }
}
