import java.io.*;
import java.util.*;
class UserMainCode
{
    public static int sumOfSumsOfDigits(int input1)
    {
        int totalSum = 0;
        String num = String.valueOf(input1);
        int currentSum = 0;
        for (int i = 0; i < num.length(); i++)
        {
            currentSum = currentSum + (num.charAt(i) - '0');
        }
        totalSum = totalSum + currentSum;
        for (int i = 0; i < num.length() - 1; i++)
        {
            int digit = num.charAt(i) - '0';
            currentSum = currentSum - digit;
            totalSum = totalSum + currentSum;
        }

        return totalSum;
    }
}
