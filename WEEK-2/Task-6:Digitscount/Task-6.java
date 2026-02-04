import java.io.*;
import java.util.*;
class UserMainCode
{
    public static int allDigitsCount(int input1)
    {
        int count = 0;
        while (input1 > 0)
        {
            input1 = input1 / 10; 
            count++;
        }
        return count;
    }
}
