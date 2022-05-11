package ru.vsu.cs.suvorov_d_a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;


public class FindPairs {
    public static void execute(int[] input, int sum) {
        final StringBuilder inputArray = new StringBuilder();
        inputArray.append("{");
        IntStream.range(0, input.length).forEach(i -> inputArray.append(input[i] + ", "));
        inputArray.append("}");

        System.out.println(" Given number array: " + inputArray.toString());
        System.out.println(" Given sum: " + sum);

        System.out.println("~ All different pairs ~");
        getDifferentPairs(input, sum);

        System.out.println("~ All existing pairs ~" );
        getExistingPairs(input, sum);
    }

    public static List<Integer> getExistingPairs(int[] input, int sum) {
        List<Integer> pairs = new ArrayList<>();

        pairs = ExistingPairs.findPairsWithForLoop(input, sum);

        final StringBuilder output1 = new StringBuilder();
        pairs.forEach((pair) -> output1.append("{" + pair + ", " + (sum - pair) + "}, "));

        System.out.println(output1.toString().substring(0, output1.length() - 2));

        return pairs;
    }

    public static List<Integer> getDifferentPairs(int[] input, int sum) {
        List<Integer> pairs = new ArrayList<>();

        pairs = DifferentPairs.findPairsWithForLoop(input, sum);

        final StringBuilder output2 = new StringBuilder();
        pairs.forEach((pair) -> output2.append("{" + pair + ", " + (sum - pair) + "}, "));

        System.out.println(output2.toString().substring(0, output2.length() - 2));

        return pairs;
    }

    public static int readSum() {
        System.out.println("Enter the value of the sum S: ");
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        return s;
    }
}