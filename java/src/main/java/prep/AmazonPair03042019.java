package prep;

public class AmazonPair03042019 {

    // data set =
    // a, 1 --> b
    // a, 3 --> c
    //fs, 3 -- iv
    static final char[] small = initArray(26, false);
    static final char[] big = initArray(26, true);

    static String stepTheString(String text, int step) {
        if (step == 0) {
            return text;
        }

        String op = "";
        char[] arr = text.toCharArray();
        int position;
        for (int i = 0; i < arr.length; i++) {
            int charVal = (int) arr[i];
            char thisChar = arr[i];
            if (65 <= charVal && charVal <= 90) {
                position = findPosition(true, thisChar);
                op = op + big[rotatePosition(position, step)];
            } else {
                if (97 <= charVal && charVal <= 122) {
                    position = findPosition(false, thisChar);
                    op = op + small[rotatePosition(position, step)];
                }
            }

        }

        return op;
    }

    static int rotatePosition(int position, int step) {
        int rotate = Math.abs(step);
        if (0 < step) {
            for (int j = 0; j < rotate; j++) {
                if (position == 26) {
                    position = 0;
                }
                position = position + 1;
            }
        } else if (step < 0) {
            for (int j = 0; j < rotate; j++) {
                if (position <= 0) {
                    position = 25;
                }
                position = position - 1;
            }
        }
        return position;
    }

    static int findPosition(boolean isBig, char thisChar) {
        int position = 0;
        if (isBig) {
            for (int j = 0; j < 26; j++) {
                if (thisChar == big[j]) {
                    position = j;
                }
            }
        } else {
            for (int j = 0; j < 26; j++) {
                if (thisChar == small[j]) {
                    position = j;
                }
            }
        }
        return position;
    }

    static char[] initArray(int size, boolean isCaps) {
        char arr[] = new char[size];
        int counter;
        if (isCaps) {
            counter = 65;
        } else {
            counter = 97;
        }
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) counter;
            counter++;
        }
        return arr;
    }
}
