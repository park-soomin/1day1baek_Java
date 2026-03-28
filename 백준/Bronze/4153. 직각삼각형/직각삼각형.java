import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int a, b, c;

        while(true) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            a = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());
            c = Integer.parseInt(stringTokenizer.nextToken());

            if (a==0 && b==0 && c==0) {
                break;
            }

            if (a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b) {
                stringBuilder.append("right").append("\n");
            } else {
                stringBuilder.append("wrong").append("\n");
            }
        }

        System.out.println(stringBuilder);
    }
}