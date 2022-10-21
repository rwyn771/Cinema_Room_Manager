import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] array = new int[s.nextInt()];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = s.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int n:array
             )
        {
            if (n < min)
                min = n;
        }

        System.out.println(min);
    }
}