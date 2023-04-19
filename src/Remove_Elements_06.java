import java.util.Scanner;

public class Remove_Elements_06 {
    public static void main(String[] args) {

    int size,loc,i;
    Scanner r= new Scanner(System.in);

    // user need to write total num of element
        System.out.println("Enter Array size");
        size= r.nextInt();

        //user needs to  enter each elements individual
        int a[] = new int[size];
        System.out.println("Enter array Elements:");
        for(i=0;i<size;i++)
        {
            a[i]= r.nextInt();
        }
        System.out.println(" Enter array location");//means number of element location,index start with 0
        loc=r.nextInt();
        for (i=loc;i<size-1;i++)
        {
           a[i]=a[i+1];
        }
        size--;
        for(i=0;i<size;i++)
        {
            System.out.println(a[i] + " ");
        }




}}
