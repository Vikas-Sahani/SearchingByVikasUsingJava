package Searching.BinarySearch;

public class c_CountRotaion {
    public static void main(String[] args) {
        // searching for minimum element in sorted roteated array
        int arr[] = { 11, 12, 15, 18, 2, 5, 6, 8 };
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        // int searchEl = 10;
        int res = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;
            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) { // lowest element has feature that it will be smaller
                                                                  // than it's next element and it's previous element
                res = mid;
                break;
            } else if (arr[mid] <= arr[end]) { // this condition must come first before the below condition
                end = mid - 1;
            } else if (arr[mid] >= arr[start]) { // it start idx to mid idx is sorted
                start = mid + 1;
            }
        }
        System.err.println(res);
    }
}
