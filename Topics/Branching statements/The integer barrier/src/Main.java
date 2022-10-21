import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        int sum = 0;
        while (true)
        {
            num = s.nextInt();
            sum += num;

            if (num == 0)
                break;

            else if (sum >= 1000)
            {
                sum -= 1000;
                break;
            }
        }

        System.out.println(sum);
    }
}