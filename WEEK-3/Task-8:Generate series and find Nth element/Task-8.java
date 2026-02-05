import java.io.*;
import java.util.*;
class UserMainCode
{
    public int seriesN(int input1, int input2, int input3, int input4)
    {
        int a = input1;
        int b = input2;
        int c = input3;
        int n = input4;
        if (n == 1) return a;
        if (n == 2) return b;
        if (n == 3) return c;
        int d1 = b - a;
        int d2 = c - b;
        int current = c;
        for (int i = 4; i <= n; i++) {
            if (i % 2 == 0) {
                current += d1;
            } else {
                current += d2;
            }
        }
        return current;
    }
}
