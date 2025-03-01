package Baekjoon;
import java.io.*;
import java.util.*;

public class Rope {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
//        int min = 0;
        int result = 0;
        int[] arr=new int[N];

        for(int i=0; i<N; i++){
           arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i=0;i<N;i++){
            result=Math.max(result,arr[i]*(N-i));
        }
        sb.append(result);
        System.out.println(sb);
    }
}
