package com.myst1k.DinamicProgramming.TheBackpackProblem;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Item guitar = new Item("Guitar", 1, 1500);
        Item recorder = new Item("Recorder", 4, 3000);
        Item notebook = new Item("Notebook", 3, 2000);
        Item[] items = {guitar,recorder,notebook};
        int sizeBP = 4;
        Backpack[][] bp = new Backpack[items.length + 1][sizeBP + 1];

        for (int i = 0; i < items.length + 1; i++) {
            for (int j = 0; j < sizeBP + 1; j++) {
                if (i == 0 || j == 0) {
                    bp[i][j] = new Backpack(new Item[]{}, 0);
                } else if (i == 1) {
                    bp[1][j] = items[0].getWeight() <= j ? new Backpack(new Item[]{items[0]}, items[0].getCost()) : new Backpack(new Item[]{}, 0);
                } else {
                    if (items[i - 1].getWeight() > j) {
                        bp[i][j] = bp[i - 1][j];
                    } else {
                        int newCost = (items[i - 1].getCost()) + (bp[i - 1][j - items[i - 1].getWeight()].getCost());
                        if (bp[i - 1][j].getCost() > newCost) {
                            bp[i][j] = bp[i - 1][j];
                        } else {
                            bp[i][j] = new Backpack(Stream.concat(Arrays.stream(new Item[]{items[i - 1]}),
                                    Arrays.stream(bp[i - 1][j - items[i - 1].getWeight()].getItems())).toArray(Item[]::new), newCost);
                        }
                    }
                }

            }
        }
        for (int i = 1; i < items.length + 1; i++) {
            for (int j = 1; j < sizeBP + 1; j++) {
                System.out.print(bp[i][j].getDescripton() + " ");
            }
            System.out.print("\n");
        }
    }
}
