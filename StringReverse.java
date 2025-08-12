package Arrays_String.String;

public class StringReverse {
    public static void main(String[] args) {

        //Q. Reverse a string .

        //Using inbuilt functions
        String str = "arpita";
        String reversed =new StringBuilder(str).reverse().toString();
        System.out.println(reversed);    // atipra

        // without using inbuilt functions
        String str1 = "college";
        String reverse = "";
        for(int i=str1.length()-1;i>=0;i--){
            reverse += str1.charAt(i);
        }
        System.out.println(reverse);  // egelloc

    }
}
