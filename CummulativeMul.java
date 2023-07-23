import java.util.Scanner;

public class CummulativeMul {
    public void printArray(int N, int arr[]) {
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        CummulativeMul obj = new CummulativeMul();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int N = sc.nextInt();
            int arr[] = new int[N];
            System.out.println("Enter " + N + " Integers:");
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Input Array: ");
            obj.printArray(N, arr);
            System.out.println();

            int cm = 1;
            for (int i = 0; i < N; i++) {
                cm *= arr[i];
                arr[i] = cm;
            }

            System.out.print("Updated Array:");
            obj.printArray(N, arr);
        }

        catch (Exception e) {
            System.out.println("Oops! : " + e.getMessage());
            e.printStackTrace();
        }

    }
}