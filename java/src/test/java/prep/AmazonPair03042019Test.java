package prep;

import org.junit.Test;

import static org.junit.Assert.*;

public class AmazonPair03042019Test {

    @Test
    public void stepTheStringTest() {
        System.out.println(AmazonPair03042019.stepTheString("AsD", 3));
        System.out.println(AmazonPair03042019.stepTheString("CHAnuNanga", 0));
        System.out.println(AmazonPair03042019.stepTheString("SKELETON", 500));
        System.out.println(AmazonPair03042019.stepTheString("anila", 0400));
        System.out.println(AmazonPair03042019.stepTheString("AsD", -30));
        System.out.println(AmazonPair03042019.stepTheString("deepak", -62));
        System.out.println(AmazonPair03042019.stepTheString("qwe", -57));
        System.out.println(AmazonPair03042019.stepTheString("ASDqwezxcASDF", 5));
    }
}