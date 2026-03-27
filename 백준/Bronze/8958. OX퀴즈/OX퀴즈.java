import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(bufferedReader.readLine());
        int success = 0;
        int sum = 0;

        for (int i=0; i<test; i++) {
            String str = bufferedReader.readLine();

            for (int j=0; j<str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    success ++;
                    sum += success;
                } else {
                    success = 0;
                }
            }

            System.out.println(sum);
            success = 0;
            sum = 0;
        }
    }
}