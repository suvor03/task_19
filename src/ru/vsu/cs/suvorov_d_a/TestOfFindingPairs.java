package ru.vsu.cs.suvorov_d_a;

import org.junit.Test;
import org.junit.Assert;
import java.util.List;
import ru.vsu.cs.suvorov_d_a.utils.ArrayUtils;

public class TestOfFindingPairs {
    @Test
    public void testingArr1() {
        int[] testingInputArray = ArrayUtils.readIntArrayFromFile("input.txt");
        List<Integer> actualList = DifferentPairs.findPairsWithForLoop(testingInputArray, 5);
        int[] correctOutputList = ArrayUtils.readIntArrayFromFile("testSrc/testResult/output1.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }
}
