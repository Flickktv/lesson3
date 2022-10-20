public class Main {
    public static <string> void main(String[] args) {

        //1

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println();

        //2

        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите приложение для iOS по ссылке.");
        }
        if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите приложение для Android по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        System.out.println();

        //3

        int year = 2000;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " год является високосным.");
        }
        else {
            System.out.println(year + " год не является високосным.");
        }
        System.out.println();

        //4

        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + 1);
        }
        else {
            System.out.println("Потребуется дней: " + ((deliveryDistance - 20) / 40 + 2));
        }
        System.out.println();

        //5

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна.");
                break;
            default:
                System.out.println("Программа не выполняется");
                break;
        }
        System.out.println();

        //6

        int age = 19;
        int salary = 58000;
        double limit = 0;
        if (age < 23) {
            if (salary >= 80000) {
                limit = salary * 2 * 1.5;
            }
            else if (salary >= 50000){
                limit = salary * 2 * 1.2;
            }
            else {
                limit = salary * 2;
            }
        }

        if (age >= 23) {
            if (salary >= 80000) {
                limit = salary * 3 * 1.5;
            }
            else if (salary >= 50000){
                limit = salary * 3 * 1.2;
            }
            else {
                limit = salary * 3;
            }
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " +  limit + " рублей.");
        System.out.println();





    }
}
