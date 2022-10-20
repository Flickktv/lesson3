public class taskseven {
    public static <string> void main(String[] args) {

        int age = 25;
        int salary = 60000;
        int wantedSum = 330000;
        double bet = 10;
        if (age < 23){
            bet = bet + 1;
        } else if (age < 30) {
            bet = bet + 0.5;
        }
        if (salary > 80000){
            bet = bet - 0.7;
        }
        double creditSum = wantedSum * (1 + bet / 100);
        if ((salary * 12 * 0.5) <= creditSum){
            System.out.println("Максимальный платеж при зарплате " + salary + " равен " + salary / 2 + " рублей. Платеж по кредиту " + creditSum / 12 + " рублей. Отказано.");
        } else {
            System.out.println("Максимальный платеж при зарплате " + salary + " равен " + salary / 2 + " рублей. Платеж по кредиту " + creditSum / 12 + " рублей. Одобрено.");
        }

    }
}
