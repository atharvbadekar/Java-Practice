public static int minLengthAfterOperations(String s) {

int minLen = s.length();



for (int i = 0; i < s.length(); i++) {

for (int j = i + 1; j < s.length(); j++) {

if (s.charAt(i) == s.charAt(j)) {

minLen = Math.min(minLen, minLengthAfterOperations(s.substring(0, i) + s.substring(j + 1)));

i = j; // Move i to j as we're removing prefix and suffix

}

}

}



return minLen;

}



public static void main(String[] args) {

// Test cases

System.out.println(minLengthAfterOperations("ca")); // Output: 2

System.out.println(minLengthAfterOperations("aabccabba"));// Output: 3

}