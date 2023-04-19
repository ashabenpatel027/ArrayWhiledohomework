import java.util.Scanner;

public class Reverse_number_09 {
    //revers value by while loop
    public static void main(String[] args) {
        int n,r;
        System.out.println("Enter any number");
        Scanner ref =new Scanner(System.in);
        n = ref.nextInt();
        while (n>0)
        {
            r= n%10;
            System.out.println(+r);
            n=n/10;

        }
    }
}
