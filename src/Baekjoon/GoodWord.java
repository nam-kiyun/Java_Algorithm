package Baekjoon;
import java.io.*;
import java.util.*;

public class GoodWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();

            for(int j=0; j<str.length(); j++){
                if(stack.size()>0&&stack.peek() == str.charAt(j)) {
                    stack.pop();
                } else {
                    stack.push(str.charAt(j));
                }
            }
            if(stack.size()==0) count++;
        }

        sb.append(count);
        System.out.println(sb);
    }
}
