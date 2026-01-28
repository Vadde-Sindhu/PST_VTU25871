import java.io.*;
import java.util.*;
class UserMainCode
{
    public int isPalinNum(int input1)
    {
        int original = input1;
        int reverse = 0;

        while (input1 > 0) {
            int digit = input1 % 10;
            reverse = reverse * 10 + digit;
            input1 = input1 / 10;
        }

        if (original == reverse) {
            return 2;   
        } else {
            return 1; 
        }
    }
}
