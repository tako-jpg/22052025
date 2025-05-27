import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int [] monthExpenses = {95, 68, 25, 64, 38};
        int sum = 0;
        for (int element : monthExpenses) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " руб.");

        System.out.println("Задача 2");
        int [] weeklyMinMaxExpenses = {95, 68, 25, 64, 38};
        int min, max;
        min = max = weeklyMinMaxExpenses[0];
        for (int i = 0; i < weeklyMinMaxExpenses.length; i ++) {
            if (weeklyMinMaxExpenses[i] > max) {
                max = weeklyMinMaxExpenses[i];
            }
            if (weeklyMinMaxExpenses[i] < min) {
                min = weeklyMinMaxExpenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей.");

        System.out.println("Задача 3");
        int [] averageExpenses = {96, 68, 25, 64, 38};
        float sum2 = 0;
            for (int element : averageExpenses) {
            sum2 += element;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum2 / averageExpenses.length + " рублей");

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(reverseFullName);
        }
    }
