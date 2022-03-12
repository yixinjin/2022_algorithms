package com.imooc.algorithms.sort.basic;

public class InsertionSort <E extends Comparable<E>> {


    public static void main(String[] args) {
        Integer[] testData = SortTestHelper.generateRandomArray(30, 0,100);
        InsertionSort<Integer> iSort = new InsertionSort<>();
//        iSort.insertionSort(testData);
//        iSort.printArray(testData);

        iSort.insertionSort2(testData);
        iSort.printArray(testData);

        SelectionSort<Integer> sSort = new SelectionSort<>();
        sSort.selectionSort(testData);
        sSort.printArray(testData);

        Integer[] testData_2 = SortTestHelper.generateRandomArray(100000, 0,100);
        Long startTime = System.currentTimeMillis();
        iSort.insertionSort(testData_2);
        Long endTime = System.currentTimeMillis();
        Double runTimeSeconds = (endTime - startTime) / 1000.0;
        System.out.println(runTimeSeconds + " seconds");
    }

    // 插入排序的思想：
    // 对于当前元素，只要前面的元素比他大，那就让前面的元素依此后退
    // 直到前面没有比他大的元素的时候，把当前元素插入到那个空出来的位置
    // 插入排序对于近乎排序的数组进行排序，几乎是O(n)的时间复杂度
    public void insertionSort(E[] arr) {
        if (arr == null || arr.length <= 1) return;

        for (int i = 1; i < arr.length; i++) {
            E insertVal = arr[i];
            int insertPos = i;
            for (int j = i - 1; j >= 0; j--) {
                if (insertVal.compareTo(arr[j]) < 0) {
                    insertPos = j;
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[insertPos] = insertVal;
        }
    }

    public void insertionSort2(E[] arr) {
        if (arr == null || arr.length <= 1) return;

        for (int i = 1; i < arr.length; i++) {
            E insertVal = arr[i];
            int j;
            for (j = i; j > 0; j--) {
                if (insertVal.compareTo(arr[j - 1]) < 0) {
                    arr[j] = arr[j - 1];
                } else {
                    break;
                }
            }
            arr[j] = insertVal;
        }
    }

    public void printArray(E[] dataArr) {
        for (E data : dataArr) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

}
