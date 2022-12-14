package BinarySearch;

public class b_CountOfEl {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 10, 10, 10, 18, 20 };
        int seachingEl = 10;
        int first = firstOccurrenceOfEl(arr, seachingEl);
        int last = lastOccurrenceOfEl(arr, seachingEl);

        System.out.println(last - first + 1);
    }

    public static int firstOccurrenceOfEl(int arr[], int seachingEl) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (seachingEl == arr[mid]) {
                res = mid;
                end = mid - 1; // for first occurrence of 10
                // start = mid + 1; // for last occurrence of 10
            } else if (seachingEl > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return res;
    }

    public static int lastOccurrenceOfEl(int arr[], int seachingEl) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (seachingEl == arr[mid]) {
                res = mid;
                // end = mid - 1; //for first occurrence of 10
                start = mid + 1; // for last occurrence of 10
            } else if (seachingEl > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
}
