import java.util.Arrays;
import java.util.Scanner;

public class MafiaTournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of test cases
        int t = sc.nextInt();

        // Process each test case
        while (t-- > 0) {
            // Number of fighters
            int n = sc.nextInt();

            // Ratings of fighters
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Sort the ratings in ascending order
            Arrays.sort(a);

            // We want to minimize the reduction of the last remaining fighter.
            // The strategy is to minimize the impact of eliminating weaker fighters.
            long totalSum = 0;
            for (int i = 0; i < n - 1; i++) {
                totalSum += a[i];
            }

            // The result is the difference between the strongest fighter and the total sum of others
            System.out.println(a[n - 1] - totalSum);
        }

        sc.close();
    }
}
