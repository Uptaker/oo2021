public class AMC implements Stock {
    static String name = "AMC";
    static double price = 10;
    public double money;
    public int amount;
    public double buyprice;

    public AMC(int money) {
        this.money = money;
    }

    @Override
    public String buy(int amount) {
        if (this.amount == 0) {
            if (amount * AMC.price > this.money) {
                return "You don't have enough funds.";
            } else {
                this.buyprice = AMC.price;
                this.amount = this.amount + amount;
                this.money = this.money - (amount * AMC.price);
                return "You've BOUGHT " + this.amount + " " + AMC.name + " stocks for $" + AMC.price + " each.";
            }
        } else {
            return "You can only buy more stocks if you have none left!";
        }

    }

    @Override
    public String sell() {
        if (amount > this.amount) {
            return "You don't have enough stocks, you only have " + this.amount;
        } else {
            this.money = this.amount * AMC.price;
            this.amount = 0;
            return "You've SOLD " + this.amount + " " + AMC.name + " stocks for $" + AMC.price + " each.";
        }
    }

    @Override
    public String checkProfit() {
        double offset = (AMC.price * this.amount) - (this.buyprice * this.amount);
        if (offset > 0) {
            return AMC.name + ": Your profits are: " + offset;
        } else {
            return AMC.name + ": Your losses are: " + offset;
        }
    }

    @Override
    public String update() {
        int rand = (int) Math.floor(Math.random() * 10);
        if (rand > 5) {
            AMC.price = AMC.price + ((AMC.price * rand) / 100);
            return "[" + AMC.name + " +" + rand + "%] Stock price is now: " + AMC.price;
        } else {
            AMC.price = AMC.price - ((AMC.price * rand) / 100);
            return "[" + AMC.name + " -" + rand + "%] Stock price is now: " + AMC.price;
        }
    }

}
