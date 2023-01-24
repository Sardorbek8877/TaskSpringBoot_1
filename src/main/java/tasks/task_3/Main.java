package tasks.task_3;

import tasks.task_2.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i=-1;

        while (i != 0){
            System.out.println("0 => Exit, 1 => Info from pc, 2 => Info from laptop, 3 => Info from printer!");
            i = scanner.nextInt();
            Task_3 task3 = new Task_3();
            switch (i) {
                case 1:
                    task3.pc_info();
                case 2:
                    task3.laptop_info();
                case 3:
                    task3.printer_info();
            }
        }
    }
}
