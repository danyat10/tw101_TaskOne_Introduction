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
        drawDiamond(3);
    }

    public static  void drawDiamond (int n) {
        System.out.println("Draw a diamond");
        int rowsPrime = 0;
        for (int i = n+1; i>0; i--){
            for (int j = 0; j<(2*i)-1; j++) {
                System.out.print(" ");
            }

            for (int d=0; d<(2*rowsPrime)-1; d++) {
                System.out.print("*" + " ");
            }
            rowsPrime +=1;
            System.out.println(" ");
        }

        rowsPrime -= 2; // <- middle line is already printed, so skip that

        //bottom triangle
        for (int i=1; i<n+1; i++) {
            for (int j=0; j<(2*i)+1; j++) {
                System.out.print(" ");
            }
            for (int d=0; d<(2*rowsPrime)-1; d++) {
                System.out.print("*" + " ");
            }

            rowsPrime--;
            System.out.println(" ");
        }
    }

    public static  void drawIsoscelesTriangle (int n) {
        System.out.println("Draw Isosceles Triangle");
        int rowsPrime = 0;
        for (int i = n + 1; i > 0; i--) {
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print(" ");
            }

            for (int d = 0; d < (2 * rowsPrime) - 1; d++) {
                System.out.print("*" + " ");
            }
            rowsPrime += 1;
            System.out.println(" ");
        }
        System.out.println(" ");
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
