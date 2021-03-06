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
        drawDiamond(5);
        drawDiamondWithName(5, "Bill");

        fizzBuzz(100);
        generate(30);
    }

    public static void generate(int primeNum) {
        System.out.println("The Prime Factors of your number are:");
        for (int i = 2; i <= primeNum; i++) {
            int n = 0;
            while (primeNum % i == 0) {
                primeNum /= i;
                n++;
            }

            if (n != 0) {
                for (int j = n; j > 0; j--) {
                    System.out.print(i);

                    if (primeNum != 1) {
                        System.out.print(",");
                    }
                }
            }
        }
    }

    public static void fizzBuzz(int number) {
        System.out.println("Welcome to FizzBuzz:");
        for(int n=1; n<=number; n++){
            if(n%5 == 0 && n%3 ==0)
                System.out.println("FizzBuzz");

            else if (n%3 ==0)
                System.out.println("Fizz");

            else if (n%5 == 0)
                System.out.println("Buzz");

            else System.out.println(n);
        }
    }

    public static void drawDiamondWithName(int n, String name) {
        System.out.println("Draw a Diamond with name in the middle:");
        int cols = 1;
        int spaces = n/2+1;

        for(int row=0; row<n; row++) {
            if(row == n/2){
                System.out.println(name);
                cols-=2;
                spaces+=1;
                continue;
            }
            for (int s=1; s<spaces; s++){
                System.out.print(" ");
            }

            for (int i=0; i<cols; i++) {
                System.out.print("*");
            }
            System.out.println();

            if(row < n/2){
                cols+=2;
                spaces-=1;
            }
            else {
                cols-=2;
                spaces+=1;
            }
        }
    }

    public static void drawDiamond(int n) {
        System.out.println("Draw a Diamond:");
        int cols = 1;
        int spaces = n/2+1;

        for(int row=0; row<n; row++) {

            for (int s=1; s<spaces; s++){
                System.out.print(" ");
            }

            for (int i=0; i<cols; i++) {
                System.out.print("*");
            }
            System.out.println();

            if(row < n/2){
                cols+=2;
                spaces-=1;
            }
            else {
                cols-=2;
                spaces+=1;
            }
        }
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
