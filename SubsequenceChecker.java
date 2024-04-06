public class SubsequenceChecker {
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        String s1 = "abc", t1 = "ahbgdc";
        String s2 = "saxc", t2 = "ahbgde";
        String s3 = "agb", t3 = "ahbgdc";

        System.out.println(isSubsequence(s1, t1)); // Output: true
        System.out.println(isSubsequence(s2, t2)); // Output: false
        System.out.println(isSubsequence(s3, t3)); // Output: false
    }
}
