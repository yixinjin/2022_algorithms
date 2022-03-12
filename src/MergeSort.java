public class MergeSort {

    public static void main(String[] args) {
        System.out.println("This is a merge sort!");

        int[] arr = {1, 6, 2, 3, 6, 5, 4, 9, 0, 12, 10};
        mergeSort(0, arr.length - 1, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void mergeSort(int left, int right, int[] arr) {
        if (left == right) return;
        int mid = (left + right) / 2;
        mergeSort(left, mid, arr);
        mergeSort(mid + 1, right, arr);
        mergeTwoSortedPart(left, mid, right, arr);
    }

    // Sorted arrLeft: arr[left, mid];
    // Sorted arrRight: arr[mid + 1, right];
    private static void mergeTwoSortedPart(int left, int mid, int right, int[] arr) {
        int[] tempArr = new int[right - left + 1];
        int arrLeftIndex = left;
        int arrRightIndex = mid + 1;
        int tempArrIndex = 0;

        while(arrLeftIndex <= mid && arrRightIndex <= right) {
            if (arr[arrLeftIndex] < arr[arrRightIndex]) {
                tempArr[tempArrIndex] = arr[arrLeftIndex++];
            } else {
                tempArr[tempArrIndex] = arr[arrRightIndex++];
            }
            tempArrIndex++;
        }

        while(arrLeftIndex <= mid) {
            tempArr[tempArrIndex++] = arr[arrLeftIndex++];
        }

        while(arrRightIndex <= right) {
            tempArr[tempArrIndex++] = arr[arrRightIndex++];
        }

        for (int i = left; i <= right; i++) {
            arr[i] = tempArr[i - left];
        }
    }
}