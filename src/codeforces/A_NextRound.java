import java.util.Scanner;
public class A_NextRound {
    public static void main(String[] args) {
        int n, k, count;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        k = input.nextInt();
        int[] arr = new int[n];
        count = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(arr[i] >= arr[k-1] && arr[i]>0) {
                //System.out.println(arr[i] + " " + arr[k-1] + " Yes");
                count++;
            }
        }
        System.out.println(count);
    }
}
