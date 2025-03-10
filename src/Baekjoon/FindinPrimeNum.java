package Baekjoon;
import java.io.*;
import java.util.*;

public class FindinPrimeNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        int count =0;
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<N;i++){
            int k = 0;
            for(int j=1;j<=arr[i];j++) {
                if(arr[i]%j==0) {
                    k++;
                }
            }
            if(k==2) {
                count++;
            }
        }
        sb.append(count);
        System.out.println(count);
    }
}
