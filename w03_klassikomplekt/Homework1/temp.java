// IGNORE, FOR FORMATTING (vscode ruins my comments)


Scanner gameInput = new Scanner(System.in);
playGame();
boolean isGameActive = true;
System.out.println("Welcome to Knockoffscape!");
while (isGameActive) {
    String input = gameInput.nextLine().toLowerCase();
    if (input.equals("login")) {
        System.out.println("LOGIN: Enter your username!");
        Scanner login = new Scanner(System.in);
        String currentUser = login.nextLine().toLowerCase();
        System.out.println("Welcome to Knockoffscape, " + currentUser);
    } else if (input.equals("stats")) {
        System.out.println("Your stats are...");
    } else if (input.equals("train")) {
        System.out.println("Not here yet >:I");
    } else if (input.equals("logout")) {
        System.out.println("You've logged out!");
    } else if (input.equals("quit")) {
        System.out.println("You've quit the game.");
        isGameActive = false;
    } else {
        System.out.println("Invalid command!");
    }
    gameInput.close();
    
}