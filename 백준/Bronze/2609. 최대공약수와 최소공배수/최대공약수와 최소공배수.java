import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());

        int comp; // 두 수를 comp로 나누어 가장 먼저 나누어 떨어지는 수
        if (a>=b) comp = a;
        else comp = b;

        int maximumCommonDivisor = 1; // 최대공약수
        for (int i=comp; i>0; i--) {
            if ((a % i == 0) && (b % i == 0)) {
                maximumCommonDivisor = i;
                break;
            }
        }

        int minimumCommonMultiple = a * b / maximumCommonDivisor; // 최소공배수

        stringBuilder.append(maximumCommonDivisor).append("\n").append(minimumCommonMultiple);
        System.out.println(stringBuilder);
    }
}