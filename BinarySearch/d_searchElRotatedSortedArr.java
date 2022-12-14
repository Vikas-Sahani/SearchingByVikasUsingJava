package BinarySearch;

public class d_searchElRotatedSortedArr {
    public static int bs(int nums[], int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) { //
                return mid;
            } else if (nums[mid] > target) {
                end = end - 1;
            } else if (nums[mid] < target) {
                start = start + 1;
            }
        }
        return -1;
    }

    public static int returnMinEl(int nums[]) {
        int start = 0;
        int end = nums.length - 1;
        int n = nums.length;
        // int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;
            if (nums[mid] <= nums[prev] && nums[mid] <= nums[next]) {
                return mid;
            } else if (nums[mid] <= nums[end]) {
                end = mid - 1;
            } else if (nums[mid] >= nums[start]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1 };
        int target = 2;
        int minElIdx = returnMinEl(nums);
        if (bs(nums, 0, minElIdx, target) == -1) {
            System.out.println(bs(nums, minElIdx, nums.length - 1, target)); //
        } else {
            System.out.println(bs(nums, 0, minElIdx, target));
        }
    }
}