import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        StringBuilder stringBuilder = new StringBuilder();
        if (M <= 2) {
            stringBuilder.append("NEWBIE!");
        } else if (M <= N) {
            stringBuilder.append("OLDBIE!");
        } else {
            stringBuilder.append("TLE!");
        }
        System.out.println(stringBuilder);
    }
}