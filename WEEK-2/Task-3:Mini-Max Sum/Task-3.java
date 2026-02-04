import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {
   public static void miniMaxSum(List<Integer> arr) {
        long totalSum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            totalSum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        long minSum = totalSum - max; 
        long maxSum = totalSum - min; 
            System.out.println(minSum + " " + maxSum);
    }
}
    public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        Result.miniMaxSum(arr);
        bufferedReader.close();
    }
}
