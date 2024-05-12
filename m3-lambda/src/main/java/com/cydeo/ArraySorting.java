package com.cydeo;

public class ArraySorting {


    public static void main(String[] args) {



        ArraySorting as = new ArraySorting();
        QuickSort quickSort = new QuickSort();
        BubbleSort bubbleSort = new BubbleSort();

        as.sort(bubbleSort);




    }

    public void sort(Sorting sorting){
        sorting.sort();

//        System.out.println("Quick Sorting Array");
    }


}
