import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Solution4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();

            try {
                int i = Integer.parseInt(S);
                System.out.println(i);
            } catch (Exception exception) {
                System.out.println("Bad String");
            }

        bufferedReader.close();
    }
}