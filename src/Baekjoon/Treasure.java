package Baekjoon;
import java.io.*;
import java.util.*;
public class Treasure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<A.length;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<B.length;i++){
            B[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int result=0;
        for(int i=0;i<A.length;i++){
            result+=(A[i]*B[B.length-1-i]);
        }
        sb.append(result);
        System.out.println(sb);
    }
}
