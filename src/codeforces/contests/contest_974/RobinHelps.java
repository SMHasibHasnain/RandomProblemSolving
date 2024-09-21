package codeforces.contests.contest_974;

import java.util.Scanner;

public class RobinHelps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0; i<t; i++) {
            int robinGold = 0;
            int giveCount = 0;
            int n = input.nextInt();
            int k = input.nextInt();
            for(int j=0; j<n; j++) {
                int a = input.nextInt();
                if (a>=k) {
                    robinGold+=a;
                } if (a==0 && robinGold>0) {
                    giveCount++;
                    robinGold--;
                }
            }
            System.out.println(giveCount);
        }
    }
}
