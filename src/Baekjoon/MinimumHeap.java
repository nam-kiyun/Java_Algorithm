package Baekjoon;
import java.io.*;
import java.util.*;

public class MinimumHeap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i=0; i<N; i++) {
            int k = Integer.parseInt(br.readLine());
            if(k==0) {
                if(!q.isEmpty()) {
                    sb.append(q.poll()).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else q.add(k);
        }
        System.out.println(sb);
    }
}
