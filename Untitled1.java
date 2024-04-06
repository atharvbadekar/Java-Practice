public class Test {
    public static void main(String args[]) {
        String x = "Addresses"; // Corrected assignment operator =
        String answer = ""; // Added semicolon and initialized to an empty string
        int i;

        for (i = 0; i < x.length(); i++) {
            int count = 0;

            for (int j = 1; j < x.length(); j++) {
                if (x.charAt(i) == x.charAt(j)) { // Corrected comparison operator ==
                    count++;
                    break;
                }
            }

            answer +=  x.charat(i) + integer.tostring(count) ;
        }

        System.out.println(answer); // Added to print the answer
    }
}
