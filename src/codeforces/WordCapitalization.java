import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.println(word.substring(0,1).toUpperCase() + word.substring(1));
    }
}
