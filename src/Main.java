public class Main {

    public static void main(String[] args) {

        int balance = 100;
        int deposit = 1000;
        int minimum = 1000;


        int amount = balance + deposit;
        int bonus = deposit / 100;

        int check = bonus + amount;
        if (deposit > minimum) {

            System.out.println("Итого на счёте: " + check + " рублей");
            System.out.println("Бонус: " + bonus + " рублей");

        } else {
            System.out.println("Итого на счёте: " + amount + " рублей");
            System.out.println("Бонус: 0" + " рублей");
        }
    }
}
