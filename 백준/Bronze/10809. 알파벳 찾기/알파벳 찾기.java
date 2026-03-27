import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        int[] alphabet = new int[26];
        for (int i=0; i<26; i++) {
            alphabet[i] = -1;
        }

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int index = ch - 'a';
            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int val : alphabet) {
            stringBuilder.append(val).append(" ");
        }

        System.out.println(stringBuilder.toString().trim());
    }
}