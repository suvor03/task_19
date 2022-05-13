package ru.vsu.cs.suvorov_d_a;

import org.junit.Test;
import org.junit.Assert;
import java.util.List;
import ru.vsu.cs.suvorov_d_a.utils.ArrayUtils;

public class TestOfFindingPairs {
    @Test
    public void testingArr1() {
        int[] testingInputArray = ArrayUtils.readIntArrayFromFile("testSrc/testCase/input1.txt");
        List<Integer> actualList = DifferentPairs.findPairsWithForLoop(testingInputArray, 5);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResult/output1.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testingArr2() {
        int[] testingInputArray = ArrayUtils.readIntArrayFromFile("testSrc/testCase/input2.txt");
        List<Integer> actualList = DifferentPairs.findPairsWithForLoop(testingInputArray, -3);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResult/output2.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testingArr3() {
        int[] testingInputArray = ArrayUtils.readIntArrayFromFile("testSrc/testCase/input3.txt");
        List<Integer> actualList = DifferentPairs.findPairsWithForLoop(testingInputArray, 6);
        List<Integer> correctOutputList = ArrayUtils.readListFromFile("testSrc/testResult/output3.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }
}
