package Baekjoon;
import java.io.*;
import java.util.*;

public class Camping {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = 1;
        while(true) {
            // L P V
            /*
                5 8 20  14
                5 8 17  11
                0 0 0
             */
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L =  Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            if(L==0&&P==0&&V==0) break;
            sb.append("Case ").append(count).append(": ").append(V/P*L+Math.min(V%P,L)).append("\n");
            count++;
        }
        System.out.println(sb);
    }
}
