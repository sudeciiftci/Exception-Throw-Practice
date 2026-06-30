public class throw2 {

    public static void main(String[] args) {

        double balance = 1500;
        double withdraw = -100;

        try {

            if (withdraw <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be greater than 0.");
            }

            if (withdraw > balance) {
                throw new IllegalArgumentException("Insufficient balance.");
            }

            balance -= withdraw;

            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Transaction finished.");

        }
    }
}