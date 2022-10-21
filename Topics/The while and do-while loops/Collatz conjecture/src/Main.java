import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        System.out.println(input + " ");
        while (input != 1)
        {
            if (input % 2 == 0)
            {
                input /= 2;
            }

            else
            {
                input *= 3;
                input += 1;
            }

            System.out.print(input + " ");
        }
    }
}