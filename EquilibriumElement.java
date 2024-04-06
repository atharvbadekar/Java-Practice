public class EquilibriumElement {
    public static int findEquilibrium(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];

            if (leftSum == totalSum) {
                return arr[i];
            }

            leftSum += arr[i];
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 7, 5, 2, 6};
        System.out.println("Output for arr1: " + findEquilibrium(arr1));

        int[] arr2 = {10, 1, 9};
        System.out.println("Output for arr2: " + findEquilibrium(arr2));
    }
}