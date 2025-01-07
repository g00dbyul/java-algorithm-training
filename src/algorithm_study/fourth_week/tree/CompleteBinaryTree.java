package algorithm_study.fourth_week.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.IntStream;


// ㅈㄱㄴ ㅅㅂ;;
public class CompleteBinaryTree {
    // https://www.acmicpc.net/problem/9934
    public static void main(String[] args) throws IOException {
        /**
         *  preorder -> level order
         * 
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine()); // 깊이
        int length = (int) Math.pow(2, k) - 1;
        Map<Integer, List<Integer>> result = new HashMap<>();
        for (int i = 0; i < k; i++) {
            result.put(i, new ArrayList<>());
        }
        int[] tree = new int[length];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }
        
    }
}
