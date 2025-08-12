package Arrays_String.String;

public class Palindrome {
    public static void main(String[] args) {

        //Q2. Check if a string is palindrome or not.
        String str = "maam";
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)){
            System.out.println("the string "+str+" is palindrome");
        }else{
            System.out.println("the string "+str+" is not palindrome");
        }

    }
}
