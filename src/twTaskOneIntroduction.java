/**
 * Created by danyat10 on 31/12/14.
 */
public class twTaskOneIntroduction {
    public static void main(String[] args) {
        printAsterisk();
        drawHorizontalLine(8);
        drawVerticalLine(3);
        drawRightAngle(3);

        drawIsoscelesTriangle(3);

    }

    public static void drawIsoscelesTriangle(int n) {
        System.out.println("Draw an Isosceles Triangle:");
        int cols = 1;
        int spaces = n;

        for(int row=0; row<n; row++) {

            for (int s=1; s<spaces; s++){
                System.out.print(" ");
            }

            for (int i=0; i<cols; i++) {
                System.out.print("*");
            }

            cols+=2;
            spaces-=1;
            System.out.println();
        }
    }


    public static void drawRightAngle(int n) {
        System.out.println("Draw a right angle:");
        int cols = 1;
        for(int j=0; j<n; j++) {
            for (int i = 0; i<cols; i++) {
                System.out.print("*");
            }
            System.out.println();
            cols+=1;
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
