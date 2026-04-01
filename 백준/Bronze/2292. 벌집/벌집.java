import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Long N = Long.parseLong(bufferedReader.readLine());

        int range = 1;
        int count = 1;
        while (range<N) {
            range = range + (6 * count);
            count++;
        }

        System.out.println(count);
    }
}