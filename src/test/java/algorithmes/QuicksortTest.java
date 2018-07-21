package algorithmes;


import org.junit.Test;

import static algorithmes.QuicksortExample.getArray;
import static algorithmes.QuicksortExample.printArray;
import static algorithmes.QuicksortExample.sort;

public class QuicksortTest {

    @Test
    public void quickSort() {
        int[] a = getArray();
        printArray(a);
        sort(a);
        System.out.println("");
        printArray(a);
    }

}
