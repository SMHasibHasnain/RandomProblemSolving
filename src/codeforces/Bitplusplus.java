import java.util.Scanner;

public class Bitplusplus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 0;
        for(int i=0; i<n; i++) {
            //char temp = input.next().charAt(0);
            String s = input.next();
            if( s.equals("X++") || s.equals("++X") ) {
                x++;
            } else if(s.equals("X--") || s.equals("--X")) {
                x--;
            }
        }
        System.out.println(x);
    }
}
