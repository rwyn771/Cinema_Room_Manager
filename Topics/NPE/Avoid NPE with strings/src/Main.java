import java.util.Scanner;
import java.util.Objects;



public class Main {

    public static String concatStrings(String str1, String str2) {
        /* write your code here */
        if (!Objects.equals(str1, null) && Objects.equals(str2, null))
        {
            return str1;
        }
        else if (Objects.equals(str1, null) && !Objects.equals(str2, null))
        {
            return str2;
        }
        else if (Objects.equals(str1, null) && Objects.equals(str1, str2))
        {
            String gong = "";
            return gong;
        }
        else
        {
            return str1.concat(str2);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        str1 = "null".equalsIgnoreCase(str1) ? null : str1;
        str2 = "null".equalsIgnoreCase(str2) ? null : str2;

        System.out.println(concatStrings(str1, str2));
    }
}