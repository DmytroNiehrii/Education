package hackerRank.dataStructures.bitSet;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TesterTest {
    @Test
    public void getSwappedStrings() throws Exception {

        Set<String> result = Tester.getSwappedStrings("dcba", 0);
        result.forEach(s -> System.out.println(s));
    }

}