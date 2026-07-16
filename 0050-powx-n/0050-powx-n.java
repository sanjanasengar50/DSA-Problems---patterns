class Solution {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1.0;
        if (x == 0)
            return 0.0;
        if (x == 1)
            return 1.0;
        if (x == -1 && n % 2 == 0)
            return 1.0;
        if (x == -1 && n % 2 != 0)
            return -1.0;

        long bitForm = n;

        if (bitForm < 0) {
            x = 1 / x;
            bitForm = -bitForm;
        }

        double ans = 1;

        while (bitForm > 0) {
            if ((bitForm & 1) == 1) {   // or bitForm % 2 == 1
                ans *= x;
            }

            x *= x;
            bitForm /= 2;
        }

        return ans;
    }
}