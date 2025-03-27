package Baekjoon;
import java.io.*;
import java.util.*;

public class FibonacciFunc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] dp = new int[41];
        dp[1]=1;
        for(int i = 2; i<=40; i++) {
            dp[i]=dp[i-2]+dp[i-1];
        }
        for(int i=0; i<T; i++) {
            int n=Integer.parseInt(br.readLine());
            if(n==0) {
                sb.append("1 0\n");
                continue;
            }
            sb.append(dp[n-1]+" "+dp[n]+"\n");
        }
        System.out.println(sb);
    }
}
