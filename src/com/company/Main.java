package com.company;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        TypeOfSort T= new TypeOfSort( new MergeSort());
        T.doSort(numbers);
    }

}
