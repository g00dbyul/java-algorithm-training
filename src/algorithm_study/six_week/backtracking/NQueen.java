package algorithm_study.six_week.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen {
    private static int result = 0;
    private static int n;
    private static int[] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n];
        search(0);
        System.out.println(result);
    }

    private static void search(int row) {
        if (n == row) {
            result++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(row, col)) {
                board[row] = col;
                search(row + 1);
            }
        }
    }

    private static boolean isValid(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col) return false;
            if (Math.abs(i - row) == Math.abs(board[i] - col)) return false;
        }
        return true;
    }
}
