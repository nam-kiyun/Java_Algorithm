package Baekjoon;
import java.io.*;
import java.util.*;

public class OneTwoThreePlus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int max = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            list.add(n);
            if(n>max) {
                max = n;
            }
        }

        int[] dp = new int[max+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;

        for(int i = 4; i<=max;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        for(Integer i : list) {
            sb.append(dp[i]).append("\n");
        }
        System.out.println(sb);
    }
}
