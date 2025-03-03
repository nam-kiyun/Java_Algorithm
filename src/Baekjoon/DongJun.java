package Baekjoon;
import java.io.*;
import java.util.*;

public class DongJun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr=new int[N];
        int count = 0;
        for(int i=0; i<N; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]<=arr[i-1]) {
                arr[i-1]--;
                count++;
                i=arr.length;
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}
