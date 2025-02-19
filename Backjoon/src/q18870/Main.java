package q18870;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] original = new int[N]; // 원본 배열
        int[] sorted; // 정렬 후 중복 제거된 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            original[i] = Integer.parseInt(st.nextToken());
        }

        // 1. 원본 배열을 정렬한 후 중복 제거
        sorted = Arrays.stream(original).distinct().sorted().toArray();

        // 2. 값 → 압축된 좌표 매핑
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            rankMap.put(sorted[i], i);
        }
        
        // 3. 원본 배열에 대해 압축된 좌표 출력
        for (int i = 0; i < N; i++) {
            bw.write(rankMap.get(original[i]) + " ");
        }
        bw.flush();
        bw.close();
    }
}
