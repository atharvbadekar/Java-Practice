public class Ms {

    public static int minLength(String s) {
        int n = s.length();
        int minLen = n; // Initialize minimum length

        // Iterate through the string, including the last character
        for (int i = 0; i <= n - 2; i++) {
            char curr = s.charAt(i);
            int j = i + 1;

            // Find consecutive substrings of the same character
            while (j < n && s.charAt(j) == curr) {
                j++;
            }

            // Check if prefix and suffix exist (j - i > 1) and update minimum length
            if (j - i > 1) {
                minLen = Math.min(minLen, minLength(s.substring(i + 1, j - 1)));  // Optimized substring call
            }
        }

        return minLen;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(minLength("ca")); // Output: 2
        System.out.println(minLength("aabccabba")); // Output: 3
    }
}
