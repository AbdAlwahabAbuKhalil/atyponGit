public class FibDP {
    public int calculate(int num) {
        if (num <= 1) {
            return num;
        }

        int[] dp = new int[num + 1];
        dp[0] = 0;
        dp[1] = 1;


        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[num];
    }
}
