package prep;

import org.junit.Test;

import static org.junit.Assert.*;

public class SockMerchantTest {

    @Test
    public void sockMerchant() {
        System.out.println(SockMerchant.sockMerchantProb(1, new int[]{1,2,1,2,3,4,1,2}));
        System.out.println(SockMerchant.sockMerchantProb(1, new int[]{1,2,1,2,3,4,1,2,3,4,2,2,1,2,3,4}));
        System.out.println(SockMerchant.sockMerchantProb(1, new int[]{}));
    }
}
