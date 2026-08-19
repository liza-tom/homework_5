public class Main {
    public static void main(String[] args) {
        //task 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неверно указанная ОС");
        }

        //task 2
        int clientDeviceYear = 2017;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неверно указанная ОС");
        }

        //task 3
        int year = 1880;
        if (year % 4 == 0 && year > 1584 && year % 100 != 0 || year % 400 == 0 && year > 1584){
            System.out.println(year + " год является высокосным");
        }
        else{
            System.out.println(year + " год не является высокосным");
        }

        //task 4
        int deliveryDistance = 70;
        int deliveryTime;
        if (deliveryDistance <= 20){
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if(20 < deliveryDistance && deliveryDistance <= 60){
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if(60 < deliveryDistance && deliveryDistance <= 100){
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else{
            System.out.println("Доставки нет");
        }

        //task 5
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Неверный номер месяца");
        }
    }
}