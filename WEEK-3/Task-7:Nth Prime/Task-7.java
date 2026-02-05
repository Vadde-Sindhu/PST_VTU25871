class UserMainCode
{
    public int NthPrime(int input1) {
        int count = 0;
        int number = 1;
        while (count < input1) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }
        return number;
    }
    private boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
