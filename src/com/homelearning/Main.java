package com.homelearning;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        IntegersCollection integers = new IntegersCollection();
        Random random = new Random();
        System.out.println(integers.size());
        integers.add(null);
        integers.add(10);
        System.out.println(integers.size());
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(10);
            System.out.println(integers);
            integers.add(rand);
            System.out.println("Adding " + rand);
        }
        System.out.println(integers);
        System.out.println(integers.size());
        System.out.println();
        for (;integers.size() > 1;) {
            int rand = integers.get(random.nextInt(integers.size() - 1) + 1);
            System.out.println(integers);
            System.out.println(integers.remove((Object)rand));
            System.out.println(integers);
            System.out.println(rand + " removed");
            System.out.println("Averange is " + integers.getAverange());
            System.out.println("Max value is " + integers.getMaxValue());
            System.out.println("Min value is " + integers.getMinValue());
            System.out.println("The size is " + integers.size());
            System.out.println();
        }
    }
}
