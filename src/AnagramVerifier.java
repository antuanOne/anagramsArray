import java.util.*;

/**
 * Created by Usuario on 21/06/2016.
 */
public class AnagramVerifier {

    public boolean areAnagrams(String firstWord, String secondWord) {
        char[] firstWordArray = firstWord.toCharArray();
        char[] seconfWordArray = secondWord.toCharArray();

        Arrays.sort(firstWordArray);
        Arrays.sort(seconfWordArray);

        return Arrays.equals(firstWordArray, seconfWordArray);
    }

    public Map<String, List> getAnagrams(String[] arrayTestString) {

        Map<String, List> mapTest = new HashMap<String, List>();

        for (String word : arrayTestString) {
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            if (mapTest.containsKey(String.valueOf(wordArray))) {
                mapTest.get(String.valueOf(wordArray)).add(word);
            } else {
                mapTest.put(String.valueOf(wordArray), new ArrayList<>(Arrays.asList(word)));
            }
        }


        Iterator<Map.Entry<String, List>> it = mapTest.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, List> e = it.next();
            String key = e.getKey();
            List value = e.getValue();
            if (value.size() == 1) {
                it.remove();
            }
        }


        return mapTest;
    }

}
