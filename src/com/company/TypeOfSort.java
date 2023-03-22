package com.company;

public class TypeOfSort {
    Sorting s;
    public  TypeOfSort(Sorting s){
        this.s =s;
    }
    public void doSort(int[] numbers){
        s.sort(numbers);
    }
}
