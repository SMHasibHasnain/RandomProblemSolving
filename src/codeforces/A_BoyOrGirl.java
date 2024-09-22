import java.util.Scanner;

public class A_BoyOrGirl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int n = name.length();

        char[] unique = new char[n];
        int count = 0;

        for(int i = 0; i < n; i++) {
            boolean isUnique = true;
            for(int j = 0; j < count; j++) {
                if(name.charAt(i) == unique[j]) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) {
                unique[count] = name.charAt(i);
                count++;
            }
        }

        if(count%2 != 0) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }


    }
}
