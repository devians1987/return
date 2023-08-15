public class Main {
    public static void main(String[] args) {


        int account = 700;
        int replenishment = 400;
        int bonus;


        if (account + replenishment > 1000) {
            bonus = (account + replenishment) / 100;
        } else {
            bonus = 0;
        }

        int balance = replenishment + account + bonus;
        System.out.println("баланс: " + balance + " руб. Бонус: " + bonus + " руб.");
    }
}