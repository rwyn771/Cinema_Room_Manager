import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] array = new int[s.nextInt()];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = s.nextInt();
        }

        int n = s.nextInt();
        boolean flag = false;

        for (int temp:array
             )
        {
            if (temp == n)
                flag = true;
        }

        System.out.println(flag);


    }
}