import java.util.Arrays;

public class MissingNums {
    public void missingNumber(int[] arr, int N) {
        Arrays.sort(arr);
        int diff = arr[0] - 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] - i != diff) {
                while (diff < arr[i] - i) {
                    System.out.print((diff + i) + " ");
                    diff++;
                }
            }
        }
    }

    public static void main(String[] args) {
        MissingNums obj = new MissingNums();
        int arr[] = { 1, 6, 14, 12, 9, 3, 2, 5 };
        int N = arr.length;
        obj.missingNumber(arr, N);
    }

}
