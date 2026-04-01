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

    /*
     * Complete the 'matrixRotation' function below.
     *
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY matrix
     *  2. INTEGER r
     */
    public static void matrixRotation(List<List<Integer>> matrix, int r) {
    // Write your code here
     int m = matrix.size();
    int n = matrix.get(0).size();
    int layers = Math.min(m, n) / 2;
    for (int layer = 0; layer < layers; layer++) {
        List<Integer> list = new ArrayList<>();
        for (int j = layer; j < n - layer; j++)
            list.add(matrix.get(layer).get(j));
        for (int i = layer + 1; i < m - layer - 1; i++)
            list.add(matrix.get(i).get(n - layer - 1));
        for (int j = n - layer - 1; j >= layer; j--)
            list.add(matrix.get(m - layer - 1).get(j));
        for (int i = m - layer - 2; i > layer; i--)
            list.add(matrix.get(i).get(layer));
        int rot = r % list.size();
        Collections.rotate(list, -rot);
        int idx = 0;
        for (int j = layer; j < n - layer; j++)
            matrix.get(layer).set(j, list.get(idx++));
        for (int i = layer + 1; i < m - layer - 1; i++)
            matrix.get(i).set(n - layer - 1, list.get(idx++));
        for (int j = n - layer - 1; j >= layer; j--)
            matrix.get(m - layer - 1).set(j, list.get(idx++));
        for (int i = m - layer - 2; i > layer; i--)
            matrix.get(i).set(layer, list.get(idx++));
    }
    for (List<Integer> row : matrix)
        System.out.println(row.stream().map(String::valueOf).collect(java.util.stream.Collectors.joining(" ")));
}
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int m = Integer.parseInt(firstMultipleInput[0]);
        int n = Integer.parseInt(firstMultipleInput[1]);
        int r = Integer.parseInt(firstMultipleInput[2]);
        List<List<Integer>> matrix = new ArrayList<>();
        IntStream.range(0, m).forEach(i -> {
            try {
                matrix.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        Result.matrixRotation(matrix, r);
        bufferedReader.close();
    }
}
