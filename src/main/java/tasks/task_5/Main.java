package tasks.task_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Task_5 task5 = new Task_5();

        System.out.println("Enter lower price: ");
        int min = scanner.nextInt();

        System.out.println("Enter high price: ");
        int max = scanner.nextInt();

        task5.filterPrice(min, max);
    }
}
