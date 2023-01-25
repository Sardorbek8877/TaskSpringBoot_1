package tasks.task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task4 task4 = new Task4();

        System.out.println("Enter maker: ");
        String maker = scanner.nextLine();
        System.out.println("Enter model: ");
        String model = scanner.nextLine();
        System.out.println("Enter type: ");
        String type = scanner.nextLine();

        Product product = new Product(maker, model, type);

        task4.addProduct(product);
    }
}
