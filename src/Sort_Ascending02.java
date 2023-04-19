import java.util.Arrays;

public class Sort_Ascending02 {

    public static void main(String[] args) {
        // Ascending arrays value
        int a[]={25,10,50,5,2,30};
        System.out.println("Array values before ascending " + Arrays.toString(a));
        Arrays.sort(a); // this inbuilt method will make array is ascending order
        System.out.println("Array value after ascending "+ Arrays.toString(a));
    }

}
