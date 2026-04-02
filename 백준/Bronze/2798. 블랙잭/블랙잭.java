import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken()); // 카드의 개수
        int M = Integer.parseInt(stringTokenizer.nextToken()); // 딜러가 선택한 숫자

        int[] a = new int[N]; // 카드 개수만큼 생성
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i=0; i<N; i++) {
            a[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int sum; // 세 카드의 합
        int result = 0; // 최종 결과
        for (int i=0; i<N-2; i++) {
            for (int j=i+1; j<N-1; j++) {
                for (int k=j+1; k<N; k++) {
                    sum = a[i] + a[j] + a[k];
                    if ((sum <= M) && (result < sum)) {
                        result = sum;
                    }
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(result);
        System.out.println(stringBuilder);
    }
}