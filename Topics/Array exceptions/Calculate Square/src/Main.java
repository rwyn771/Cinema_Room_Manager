import java.util.Objects;

class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        // write your code here
        try
        {
            long square = array[index] * array[index];
            System.out.println(square);
        }
        catch (Exception e)
        {
            System.out.println("Exception!");
        }
    }
}