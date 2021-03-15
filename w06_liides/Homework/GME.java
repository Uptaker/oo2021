public class GME implements Stock {
    static String name = "GME";
    static double price = 100;
    public double money;
    public int amount;
    public double buyprice;

    public GME(int money) {
        this.money = money;
    }

    @Override
    public String buy(int amount) {
        if (this.amount == 0) {
            if (amount * GME.price > this.money) {
                return "You don't have enough funds.";
            } else {
                this.buyprice = GME.price;
                this.amount = this.amount + amount;
                this.money = this.money - (amount * GME.price);
                return "You've BOUGHT " + this.amount + " " + GME.name + " stocks for $" + GME.price + " each.";
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
            this.money = this.amount * GME.price;
            this.amount = 0;
            return "You've SOLD " + this.amount + " " + GME.name + " stocks for $" + GME.price + " each.";
        }
    }

    @Override
    public String checkProfit() {
        double offset = (GME.price * this.amount) - (this.buyprice * this.amount);
        if (offset > 0) {
            return GME.name + ": Your profits are: " + offset;
        } else {
            return GME.name + ": Your losses are: " + offset;
        }
    }

    @Override
    public String update() {
        int rand = (int) Math.floor(Math.random() * 10);
        if (rand > 5) {
            GME.price = GME.price + ((GME.price * rand) / 100);
            return "[" + GME.name + " +" + rand + "%] Stock price is now: " + GME.price;
        } else {
            GME.price = GME.price - ((GME.price * rand) / 100);
            return "[" + GME.name + " -" + rand + "%] Stock price is now: " + GME.price;
        }
    }

}
