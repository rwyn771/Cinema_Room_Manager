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
        int sum = 0;

        for (int temp:array)
        {
            if (temp > n)
            {
                sum += temp;
            }
        }

        System.out.println(sum);


    }
}