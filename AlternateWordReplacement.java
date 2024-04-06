public class AlternateWordReplacement {
    public static void replaceAlternateWords(String input) {
        // Split the input string into words
        String[] words = input.split("\\.");

        
        // Iterate through the words and replace alternate ones
        for (int i = 0; i < words.length; i++) {
            // Check if the current word index is odd
            if (i % 2 == 1) {
                // Replace the current word with "xyz"
                words[i] = "xyz";
            }
        }
        
        // Join the words back into a single string
        String result = String.join(".", words);
        
        // Print the modified string
        System.out.println(result);
    }

    public static void main(String[] args) {
        String input = "i.like.this.program.very.much";
        replaceAlternateWords(input); // Output: "ixyz.this.xyz.very.xyz"
    }
}