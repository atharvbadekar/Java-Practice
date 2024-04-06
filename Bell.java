class Bell {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(bellNumber(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int bellNumber(int n, int k) {
        if (k == 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return bellNumber(n - 1, k - 1) + bellNumber(n - 1, k);
        }
    }
}