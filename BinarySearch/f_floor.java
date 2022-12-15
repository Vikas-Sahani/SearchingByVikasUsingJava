package BinarySearch;

// Find the greatest element which is smaller than target, from the sorted arr 
public class f_floor {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 8, 10, 12, 19 };
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int target = 5;
        int floorRes = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                floorRes = arr[mid];
                break;
            } else if (arr[mid] < target) {
                floorRes = arr[mid];
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        System.out.println(floorRes);
    }
}
