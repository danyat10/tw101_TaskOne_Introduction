/**
 * Created by danyat10 on 31/12/14.
 */
public class twTaskOneIntroduction {
    public static void main(String[] args) {
        printAsterisk();
        drawHorizontalLine(8);
        drawVerticalLine(3);
        drawRightAngle(3);
    }

    public static void drawRightAngle(int n) {
        System.out.println("Draw a right angle:");
        String output = "";
        for (int i=0; i<n; i++){
            output = output+="*";
            System.out.println(output);
        }
    }

    public static void drawVerticalLine(int n) {
        int x = 0;
        System.out.println("Draw a vertical line:");
        while (x < n) {
            System.out.println("*");
            x = x + 1;
        }
    }

    public static void drawHorizontalLine(int n) {
        int x = 0;
        System.out.println("Draw a horizontal line:");
        while (x < n){
            System.out.print("*");
            x = x + 1;
        }
        System.out.println(" ");
    }

    public static void printAsterisk() {
        System.out.println("Print Asterisk on one line:");
        System.out.println("*");
    }
}
