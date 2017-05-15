/* Ostapenko Vitaliy
Необходимо реализовать коллекцию целых чисел, которая позволяет выполнять операции:
добавления
удаления
поиска элемента по значению
поиска элемента по индексу
поиска максимального элемента
поиска минимального элемента
поиска среднего арифметического всех элементов
При этом:
при добавлении нового элемента все элементы увеличивают своё значение на добавляемый элемент
при удалении - уменьшают своё значение на удаляемый элемент
Недопустим ввод в коллекцию null, символов и других значений, кроме целых чисел.
Результатом работы должен быть отдельный репозиторий github/bitbucket с README файлом, который описывает задание,
сам класс и содержит инструкции по запуску приложения.*/
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
            System.out.println(integers.remove(rand));
            System.out.println(rand + " removed");
            printIntegersInfo(integers);
        }
    }

    private static void printIntegersInfo(IntegersCollection integers) {
        System.out.println(integers);
        System.out.println("Average is " + integers.getAverage());
        System.out.println("Max value is " + integers.getMaxValue());
        System.out.println("Min value is " + integers.getMinValue());
        System.out.println("The size is " + integers.size());
        System.out.println();
    }
}