/**
 * Created by twcn on 3/1/16.
 */
public class NumberExercise {
    public static void FizzBuzz() {
        for(int n = 1; n <= 100; n++) {
            Boolean flag = true;
            int num1 = 3, num2 = 5;
            if(n % num1 == 0) {
                System.out.print("Fizz");
                flag = false;
            }
            if(n % num2 == 0) {
                System.out.print("Buzz");
                flag = false;
            }
            if(flag)
                System.out.print(n);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Triangle Exercises:");
        System.out.println("*");


        int n = 10;
        System.out.println("draw a horizontal line: " + n);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        n = 10;
        System.out.println("draw a vertical line: " + n);
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
        n = 3;
        System.out.println("draw a right triangle: " + n);
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Diamond Exercises");
        System.out.println("Isosceles Triangle");
        int p = 10;
        for (int i = 1; i <= p; i++) {
            for (int x = 1; x <= p - i; x++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= 2 * i - 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Diamond");
        p = 10;
        for (int i = 1; i <= p; i++) {
            for (int x = 1; x <= p - i; x++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= 2 * i - 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (n = p - 1; n > 0; n--) {
            for (int m = 1; m <= p - n; m++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= 2 * n - 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("Diamond with Name:");

        p = 3;
        for (int i = 1; i <= p - 1; i++) {
            for (int x = 1; x <= p - i; x++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= 2 * i - 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Haiyan");
        for (n = p - 1; n > 0; n--) {
            for (int m = 1; m <= p - n; m++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= 2 * n - 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

        FizzBuzz();
    }
}
