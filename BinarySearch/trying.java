package BinarySearch;

public class trying {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        int arr[][] = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 } };
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    temp[i] = arr[i][j];
                }
            }
        }

    }
}
