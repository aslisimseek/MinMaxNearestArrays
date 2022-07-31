import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNearestArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = {15, 35, 1, 66, 8};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list)); // 2,3,15,35,66
        int min = list[0];
        int max = list[0];

        System.out.println("Please Enter a Number...:");
        int number = scanner.nextInt();


        for (int i = 0; i < list.length; i++) {
            if (number <= list[i]) {
                max = list[i];
                min = list[i - 1];
                break;
            }
        }

        System.out.println("Entered Number Minimum Value   ...:" + min);
        System.out.println("Entered Number Max Value       ...:" + max);

    }
}