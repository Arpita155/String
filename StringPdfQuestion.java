package Arrays_String.String;

public class StringPdfQuestion {
    public static void main(String []args){

        // String creation :
        /*String a = "hello";
        String b = "hello";   // stored in string pool in heap memory.
        String c = new String("hello");  // create new object and stored in heap memory.
        System.out.println("a==b:"+(a==b));
        */

        //-------------------------------------------METHODS of strings----------------------------------------:
        /*
        //1. concat():   add two string
        String s1 = "summer";
        s1 = s1+ " internship";
        System.out.println("s1 = "+s1);

        String  s2 = "keep practicing for ";
        s2.concat(s1);    // this statement wont make s2 = "keep practicing for summer internship"
        System.out.println(s2.concat(s1));   // OUTPUT : "keep practicing for summer internship"
        System.out.println("s2= "+s2);    // OUTPUT : " keep practicing for "
         */

        /*
        // 2. length() :  returns the length of the string.
        // Ex1.
        String  temp = "I am teaching you string";
        System.out.println(temp.length());   // 24 including space

        // Ex2.
        String  a = "arpita";
        System.out.println(a.length());  // 6
        */

        //3. charAt(index) :   returns the character at the specified index. String follows 0 based indexing .
        /*String a = "arpita";
        System.out.println(a.charAt(4));   // t
         */


        //4. substring (start_index,end_index_excluded)  : method returns a substring from the calling string object .
        // substring excluded the character end_index.
        /*String a = "arpita";
        System.out.println(a.substring(1,4));  // rpi

        // substring(start_index) method returns the substring starting from the start_index of the given string.
        String a = "arpita";
        System.out.println(a.substring(2));   // pita
        */

        // 5.  .equals(String_obj) : compare two strings and return a boolean result . it compares the value of the string character by character .
        // however it is different from "==" operator .
        /*String a = "arpita";
        String b= "sahoo";
        System.out.println(a.equals(b));   // false
        */

        // 6. contains() : returns true if 1 string is a substring of other string .
        /*String a = "arpita";
        System.out.println(a.contains("ar"));   // true
        System.out.println(a.contains("you"));   // false
        */

        // 7. indexOf() : returns the index of a given character/substring within a string.
        // It returns -1 if doesn't find the given character/substring.
        // there are many overloaded implementation of indexOf() method available . Use them as per requirement.
        /*String a = "arpita";
        System.out.println(a.indexOf("p"));  // 2
        System.out.println(a.indexOf("y"));   // -1 because cant find the character
        */

        //8. str1.compareTo(str2) : returns the value 0 if the argument string is equal to this string.
        // a value less than 0 if str1 is lexicographically (alphabetically) less than the string str2 .
        // a value grater than 0 if str1 is lexicographically (alphabetically) greater than the string str2 .
        /*System.out.println("hello".compareTo("hhllo"));  // -3
        System.out.println("kake".compareTo("kaka"));  // 4
        System.out.println("hello".compareTo("hello"));    // 0
        */


        // -----------------------------------QUESTIONS-----------------------------------:
        //concatenation
        /*String s1 = "keep";
        String  s2 = s1;
        s1 = s1 + "calm";
        //System.out.println(s1);   // keepcalm
        //System.out.println(s2);   //   keep
        System.out.println(s1==s2); // false
        */

        //Q1. How to compare two string.
        /*String  str1 = "Hello";
        String  str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1==str2);
        System.out.println(str1==str3);  // It checks the references/address of two string.
        System.out.println(str1.equals(str3));   // It checks the value of two string.
        */

        //Q2. How to concatenate two string
        /*String str1 = "Hello";
        String  str2 = "World";
        String result= str1+str2;
        System.out.println(result);   // using '+' operator
        System.out.println(str1.concat(str2));   // using concat method
        */

        //Q3. Example of substring method.
        /*String str = "Hello, World";
        String subStr = str.substring(3,9);
        System.out.println(subStr);
         */

        //Q4. Example of `trim()`,`toUpperCase()`,`toLowerCase()`:
        /*String str  = "  Hello World  ";
        System.out.println(str.trim());   // trim() method--> removes the whitespaces from the beginning and end of the string. OUTPUT--> Hello World
        System.out.println(str.toUpperCase());  // OUTPUT--> HELLO WORLD
        System.out.println(str.toLowerCase());  // OUTPUT-->hello world
        */

        //Q5. Converting a string to a character array by using --> toCharArray() method.
        /*String str = "arpita";
        char[] charArray = str.toCharArray();
        System.out.println(Arrays.toString(charArray));  // [a,r,p,i,t,a]
        */

        // -------------Advanced Questions of Strings---------------------:
        //Q1. Reverse a string .
        //Using inbuilt functions
        /*String str = "arpita";
        String reversed =new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
        */
        // without using inbuilt functions
        /*String str1 = "arpita";
        String reverse = "";
        for(int i=str1.length()-1;i>=0;i--){
            reverse+=str1.charAt(i);
        }
        System.out.println(reverse);  // atipra
        */

        //Q2. Check if a string is palindrome or not.
        /*String str = "maam";
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)){
            System.out.println("the string "+str+" is palindrome");
        }else{
            System.out.println("the string "+str+" is not palindrome");
        }
         */

        //Q3. Count the occurrence of each character.
        /*String str = "i am arpita";
        int[] occu = new int[150];
        for(int i=0;i<str.length();i++){
            occu[str.charAt(i)]++;
        }
        for(int i=0;i<150;i++){
            if(occu[i]>0){
                System.out.println((char) i+":"+occu[i]);
            }
        }
        */

        //Q4. Remove duplicate character from a string.
//        String  str = "programming";

        //Q5. Split a string based on a delimiter:
        /*String str = "apple,banana,orange";
        String [] fruits = str.split(",");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        */

        //Q6. Find the first non-repeating character of a string.
        /*String str = "swiss";
        int[] freq = new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)]==1){
                System.out.println("first non-repeating character "+str.charAt(i));
                break;
            }
        }
        */

        //Q7. Check if two string are anagrams
        /*String str1 = "arpita";
        String  str2 = "atirap";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("not anagrams");
        }
        */

        
    }
}
