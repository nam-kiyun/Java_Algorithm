package Baekjoon;
import java.io.*;
import java.util.*;

public class Card2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++) {
            q.add(i);
        }
        int last = 0;
        while(!q.isEmpty()) {
            last=q.peekLast();
            q.poll();
            if(q.isEmpty()) break;
            int k = q.poll();
            q.add(k);
        }
        sb.append(last);
        System.out.println(sb);
    }
}
