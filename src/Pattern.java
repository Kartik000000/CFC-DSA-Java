public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
        {
            int k= i;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(k);
                k = k + 1;
            }
            k = k - 2;
            for (k = i - 1; k >= 1; k--)
            {
                System.out.print(k);
                k = k - 1;
            }
            System.out.println();
        }
    }
}
