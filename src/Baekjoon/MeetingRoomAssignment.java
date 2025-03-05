package Baekjoon;
import java.io.*;
import java.util.*;

public class MeetingRoomAssignment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[][] A=new int[N][2];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            A[i][0]=Integer.parseInt(st.nextToken());
            A[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A,(o1, o2) -> {
            if(o1[1]==o2[1]) {
                return o1[0] - o2[0];
            }
            return  o1[1] - o2[1];
        });
        int endTime = 0;
        int count = 0;
        for (int i=0; i<N; i++){
            if(endTime<=A[i][0]){
                endTime=A[i][1];
                count++;
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}
