import java.util.Scanner;

public class A_Team {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int result = 0;

        for (int i = 0; i < n; i++) {
            int petya = input.nextInt();
            int vasya = input.nextInt();
            int tanya = input.nextInt();
            if(petya + vasya + tanya >= 2) {
                result++;
            }
        }

        System.out.print(result);
    }
}
