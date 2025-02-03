package algorithm_study.six_week.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MergeSort {
    private static int n;
    private static int k;
    private static int count = 1;
    private static int result = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(arr, 0, n-1);
        System.out.println(result);
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l+r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int i = l;
        int j = mid+1;
        int t = 0;
        int[] tmp = new int[r - l + 1];
        while ((i <= mid) && (j <= r)) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        while (i <= mid) {
            tmp[t++] = arr[i++];
        }

        while (j <= r) {
            tmp[t++] = arr[j++];
        }

        i = l;
        t = 0;
        while (i <= r) {
            arr[i] = tmp[t];
            if (count == k) {
                result = tmp[t];
            }
            i++;
            t++;
            count++;
        }
    }
}
