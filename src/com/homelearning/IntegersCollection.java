package com.homelearning;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IntegersCollection implements Collection<Integer> {
    private static final int DEFAULT_SIZE = 16;

    private int size = 0;
    private Integer[] integers;

    public IntegersCollection() {
        integers = new Integer[DEFAULT_SIZE];
    }

    public IntegersCollection(int size) {
        this.size = size;
    }

    @Override
    public boolean add(Integer integer) {
        if (integers.length == size) {
            integers = Arrays.copyOf(integers, integers.length * 2);
        }
        for (int i = 0; i < size; i++) {
            integers[i] += integer;
        }
        size++;
        integers[size - 1] = integer;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (isEmpty()) return false;
        if (contains(o)){
            Integer[] resultIntegers = new Integer[integers.length];
            int removedCount = 0;
            for (int i = 0; i < size; i++) {
                if (((Integer)(integers[i] - ((Integer)o*removedCount))).equals(o)) {
                    removedCount++;
                } else resultIntegers[i - removedCount] = integers[i];
            }
            size = size - removedCount;
            for (int i = 0; i < size; i++) {
                resultIntegers[i] = resultIntegers[i] - ((Integer) o)*removedCount;
            }
            integers = resultIntegers;
        }
        return true;
    }

    public Integer getIndex(int value){
        for (int i = 0; i < size; i++) {
            if (integers[i] == value) return i;
        }
        return -1;
    }

    public Integer get(int index) throws IndexOutOfBoundsException{
        if (index <= size - 1) return integers[index];
        else throw new IndexOutOfBoundsException("Index is " + index + " size is " + size);
    }

    public Integer getMaxValue(){
        if (isEmpty()) return null;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            Integer integer = integers[i];
            if (integer > max) max = integer;
        }
        return max;
    }

    public Integer getMinValue(){
        if (isEmpty()) return null;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            Integer integer = integers[i];
            if (integer < min) min = integer;
        }
        return min;
    }

    public Integer getAverange(){
        if (isEmpty()) return null;
        if (size == 1) return integers[0];
        int result = 0;
        for (int i = 0; i < size; i++) {
            result += integers[i];
        }
        result = result/(size - 1);
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (isEmpty() || !isCorrectType(o)) return false;
        for (int i = 0; i < size; i++) {
            if (integers[i].equals(o)) return true;
        }
        return false;
    }

    private boolean isCorrectType(Object o) {
        return o.getClass() == int.class || o.getClass() == Integer.class;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int count = 0;
            @Override
            public boolean hasNext() {
                return size < count + 1;
            }

            @Override
            public Integer next() {
                return integers[count++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(integers, size);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "Integers collection is empty.";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(integers[i]);
            if (i + 1 != size) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}