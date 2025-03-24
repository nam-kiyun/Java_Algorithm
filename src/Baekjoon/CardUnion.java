package Baekjoon;

import java.io.*;
import java.util.*;

public class CardUnion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] arr = new long[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            Arrays.sort(arr);

            long N = arr[0] + arr[1];
            arr[0] = N;
            arr[1] = N;
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
