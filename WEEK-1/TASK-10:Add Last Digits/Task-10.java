import java.io.*;
import java.util.*;
class UserMainCode
{
    public int addLastDigits(int input1, int input2)
    {
        int a = Math.abs(input1 % 10);
        int b = Math.abs(input2 % 10);
        int sum = a + b;

        return sum;
    }
}
