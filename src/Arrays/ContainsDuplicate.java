package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};

        Boolean isDuplicate = isDuplicate(arr);
        System.out.println(isDuplicate);

    }

    public static boolean isDuplicate(int arr[]){
        Set<Integer> set = new HashSet<>();

        for(int intSet : arr){
            if(set.contains(intSet))
                return true;

            set.add(intSet);
        }
        return false;
    }
}
