public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 2, 9, 8};
        int n = 9;

        boolean[] present = new boolean[n + 1]; // index 0 is unused

        // Mark the numbers that are present in the array
        for (int num : arr) {
            if (num <= n) {
                present[num] = true;
            }
        }

        // Print the numbers that are missing
        System.out.print("Missing numbers: ");
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
