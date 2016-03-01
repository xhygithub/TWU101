/**
 * Created by twcn on 3/1/16.
 */
public class NumberExercise {
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

    }
}
