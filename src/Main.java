import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        tusk1();
        tusk2();
        tusk3();
        tusk4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void tusk1() {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();
    }

    public static void tusk2() {
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int maxSum = 0;
        int minSum = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + minSum + " рублей");

        System.out.println();
    }

    public static void tusk3() {
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        double average = 0;
        for (int i : arr) {
            average += i;
        }
        System.out.println(average / arr.length);

        System.out.println();
    }

    public static void tusk4() {
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}