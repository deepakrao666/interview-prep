package advanced;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

public class ArrayManipulationHRTest {

    @Test
    public void arrayManipulation() {
        String line;
        int[][] ct;
        try {
            BufferedReader bufferreader =
                    new BufferedReader(new FileReader("D:\\Dev\\gitCloneMain\\interview-prep\\ArrayMani.txt"));
            String[] arr = new String[0];
            while ((line = bufferreader.readLine()) != null) {
                arr = line.split(" ");
                break;
            }
            ct = new int[Integer.parseInt(arr[0])][Integer.parseInt(arr[1])];
            int i = 0;
            while ((line = bufferreader.readLine()) != null) {
                arr = line.split(" ");
                for(String s: arr){
                    System.out.print(s+" ");
                }
                System.out.println();
                ct[i][0] = Integer.parseInt(arr[0]);
                ct[i][1] = Integer.parseInt(arr[1]);
                ct[i][2] = Integer.parseInt(arr[2]);
                System.out.println(ct[i][0]+" "+ct[i][1]+" "+ct[i][2]);
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[0].length; col++) {
//                System.out.print(arr[row][col]);
//            }
//            System.out.println();
//        }
//        System.out.println(ArrayManipulationHR.arrayManipulation(10, arr));

    }
}
