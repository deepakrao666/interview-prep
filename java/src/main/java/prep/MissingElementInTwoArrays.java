package prep;
    /*
    *
    Concept by arden dertat
    Let’s analyze why this approach works.
    What happens when we XOR two numbers? We
    should think bitwise, instead of decimal.
    XORing a 4-bit number with 1011 would flip
    the first, third, and fourth bits of the
    number. XORing the result again with 1011
    would flip those bits back to their original
    value. So, if we XOR a number two times with
    some number nothing will change. We can also
    XOR with multiple numbers and the order would
    not matter. For example, say we XOR the number
    n1 with n2, then XOR the result with n3, then XOR
    their result with n2, and then with n3. The final
    result would be the original number n1. Because every
    XOR operation flips some bits and when we XOR with the
    same number again, we flip those bits back. So the
    order of XOR operations is not important. If we XOR a
    number with some number an odd number of times,
    there will be no effect.
    *
    */
public class MissingElementInTwoArrays {
    static int missingElement(int arr[], int arr2[]) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
            if (i < arr2.length) {
                result = result ^ arr2[i];
            }
        }
        return result;
    }
}
