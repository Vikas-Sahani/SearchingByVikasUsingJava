package BinarySearch;

public class a_Find_i_FirstOccurence {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 10, 10, 10, 18, 20 };
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        int seachingEl = 10;
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
        System.out.println(res);
    }
}