package Arrays_String.String;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        //Q. Find the first non-repeating character of a string.
        String str = "swiss";
        int[] freq = new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)]==1){
                System.out.println("first non-repeating character: "+str.charAt(i));
                break;
            }
        }

    }
}
