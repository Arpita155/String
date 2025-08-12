package Arrays_String.String;

public class OccurrenceOfCharacters {
    public static void main(String[] args) {

        //Q. Count the occurrence of each character.
        String str = "i am arpita";
        int[] occu = new int[150];
        for(int i=0;i<str.length();i++){
            occu[str.charAt(i)]++;
        }
        for(int i=0;i<150;i++){
            if(occu[i]>0){
                System.out.println((char) i+":"+occu[i]);
            }
        }

    }
}
