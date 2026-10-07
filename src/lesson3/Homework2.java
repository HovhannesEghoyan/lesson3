package lesson3;

public class Homework2 {
    public static void main(String[] args) {
        /**


         0 1
         1 2
         2 3
         3 4
         *               4 5
         * *
         * * *
         * * * *
         * * * * *
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println("________");

/**
 *****
 ****
 ***
 **
 *
 */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println("______");


        /**
         *
         **
         ***
         ****
         *****

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_______");
/**
 *****
 ****
 ***
 **
 *
 */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5 - i; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println("______");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
            for (int i = 4; i >= 1; i--) {
                for (int k = 1; k <=5-i; k++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <=i; k++) {
                    System.out.print("* ");

                }
                System.out.println();
            }

        }


    }






