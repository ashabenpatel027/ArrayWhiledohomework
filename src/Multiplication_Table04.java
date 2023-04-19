import java.util.Scanner;

public class Multiplication_Table04 {

        // Multiplication by DO while for loop
        static void ss(int n) {
            int i = 1;
            do {
                System.out.println(n * i + " ");
                i = i + 1;
            } while (i <= 6);
            System.out.println(" ");
        }

    public static void main(String[] args) {
        int i=1;
        do {
            ss(i);
            i=i+1;
    }while (i<=6);
 
}}
