package Baekjoon;
import java.io.*;
import java.util.*;

public class Factorization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        while(N!=1) {
            for(int i=2;i<=N;i++){
                if(N%i==0) {
                    N=N/i;
                    sb.append(i).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
