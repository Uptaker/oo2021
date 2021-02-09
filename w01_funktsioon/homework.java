import java.util.*; // ArrayList + Scanner

public class homework {
    public static void main(String[] args) {
        initList();
    }

    public static void initList() {
        List<String> list = new ArrayList<String>();
        String border = "************";
        Boolean appActive = true;
        int removeInt;
        Scanner input = new Scanner(System.in);
        System.out.println("App initialized! Type 'help' for a list of commands");
        while (appActive) {
            System.out.println("Insert a valid command: ");
            String cmd = input.nextLine();
            if (cmd.toLowerCase().equals("quit")) {
                System.out.println("App terminated");
                input.close();
                appActive = false;
            }
            if (cmd.toLowerCase().equals("help")) {
                System.out.println(border + "\nlist - show list");
                System.out.println("delete - delete a task according to the index");
                System.out.println("add - add a new task");
                System.out.println("help - list of commands");
                System.out.println("quit - quit the app\n" + border);
            }
            if (cmd.toLowerCase().equals("add")) {
                System.out.println("Enter new task: ");
                String add = input.nextLine();
                list.add(add);
                System.out.println("ADDED: " + add);
            }
            if (cmd.toLowerCase().equals("list")) {
                System.out.println(border);
                if (list.size() == 0) {
                    System.out.println("Empty list!");
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ": " + list.get(i));
                    }
                }
                System.out.println(border);
            }
            if (cmd.toLowerCase().equals("delete")) {
                if (list.isEmpty()) {
                    System.out.println("There is nothing to delete, the list is empty!");
                } else {
                    System.out.println("Enter the list index to delete:");
                    String remove = input.nextLine();
                    removeInt = (Integer.parseInt(remove) - 1);
                    if (removeInt >= 0 && removeInt < list.size()) {
                        System.out.println("DELETED " + list.get(removeInt));
                        list.remove(removeInt);
                    } else {
                        System.out.println("Index does not exist! Type 'list' for the correct index.");
                    }
                }
            }
        }
    }
}

// Probleemid:

// 1. if(cmd == "help") jne,
// ei töötanud. "In Java, using == for non-primitive expressions will always
// compare object references"*
// seega kasutasin if(cmd.equals("help"))

// 2. listidega oli tülikas
// "The size of an array can't be modified. If you want a bigger array you have
// to instantiate a new one.
// A better solution would be to use an ArrayList which can grow as you need
// it."
// seega kasutasin ArrayListi.

// 3. .length asemel .size() ArrayListi puhul

// 4. see kood andis tagasi 'insert a valid command' topelt:
// int remove = input.nextInt();
// asendasin stringiga ning konverteerisin integeriks

// 5. kui delete'is kirjutad stringi, siis tuleb error. try {} catch {}
// lahendab seda, aga ma ei tea, kas see pole veidi hacky?

// try { System.out.println("DELETED " + list.get(removeInt));
// list.remove(removeInt);
// } catch (Exception e) {
// System.out.println("Index does not exist! Type 'list' for the correct
// index.");
// }