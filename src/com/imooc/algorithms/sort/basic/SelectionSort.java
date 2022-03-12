package com.imooc.algorithms.sort.basic;

public class SelectionSort<E extends Comparable<E>> {

    public static void main(String[] args) {
        SelectionSort<Integer> ss = new SelectionSort<>();
        Integer[] testData = {5, 8, 9, 2, 99, 44, 3};
        ss.selectionSort(testData);
        ss.printArray(testData);

        SelectionSort<String> ss_2 = new SelectionSort<>();
        String[] testData_2 = {"c", "d", "b", "a", "f"};
        ss_2.selectionSort(testData_2);
        ss_2.printArray(testData_2);


        Student st1 = new Student("Ali", "Wong");
        Student st2 = new Student("Grace", "Zhu");
        Student st3 = new Student("Peter", "Hong");
        Student[] sts = {st1, st2, st3};
        SelectionSort<Student> ss_3 = new SelectionSort<>();
        ss_3.selectionSort(sts);
        ss_3.printArray(sts);

        Integer[] randomArr = SortTestHelper.generateRandomArray(100000, 0, 100);
        Long startTime = System.currentTimeMillis();
        ss.selectionSort(randomArr);
        Long endTime = System.currentTimeMillis();
        Double runTimeSeconds = (endTime - startTime) / 1000.0;
        System.out.println(runTimeSeconds + " seconds");

    }

    public void selectionSort(E[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            this.swap(i, minIndex, arr);
        }
    }

    private void swap(int i, int j, E[] arr) {
        E tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void printArray(E[] dataArr) {
        for (E data : dataArr) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
}
