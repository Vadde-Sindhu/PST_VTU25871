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
     * Complete the 'circularPalindromes' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING s as parameter.
     */

    public static List<Integer> circularPalindromes(String s) {
        int n = s.length();
        String t = s + s;

        int[] d1 = manacherOdd(t);
        int[] d2 = manacherEven(t);

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) ans[i] = 1;

        // process odd palindromes
        for (int i = 0; i < 2 * n; i++) {
            for (int k = 0; k < d1[i]; k++) {
                int l = i - k;
                int r = i + k;
                int len = r - l + 1;

                int start = Math.max(0, r - n + 1);
                int end = Math.min(n - 1, l);

                for (int rot = start; rot <= end; rot++) {
                    ans[rot] = Math.max(ans[rot], len);
                }
            }
        }

        // process even palindromes
        for (int i = 0; i < 2 * n; i++) {
            for (int k = 0; k < d2[i]; k++) {
                int l = i - k - 1;
                int r = i + k;
                int len = r - l + 1;

                int start = Math.max(0, r - n + 1);
                int end = Math.min(n - 1, l);

                for (int rot = start; rot <= end; rot++) {
                    ans[rot] = Math.max(ans[rot], len);
                }
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int x : ans) res.add(x);
        return res;
    }

    private static int[] manacherOdd(String s) {
        int n = s.length();
        int[] d = new int[n];
        int l = 0, r = -1;

        for (int i = 0; i < n; i++) {
            int k = (i > r) ? 1 : Math.min(d[l + r - i], r - i + 1);

            while (i - k >= 0 && i + k < n &&
                   s.charAt(i - k) == s.charAt(i + k)) {
                k++;
            }

            d[i] = k--;

            if (i + k > r) {
                l = i - k;
                r = i + k;
            }
        }

        return d;
    }

    private static int[] manacherEven(String s) {
        int n = s.length();
        int[] d = new int[n];
        int l = 0, r = -1;

        for (int i = 0; i < n; i++) {
            int k = (i > r) ? 0 : Math.min(d[l + r - i + 1], r - i + 1);

            while (i - k - 1 >= 0 && i + k < n &&
                   s.charAt(i - k - 1) == s.charAt(i + k)) {
                k++;
            }

            d[i] = k--;

            if (i + k > r) {
                l = i - k - 1;
                r = i + k;
            }
        }

        return d;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        List<Integer> result = Result.circularPalindromes(s);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
