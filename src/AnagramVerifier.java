import java.util.Arrays;

/**
 * Created by Usuario on 21/06/2016.
 */
public class AnagramVerifier {

    public boolean areAnagrams(String firstWord,String secondWord){
        char[] firstWordArray = firstWord.toCharArray();
        char[] seconfWordArray = secondWord.toCharArray();

        Arrays.sort(firstWordArray);
        Arrays.sort(seconfWordArray);

        return Arrays.equals(firstWordArray,seconfWordArray);
    }
}
