public class Q45 {
    public static void main(String[] args) {
        int i = 0;
        int key;

        int A[] = { 50, 80, 40, 30, 50, 60 };
        for (int j = 2; j < A.length; j++) {
            key = A[j];
            i = j - 1;

            while ((A[i] > key) && (i > 0)) {
                A[i + 1] = A[i];

                i = i - 1;
            }
            A[i + 1] = key;

            System.out.println(key);

        }
    }
}
