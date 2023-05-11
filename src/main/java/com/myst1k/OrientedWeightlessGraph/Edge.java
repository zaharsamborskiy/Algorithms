package com.myst1k.OrientedWeightlessGraph;

public class Edge {
    private int from;
    private int to;

    public Edge(int from, int to) {
        // Для инициализации без весового графика
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }
}
