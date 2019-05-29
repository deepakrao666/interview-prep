package prep;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void isAnagramTest() {
       assertTrue(LargestContiguousSumTest.Anagram.isAnagram("asdasd", "dsadsa"));
       assertTrue(LargestContiguousSumTest.Anagram.isAnagram("a", "a"));
       assertFalse(LargestContiguousSumTest.Anagram.isAnagram("", "a"));
       assertFalse(LargestContiguousSumTest.Anagram.isAnagram("a", ""));
       assertFalse(LargestContiguousSumTest.Anagram.isAnagram("", ""));
       assertFalse(LargestContiguousSumTest.Anagram.isAnagram(null, null));
       assertFalse(LargestContiguousSumTest.Anagram.isAnagram("", null));
       assertFalse(LargestContiguousSumTest.Anagram.isAnagram( null, null));
    }
}
