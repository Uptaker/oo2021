public class Main {
    public static void main(String[] args) {
        Stock gme = new GME(20000);
        Stock amc = new AMC(100);

        System.out.println(gme.buy(200));
        System.out.println(gme.update());
        System.out.println(gme.checkProfit());

        for (int i = 0; i < 50; i++) {
            System.out.println(gme.update());
        }

        System.out.println(gme.checkProfit());

        System.out.println("------------- AMC -------------");

        System.out.println(amc.buy(10));
        System.out.println(amc.checkProfit());
        System.out.println(amc.update());
        System.out.println(amc.checkProfit());
    }
}
