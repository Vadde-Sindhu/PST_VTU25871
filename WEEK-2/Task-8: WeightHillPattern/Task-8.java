import java.io.*;
import java.util.*;
class UserMainCode
{
    public static int weightHillPattern(int input1, int input2, int input3)
    {
        int totalWeight = 0;
        int currentWeight = input2;  
        for (int level = 1; level <= input1; level++)
        {
            totalWeight = totalWeight + (level * currentWeight);
            currentWeight = currentWeight + input3;
        }
        return totalWeight;
    }
}
