import java.io.*;
import java.util.*;
class UserMainCode
{
    public static int isPalindrome(String input1)
    {
        String s = input1.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right)
        {
            if (s.charAt(left) != s.charAt(right))
            {
                return 1;   
            }
            left++;
            right--;
        }

        return 2;   
    }
}
