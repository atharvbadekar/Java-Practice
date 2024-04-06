public class MinimumLengthAfterOperations {
    public static int minLenAfterOperations(String s) {
        int n = s.length();
        int minLen = n;
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                char prefixChar = s.charAt(i);
                char suffixChar = s.charAt(j);
                
                if (prefixChar == suffixChar) {
                    String prefix = s.substring(0, i);
                    String suffix = s.substring(j + 1);
                    
                    if (!prefix.isEmpty() && !suffix.isEmpty() && !prefix.equals(suffix)) {
                        minLen = Math.min(minLen, minLenAfterOperations(prefix + suffix));
                    }
                }
            }
        }
        
        return minLen;
    }

    public static void main(String[] args) {
        String s1 = "ca";
        String s2 = "aabccabba";

        System.out.println("Output for s1: " + minLenAfterOperations(s1));
        System.out.println("Output for s2: " + minLenAfterOperations(s2));
    }
}