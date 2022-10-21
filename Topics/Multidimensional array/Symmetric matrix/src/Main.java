import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = s.nextInt();
            }
        }

        boolean flag = true;

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j] != matrix[j][i])
                {
                    flag = false;
                }
            }
        }
        System.out.println(flag ? "YES" : "NO");
    }
}