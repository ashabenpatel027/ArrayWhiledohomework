import java.util.Scanner;

public class Armstrong_11 {
    public static void main(String[] args) {
        //armstrong nub calculation =153=(1*1*1)+(5*5*5)+(3*3*3)= 153
        int n,arm =0,rem,c;
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        c=n;
        while (n>0)
        {
            rem=n%10;
            arm=(rem*rem*rem) + arm;
            n=n/10;
    }
        if (c==arm)
            System.out.println("Armstrong number");
        else
            System.out.println(" Not Armstrong number");
}}
