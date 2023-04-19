import java.util.Arrays;
import java.util.HashSet;

public class Common_String_Array07 {
    public static void main(String[] args) {
        // 2 different string
        String [] arr1 ={"May","June","Java","Python", "Dart"};
        String [] arr2 ={"Kokila","Bird","May","Colours","Pin"};

            System.out.println("Array1:" + Arrays.toString(arr1));
            System.out.println("Array2:" + Arrays.toString(arr2));
            //  calling object to save string value
             HashSet < String>set=new HashSet< String>();

            for (int i =0;i<arr1.length; i++) { // work for first string
        for (int j=0;j<arr2.length;j++){ // work for second string
            if( arr1[i]==arr2[j]){
                set.add(arr1[i]);
        }

    }
}
        System.out.println(" Common Array: " +set);
    }}
