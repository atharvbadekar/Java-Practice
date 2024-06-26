import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String result = "";
        int index = 0;

        while (index < s.length()) {
            char ch = s.charAt(index);
            if (Character.isDigit(ch)) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                countStack.push(count);
            } else if (ch == '[') {
                stringStack.push(result);
                result = "";
                index++;
            } else if (ch == ']') {
                StringBuilder temp = new StringBuilder(stringStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(result);
                }
                result = temp.toString();
                index++;
            } else {
                result += ch;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s1 = "3[a]2[bc]";
        String s2 = "3[a2[c]]";

        //System.out.println("Input: " + s1);
        System.out.println("Output: " + decodeString(s1));

        //System.out.println("Input: " + s2);
        System.out.println("Output: " + decodeString(s2));
    }
}