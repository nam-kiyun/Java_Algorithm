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
            int N = Integer.parseInt(br.readLine());
            int[] arr=new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }

            for(int j=(arr.length-1);j>=0;j--) {
                if(max<arr[j]) {
                    max=arr[j];
                } else {
                    result += max - arr[j];
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
