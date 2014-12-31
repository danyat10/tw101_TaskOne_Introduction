/**
 * Created by danyat10 on 31/12/14.
 */
public class twTaskOneIntroduction {
    public static void main(String[] args) {
        printAsterisk();
        printNumOfAsterisks(10);
        
    }

    public static void printNumOfAsterisks(int n) {
        int x = 0;
        while (x < n){
            System.out.print("*");
            x = x + 1;
        }
    }

    public static void printAsterisk() {
        System.out.println("Print Asterisk on one line:");
        System.out.println("*");
    }
}
