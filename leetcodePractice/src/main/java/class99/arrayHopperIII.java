package class99;

import java.util.Arrays;

public class arrayHopperIII {
    public int minJump(int[] array) {
        // Write your solution here.
        int[] dp = new int[array.length + 1];
        
        for (int i = 0; i < array.length; i++) {
          for (int j = i + 1; j <= i + array[i] && j < dp.length; j++) {
              if (i > 0 && dp[i] > 0) {
                  dp[j] = dp[j] == 0 ? dp[i] + 1 : Math.min(dp[j], dp[i] + 1);
              } else if (i == 0) {
                  dp[j] = 1; 
              }
          }
        }
        System.out.println(Arrays.toString(dp));
        return dp[array.length] == 0? -1 : dp[array.length];
    }
}