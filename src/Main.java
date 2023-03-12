public class Main {
    public static void main(String[] args) {
        double initialAmount = 300.77;
        double depositAmount = 221.22;
        int bonus;
        if (depositAmount > 1000) {
            bonus = (int) (depositAmount / 100);
        } else {
            bonus = 0;
        }
        double balance = initialAmount + depositAmount;
        System.out.println("Баланс:" + balance);
        System.out.println("Бонус:" + bonus);

    }
}