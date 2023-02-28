import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void determine(int i) {
        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            System.out.println(i + " являеться высокосным ");
        } else {
            System.out.println(i + " не является высокосным");
        }

    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2015;
        determine(year);
        int year2 = 800;
        determine(year2);


    }

    public static void determineTypeOS(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear == currentYear) {
            if (clientOS == 0) {
                System.out.println(" Установите версию приложения для iOS по ссылке ");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке ");
            }
        } else if (clientOS == 0) {
            System.out.println(" Установите облегчённую версию приложения для iOS по ссылке ");
        } else {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке ");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int OS = 0;
        int year = 2022;
        determineTypeOS(OS, year);
    }

    public static void calculateTime(int deliveryDistance) {


        if (deliveryDistance <= 20 && deliveryDistance >= 0) {
            System.out.println(" Потребуеться 1 день ");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println(" Потребуеться 2 дня ");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println(" Потребуеться 3 дня ");
        } else {
            System.out.println(" Доставки нет ");

        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int distance = 95;
        calculateTime(distance);
    }
}
