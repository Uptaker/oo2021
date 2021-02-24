import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static Scanner sc = new Scanner(System.in); // multiple scanners cause problems
    public static Player curPlayer;

    public static void main(String[] args) {
        HashMap<String, Player> players = new HashMap<String, Player>();
        players.put("zezima", new Player("Zezima"));
        players.put("thelegend27", new Player("TheLegend27"));
        boolean isGameActive = true;
        int index = 9;
        boolean isLoggedIn = false;
        while (isGameActive) {
            System.out.println("DEBUG: " + curPlayer); // for debugging
            String user = "";
            System.out.println("Commands: login, register, quit");
            String input = sc.nextLine().toLowerCase();
            if (input.equals("login")) {
                System.out.println("LOGIN: Enter your username!");
                user = sc.nextLine().toLowerCase();
                if (!players.containsKey(user)) {
                    System.out.println(
                            "That account does not exist! Try again or type 'register' to register a new account.");
                } else {
                    curPlayer = players.get(user);
                    System.out.println("Welcome to Fakescape, " + curPlayer.name);
                    System.out.println("Type 'help' for a list of game commands!");
                    isLoggedIn = true;
                }
            } else if (input.equals("quit")) {
                System.out.println("You've quit the game.");
                isGameActive = false;
            } else if (input.equals("register")) {
                System.out.println("Enter your new username:");
                user = sc.nextLine();
                String lowercase = user.toLowerCase();
                if (players.containsKey(user)) {
                    System.out.println("That username is taken!");
                } else {
                    players.put(lowercase, new Player(user));
                }
            } else {
                System.out.println("Invalid command.");
            }
            while (isLoggedIn) {
                System.out.println("DEBUG: " + curPlayer); // for debugging
                input = sc.nextLine().toLowerCase();
                if (input.equals("stats")) {
                    curPlayer.stats();
                } else if (input.equals("logout")) {
                    isLoggedIn = false;
                    System.out.println("You've logged out!");
                    curPlayer = null;
                } else if (input.equals("quit")) {
                    System.out.println("You've quit the game.");
                    isLoggedIn = false;
                    isGameActive = false;
                } else if (input.equals("select") || (index > 8)) {
                    System.out.println("Select the index of the skill to train:");
                    curPlayer.listSkills();
                    try {
                        index = sc.nextInt();
                        System.out.println("Selected: " + curPlayer.skills[index].skillType);
                    } catch (Exception e) {
                        System.out.println("Invalid index! Try again");
                        index = 99;
                    }
                } else if (input.equals("")) {
                    curPlayer.trainSkill(index);
                } else if (input.equals("help")) {
                    System.out.println("help - list of commands");
                    System.out.println("select - select a skill to train");
                    System.out.println("stats - see your current stats");
                    System.out.println("<nothing> - train your current skill");
                    System.out.println("");
                    System.out.println("quit - quit the game");
                    System.out.println("logout - log out");
                }
            }
        }
        players.get("zezima").stats();
        players.get("thelegend27").stats();
        System.out.println(players);
    }
}