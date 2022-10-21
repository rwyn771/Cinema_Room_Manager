package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        int rows = getRows();
        int seats = getSeats();
        boolean[][] arrangement = new boolean[rows + 1][seats + 1];
        int a;

        do
        {
            displayMenu();
            a = getMenuSelection();
            applyMenuSelection(a, rows, seats, arrangement);

        }
        while (a == 1 || a == 2 || a == 3);
    }

    public static void applyMenuSelection(int selection, int rows, int seats, boolean[][] a)
    {
        switch (selection)
        {
            case 1:
                displayBookedSeats(a);
                break;
            case 2:
                buyATicket(rows, seats, a);
                break;
            case 3:
                int b = numTicketsSold(a);
                int c = getCapacity(rows, seats);
                percentageSold(b, c);
                getCurrentIncome(a);
                getTotalIncome(seats, rows);
                break;
            default:
                break;

        }
    }

    public static void getCurrentIncome(boolean[][] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (isBooked(i, j, arr))
                    sum += getTicketPrice(i, arr.length - 1, arr[1].length - 1);
            }
        }
        System.out.println("Current Income: $" + sum);
    }

    public static void displayMenu()
    {
        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");

    }

    public static int getMenuSelection()
    {
        return getIntegerInput();
    }

    public static int getSeatSelection()
    {
        System.out.println("Enter a seat number in that row:");
        int seats = getIntegerInput();

        return seats;
    }

    public static int getIntegerInput()
    {
        int input;
        Scanner s = new Scanner(System.in);

        while (true)
        {
            try
            {
                input = Integer.parseInt(s.nextLine());
                break;
            }
            catch (Exception e)
            {
                System.out.println("Wrong Input!");
            }
        }
        return input;
    }

    public static int buyATicket(int rows, int seats, boolean[][] arr)
    {
        int a = 0;
        int b = 0;
        int price = 0;

        while (true)
        {
            a = getRowSelection();
            b = getSeatSelection();

            if (a >= arr.length || a < 1)
            {
                System.out.println("Wrong input!");
            }
            else if (b >= arr[a].length || b < 1)
            {
                System.out.println("Wrong input!");
            }
            else
            {
                if (confirmSeat(a, b, arr))
                {
                    price = getTicketPrice(a, rows, seats);
                    break;
                }
               else
                   continue;
            }
        }
        System.out.println("Ticket price: $" + price);
        return price;
    }

    public static boolean confirmSeat(int row,int seat, boolean[][] arr)
    {
        if (!isBooked(row, seat, arr))
        {
            setBooked(row, seat, arr);
            return true;
        }
        else
        {
            System.out.println("That ticket has already been purchased!");
            return false;
        }
    }

    public static boolean isBooked(int row, int seat, boolean[][] array)
    {
        return array[row][seat];
    }

    public static void setBooked(int row, int seat, boolean[][] arr)
    {
        arr[row][seat] = true;
    }


    public static void displayBookedSeats(boolean[][] arrangement)
    {
        System.out.println("Cinema: ");
        for (int i = 0; i < arrangement.length; i++)
        {
            for (int j = 0; j < arrangement[i].length; j++)
            {
                if (arrangement[i][j])
                    System.out.print("B ");
                else if (j > 0 && i == 0)
                    System.out.print(j + " ");
                else if (j > 0 && i > 0)
                    System.out.print("S ");
                else if (j == 0 && i > 0)
                    System.out.print(i + " ");
                else if (i == 0 && j == 0)
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static int getTicketPrice(int row, int rows, int seats)
    {
        int price = 0;
        int total = rows * seats;

        if (total <= 60)
            price = 10;

        else
        {
            if (row <= rows / 2)
                price = 10;
            else
                price = 8;
        }

        return price;
    }
    
    public static int numTicketsSold(boolean[][] array)
    {
        int counter = 0;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j])
                    counter++;
            }
        }
        System.out.println("Number of purchased tickets: " + counter);
        return counter;
    }

    public static double percentageSold(int numSold, int capacity)
    {
        double percentage = ((double) numSold / (double) capacity) * 100;
        System.out.printf("Percentage: %.2f", percentage);
        System.out.println("%");

        return percentage;
    }

    public static int getCapacity(int rows, int seats)
    {
        int capacity = rows * seats;

        return capacity;
    }



    public static int getRowSelection()
    {
        System.out.println("Enter a row number:");
        int rows = getIntegerInput();

        return rows;
    }

    public static void arrangement()
    {
        System.out.println("Cinema:");
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if (j > 0 && i == 0)
                    System.out.print(j + " ");
                else if (j > 0 && i > 0)
                    System.out.print("S ");
                else if (j == 0 && i > 0)
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void getTotalIncome(int seats, int rows)
    {
        int total = seats * rows;
        int income;
        if (total <= 60)
            income = 10 * total;
        else if (rows % 2 == 0)
        {
            income = ((rows / 2) * seats * 10) + ((rows / 2) * seats * 8);
        }
        else
            income = ((rows / 2) * seats * 10) + (((rows / 2) + 1) * seats * 8);

        System.out.print("Total income: $" + income);
    }
    
    public static int getRows()
        {
            System.out.println("Enter the number of rows:");
            int rows = getIntegerInput();
            
            return rows;
        }
        
        public static int getSeats()
        {
            System.out.println("Enter the number of seats in each row:");
            int seats = getIntegerInput();
            
            return seats;
        }
    
    public static void printLayout(int[][] arrangement)
    {
        System.out.println("Cinema: ");
        for (int i = 0; i < arrangement.length; i++)
        {
            for (int j = 0; j < arrangement[i].length; j++)
            {
                if (j > 0 && i == 0)
                    System.out.print(j + " ");
                else if (j > 0 && i > 0)
                    System.out.print("S ");
                else if (j == 0 && i > 0)
                    System.out.print(i + " ");
                else if (i == 0 && j == 0)
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}