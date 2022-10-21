import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int rows = s.nextInt();
        int columns = s.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = s.nextInt();
            }
        }

        int n = s.nextInt();
        int m = s.nextInt();
        int temp;

        for (int i = 0; i < matrix.length; i++)
        {
            temp = matrix[i][n];
            matrix [i][n] = matrix[i][m];
            matrix[i][m] = temp;
        }

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}