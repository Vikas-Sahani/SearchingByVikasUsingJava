package Searching;

public class GamoraGOG {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 5; // sc.nextInt();
        int BH[] = { 3, 4, 3, 2, 4 }; // new int[n];
        int maxBH = 0;

        for (int i = 0; i < n; i++) {
            // BH[i]=sc.nextInt();
            if (BH[i] > maxBH) {
                maxBH = BH[i];
            }
        }
        int IThrust = 0; // IThrust = initial Thrust
        for (int GT = 0; GT <= maxBH; GT++) {
            long temp = GT;
            for (int i = 0; i < n; i++) {
                temp = 2 * temp - BH[i];
                if (temp >= Integer.MAX_VALUE) { // thrust should not pass the max limit of Integer.MAX_VALUE because
                                                 // thrust cann't be surpass the max limit
                    IThrust = GT;
                    break;
                }
                if (temp < 0) { // thrust should not pass the min limit of 0 because thrust can't be 0
                    break;
                }
            }
            if (temp >= 0) {
                IThrust = GT;
                break;
            }
        }
        System.out.print(IThrust);
    }
}
