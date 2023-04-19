import java.util.Arrays;

public class Array_Equal01 {
    public static void main(String[] args) {
        //checking two arrays are equal or not

        int a1[]={1,2,3,4,5}; // change the value for one of them and check the result
        int a2[]={1,2,3,4,5};
        boolean status= Arrays.equals(a1, a2);
        if (status==true)
        {
            System.out.println("Arrays are equal");
    }
        else {
            System.out.println("Arrays are NOT equal ");
        }

}}
