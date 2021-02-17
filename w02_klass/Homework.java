// Bank.class

public class Homework {
    public static void main(String[] args) {
        Bank user1 = new Bank("Markus", 100);
        Bank user2 = new Bank("Karl", 2000);

        System.out.println(user2.getBalance()); // 100
        System.out.println(user1.getBalance()); // 2000
        System.out.println(user1.transfer(300)); // 100 + 300
        System.out.println(user1.withdraw(50)); // 400 - 50
        System.out.println(user1.send(user2, 200)); // user2 receives 200 from user1
        System.out.println(user2.getBalance()); // user2 now has has 200 more
        System.out.println(user1.getBalance()); // user1 now has 200 less

        // locking user1
        System.out.println(user1.setLock(true));
        System.out.println(user1.getBalance());

        // unlocking
        System.out.println(user1.setLock(false));
        System.out.println(user1.getBalance());
    }
}
