package Baekjoon;
import java.io.*;
import java.util.*;

public class RoofTopGarden {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        long count = 0;

        for(int i=0;i<N;i++) {
            int m = Integer.parseInt(br.readLine());
            while(!stack.isEmpty()) {
                if (stack.peek() <= m) {
                    stack.pop();
                } else break;
            }
            count+=stack.size();
            stack.push(m);
        }

        sb.append(count);
        System.out.println(sb);
    }
}
