import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class Result {
    public static boolean isMatching(char a, char b) {
        return (a=='['&&b==']') || (a=='{'&&b=='}')|| (a=='('&&b==')');
    }

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        // Write your code here

        char [] stack = new char[s.length()];
        int top = -1;
        for (int i = 0;i< s.length();i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{'|| s.charAt(i) == '(') {
                stack[++top] = s.charAt(i);
            }
            else {

                if (top < 0) return "NO";

                else if (!isMatching(stack[top], s.charAt(i))) return "NO";
                top --;



            }
        }
        if (top < 0 ) return "YES";
        return "NO";

    }

}

public class BalancedBracketsHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
