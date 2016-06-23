import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by Usuario on 21/06/2016.
 */
public class AnagramVerifierTest {
    @Test
    public void testTwoStringsAreAnagrams(){
        AnagramVerifier anagramVerifier = new AnagramVerifier();
        assertTrue(anagramVerifier.areAnagrams("car", "arc"));
        assertTrue(anagramVerifier.areAnagrams("rac", "arc"));
    }

    @Test
    public void testTwoStringsAreNotAnagrams(){
        AnagramVerifier anagramVerifier = new AnagramVerifier();
        assertFalse(anagramVerifier.areAnagrams("car", "abc"));
        assertFalse(anagramVerifier.areAnagrams("mer", "arc"));
    }


    @Test
    public void testListOfAnagrams(){
        AnagramVerifier anagramVerifier = new AnagramVerifier();
        List<String> listOfAnagrams = new ArrayList<>(Arrays.asList("car","rac","arc"));
        String[] arrayTestString ={"abc","car","mer","rac","arc"};
        Map<String, List> mapTest = new HashMap<String, List>();
        mapTest.put("acr", listOfAnagrams);
        Map<String, List> resultMapSingleAnagram =anagramVerifier.getAnagrams(arrayTestString);
        assertTrue(mapTest.equals(resultMapSingleAnagram));
        assertEquals(3,resultMapSingleAnagram.get("acr").size());

        List<String> listOfacrAnagrams = new ArrayList<>(Arrays.asList("car","rac","arc"));
        List<String> listOfAmrAnagrams = new ArrayList<>(Arrays.asList("mar","amr"));
        String[] arrayWithTwoListOfAnagrams ={"abc","car","mer","rac","arc","mar","amr"};
        Map<String, List> mapTestTwoAnagrams = new HashMap<String, List>();
        mapTestTwoAnagrams.put("acr", listOfacrAnagrams);
        mapTestTwoAnagrams.put("amr", listOfAmrAnagrams);

        Map<String, List> resultMapTwoAnagram = anagramVerifier.getAnagrams(arrayWithTwoListOfAnagrams);
        assertTrue(mapTestTwoAnagrams.equals(resultMapTwoAnagram));

        assertEquals(3, resultMapTwoAnagram.get("acr").size());
        assertEquals(2,resultMapTwoAnagram.get("amr").size());

        String[] arrayNoAnyAnagram ={"abc","def","ghi","jkl","mnb"};
        assertTrue((new HashMap<String, List>()).equals(anagramVerifier.getAnagrams(arrayNoAnyAnagram)));


    }
}