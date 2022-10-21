import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int max = 0;
        int n = s.nextInt();

        while (s.hasNextInt())
        {
            n = s.nextInt();

            if ((n % 4 == 0) && (n > max))
                max = n;
        }

        System.out.println(max);
    }
}