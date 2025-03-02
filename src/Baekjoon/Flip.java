package Baekjoon;
import java.io.*;
import java.util.*;

public class Flip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] S =br.readLine().split("");
        int count = 0;

        for(int i=0;i<S.length-1;i++){
            if(!S[i].equals(S[i+1])) {
                count++;
            }
        }
        if(count%2==1){
            count++;
        }
        count= count/2;
        sb.append(count);
        System.out.println(sb);
    }
}
