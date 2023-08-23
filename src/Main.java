public class Main {
    public static void main(String[] args) {


        int account = 700;
        int replenishment = 1300;
        int bonus = 0;


        if (replenishment > 1000) {
            bonus = (replenishment) / 100;
        } else {
            bonus = 0;
        }

        int balance = replenishment + account + bonus;
        System.out.println("баланс: " + balance + " руб. Бонус: " + bonus + " руб.");
    }
}