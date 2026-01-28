import java.io.*;
import java.util.*;
class UserMainCode
{
    public int EvenOddDigitsSum(int input1, String input2)
    {
  
        int sum = 0;

        while (input1 > 0) {
            int digit = input1 % 10;

            if (input2.equals("even") && digit % 2 == 0) {
                sum = sum + digit;
            }
            else if (input2.equals("odd") && digit % 2 != 0) {
                sum = sum + digit;
            }

            input1 = input1 / 10;
        }

        return sum;
    }
}
