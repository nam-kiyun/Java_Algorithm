package Baekjoon;

import java.io.*;
import java.util.*;

public class Editor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] strs = br.readLine().split("");
        int N = Integer.parseInt(br.readLine());

        Stack<String> lstack = new Stack<>();
        Stack<String> rstack = new Stack<>();

        for (int i = 0; i < strs.length; i++) {
            lstack.push(strs[i]);
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "P":
                    lstack.push(st.nextToken());
                    break;
                case "L":
                    if (!lstack.isEmpty()) {
                        rstack.push(lstack.pop());
                    }
                    break;
                case "D":
                    if (!rstack.isEmpty()) {
                        lstack.push(rstack.pop());
                    }
                    break;
                case "B":
                    if (!lstack.isEmpty()) {
                        lstack.pop();
                    }
                    break;
            }
        }
        for (String s : lstack) {
            sb.append(s);
        }
        while (!rstack.isEmpty()) {
            sb.append(rstack.pop());
        }
        System.out.println(sb);
    }
}
