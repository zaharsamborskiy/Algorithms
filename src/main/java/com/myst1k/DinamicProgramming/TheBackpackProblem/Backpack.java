package com.myst1k.DinamicProgramming.TheBackpackProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class Backpack {
    private final Item[] items;
    private final int cost;

    public Backpack(Item[] items, int cost) {
        this.items = items;
        this.cost = cost;
    }

    public Item[] getItems() {
        return items;
    }

    public int getCost() {
        return cost;
    }
    public String getDescripton() {
        return items == null ? "" : Arrays.stream(items).map(Item::getName).collect(Collectors.joining("+")) + "-" + getCost();
    }
}
