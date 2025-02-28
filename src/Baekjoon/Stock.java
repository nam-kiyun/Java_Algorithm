package Baekjoon;
import java.io.*;
import java.util.*;

public class Stock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int T = Integer.parseInt(br.readLine());
        for(int k=0;k<T;k++){
            int max = 0;
            long result = 0;
            int count = 0;
            int m =0;
            int N = Integer.parseInt(br.readLine());
            int[] arr=new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            while (count != N) {
                for(int i=count;i<N;i++) {
                    if(max<arr[i]) {
                        max=arr[i];
                    }
                }
                for(int i=count;i<N;i++) {
                    if (arr[i] == max) {
                        result += (i - count) * max - m;
                        count = i + 1;
                        m = 0;
                        max = 0;
                        break;
                    } else {
                        m += arr[i];
                    }
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
