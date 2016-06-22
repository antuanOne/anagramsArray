import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Usuario on 21/06/2016.
 */
public class AnagramVerifierTest {
    @Test
    public void testTwoStringsAreAnagrams(){
        AnagramVerifier anagranVerifier = new AnagramVerifier();
        assertTrue(anagranVerifier.areAnagrams("car","arc"));
        assertTrue(anagranVerifier.areAnagrams("rac","arc"));
    }

    @Test
    public void testTwoStringsAreNotAnagrams(){
        AnagramVerifier anagranVerifier = new AnagramVerifier();
        assertFalse(anagranVerifier.areAnagrams("car","abc"));
        assertFalse(anagranVerifier.areAnagrams("mer","arc"));
    }
}