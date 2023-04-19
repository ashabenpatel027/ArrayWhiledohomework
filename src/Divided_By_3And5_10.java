public class Divided_By_3And5_10 {
    //printing number which divided by 3 and 5

    public static void main(String[] args) {
        // divided by 3 till 100
        System.out.println(" Number divisible by 3");
        for (int i=1; i<=100;i++){
            if ( i%3==0)
                System.out.println(i+ ",");
        }
        // divided by 5 till 100
        System.out.println(" Number divisible by 5");
        for ( int i=1; i<=100; i++)
        {
            if (i%5==0){
                System.out.println(i+ ",");
            }
        }
}}
