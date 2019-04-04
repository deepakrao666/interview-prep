package prep;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void isAnagramTest() {
       assertTrue(Anagram.isAnagram("asdasd", "dsadsa"));
       assertTrue(Anagram.isAnagram("a", "a"));
       assertFalse(Anagram.isAnagram("", "a"));
       assertFalse(Anagram.isAnagram("a", ""));
       assertFalse(Anagram.isAnagram("", ""));
       assertFalse(Anagram.isAnagram(null, null));
       assertFalse(Anagram.isAnagram("", null));
       assertFalse(Anagram.isAnagram( null, null));
    }
}