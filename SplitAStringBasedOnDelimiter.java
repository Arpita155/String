package Arrays_String.String;

public class SplitAStringBasedOnDelimiter {
    public static void main(String[] args) {

        //Q5. Split a string based on a delimiter:
        String str = "apple,banana,orange";
        String [] fruits = str.split(",");
        for(String fruit:fruits){
            System.out.println(fruit);
        }

    }
}
