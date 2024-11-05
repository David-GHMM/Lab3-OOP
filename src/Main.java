import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Double> list = new ArrayList<>(Arrays.asList(123.0, 0.0, -123.2, -12.321, 312.1109, 22.1, 111.2, -2.1, 666.666, -1.0));
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(-123.01, 0.000012, 23.2, 12.321, 32.09, 22.1, 111.2, 2.1, 6.6, -0.123));
        System.out.println("      Введенный список: " + list);

        int n = list.size();
        int left = 0, right = n - 1;

        while (left < right)
        {
            while (left < n && list.get(left) > 0)
            {
                left++;
            }

            while (right >= 0 && list.get(right) < 0)
            {
                right--;
            }

             if (left < right)
            {
                double temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
            }
        }

        System.out.println("Результат перестановки: " + list);
    }
}
