package algorithm_study.fourth_week.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class TreeTraversal {
    // https://www.acmicpc.net/problem/1991
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Tree> treeMap = new HashMap<>();
        char alphbet = 'A';
        for (int i = 0; i < n; i++) {
            treeMap.put(String.valueOf(alphbet), 
                new Tree(String.valueOf(alphbet), null, null));
            alphbet++;
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String value = st.nextToken();
            String leftValue = st.nextToken();
            String rightValue = st.nextToken();

            if (!leftValue.equals(".")) {
                treeMap.get(value).left = treeMap.get(leftValue);
            }
            if (!rightValue.equals(".")) {
                treeMap.get(value).right = treeMap.get(rightValue);
            }
        }

        preorderTraversal(treeMap.get("A"));
        System.out.println();
        inorderTraversal(treeMap.get("A"));
        System.out.println();
        postorderTraversal(treeMap.get("A"));
        System.out.println();
    }

    private static class Tree {
        String value;
        Tree left;
        Tree right;

        Tree(String value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    private static void preorderTraversal(Tree root) {
        if (root == null) return;
        System.out.print(root.value);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    private static void inorderTraversal(Tree root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.value);
        inorderTraversal(root.right);
    }

    private static void postorderTraversal(Tree root) {
        if (root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.value);
    }
}
