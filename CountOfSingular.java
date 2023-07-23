import java.util.HashMap;

public class CountOfSingular {
    public int SockCount(int arr[]) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i : arr)
            count.put(i, count.getOrDefault(i, 0) + 1);

        int unpaired = 0;
        for (int j : count.values()) {
            if (j % 2 != 0) {
                unpaired++;
            }
        }
        return unpaired;
    }

    public static void main(String[] args) {
        CountOfSingular obj = new CountOfSingular();
        int[] arr = { 10, 20, 10, 20, 10, 30, 50, 10, 20 };
        System.out.println(obj.SockCount(arr));
    }
}
