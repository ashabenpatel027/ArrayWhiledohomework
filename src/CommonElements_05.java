import java.util.HashSet;

public class CommonElements_05 {
    public static void main(String[] args) {
        int[]arr1={4,3,7,9,2,4};
        int[]arr2={5,1,4,8,3,5};
        //HashSet will stop Duplicate elements
        //Hashset object calling
        HashSet<Integer>hs1=new HashSet<>();
        HashSet<Integer>hs2=new HashSet<>();
        for (int no:arr1)
        {
            hs1.add(no);
        }
        for (int no:arr2)// array two elements will add below  loop
        {
           hs2.add(no);
        }
        for (int no :hs2) // hs2 elements will add in hs1
            {
              boolean b=  hs1.add(no);// if is common elements in hs2 then won't add in hs1
                if(b==false)
                {
                    System.out.println(no);
                }
                }
}}
