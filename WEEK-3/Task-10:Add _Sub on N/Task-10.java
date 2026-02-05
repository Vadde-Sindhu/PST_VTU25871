import java.util.*;
class UserMainCode {
    public int AddSub(int input1, int input2) {
        int result = 0;
        int sign;
        if (input2 == 1)
            sign = 1;
        else
            sign = 1;
        for (int i = input1; i >= 1; i--) {
            result += sign * i;
            if (input2 == 1)
                sign = -sign;
            else if (i != input1)
                sign = -sign;
        }
        return result;
    }
}
