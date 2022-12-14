package BinarySearch;

public class e_searchEl_in_NearlySortedArr {
    public static void main(String[] args) {
        // Input: arr[] = {10, 3, 40, 20, 50, 80, 70}, key = 40
        // Output: 2
        // Output is index of 40 in given array
        int arr[] = { 10, 3, 40, 20, 50, 80, 70 };
        int target = 90;
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                res = mid;
                break;
            } else if (mid - 1 >= start && arr[mid - 1] == target) {
                res = mid - 1;
                break;
            } else if (mid + 1 <= end && arr[mid + 1] == target) {
                res = mid + 1;
                break;
            } else if (arr[mid] > target) {
                end = mid - 2;
            } else if (arr[mid] < target) {
                start = mid + 2;
            }
        }
        System.out.println(res);
    }
}