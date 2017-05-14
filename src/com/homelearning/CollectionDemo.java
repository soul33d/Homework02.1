package com.homelearning;

import java.util.Random;

public class CollectionDemo {
    public static void main(String[] args) {
        IntegersCollection integers = new IntegersCollection();
        Random random = new Random();
        printIntegersInfo(integers);
        integers.add(null);
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(10);
            printIntegersInfo(integers);
            integers.add(rand);
            System.out.println("Adding " + rand);
        }
        printIntegersInfo(integers);
        for (;integers.size() > 1;) {
            int rand = integers.get(random.nextInt(integers.size() - 1) + 1);
            System.out.println(integers);
            System.out.println(integers.remove((Object)rand));
            System.out.println(rand + " removed");
            printIntegersInfo(integers);
        }
    }

    private static void printIntegersInfo(IntegersCollection integers) {
        System.out.println(integers);
        System.out.println("Averange is " + integers.getAverange());
        System.out.println("Max value is " + integers.getMaxValue());
        System.out.println("Min value is " + integers.getMinValue());
        System.out.println("The size is " + integers.size());
        System.out.println();
    }
}