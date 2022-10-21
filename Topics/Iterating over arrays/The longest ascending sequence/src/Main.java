import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] array = new int[s.nextInt()];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = s.nextInt();
        }

        int counter = 1;
        int max = 1;

        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i] < array[i + 1])
            {
                counter++;

                if (counter > max)
                {
                    max = counter;
                }
            }

            else
                counter= 1;
        }

        System.out.println(max);
    }
}