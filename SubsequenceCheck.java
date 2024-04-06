public class SubsequenceCheck {
    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }

        return sIndex == s.length();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String t1 = "ahbgdc";

        String s2 = "axc";
        String t2 = "ahbgdc";

        String s3 = "agb";
        String t3 = "ahbgde";

        System.out.println("Input: s = \"" + s1 + "\", t = \"" + t1 + "\"");
        System.out.println("Output: " + isSubsequence(s1, t1));

        System.out.println("Input: s = \"" + s2 + "\", t = \"" + t2 + "\"");
        System.out.println("Output: " + isSubsequence(s2, t2));

        System.out.println("Input: s = \"" + s3 + "\", t = \"" + t3 + "\"");
        System.out.println("Output: " + isSubsequence(s3, t3));
    }
}