package Arrays_String.String;

import java.util.Arrays;

public class CheckAnagrams {
    public static void main(String[] args) {

        //Q. Check if two string are anagrams
        String str1 = "arpita";
        String  str2 = "atirap";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Two strings are Anagrams");
        }else{
            System.out.println("Two strings are not anagrams");
        }

    }
}
