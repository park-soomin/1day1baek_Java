import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int[] count = new int[10001];
        for (int i=0; i<N; i++) {
            count[Integer.parseInt(bufferedReader.readLine())]++;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i=1; i<10001; i++){
            while (count[i] > 0) {
                stringBuilder.append(i).append("\n");
                count[i]--;
            }
        }
        System.out.print(stringBuilder);
    }
}