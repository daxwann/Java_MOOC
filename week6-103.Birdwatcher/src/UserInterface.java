import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private Database database;
    private boolean on;

    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.on = false;
    }

    public void start() {
        this.on = true;
        this.database = new Database();
        String command;

        while (this.on) {
            System.out.print("? ");
            command = reader.nextLine();
            runCommand(command);
        }
    }

    public void runCommand(String command) {
        if (StringUtils.equalsString("Add", command)) {
            addBird();
        } else if (StringUtils.equalsString("Observation", command)) {
            addObservation();
        } else if (StringUtils.equalsString("Statistics", command)) {
            this.database.printStatistics();
        } else if (StringUtils.equalsString("Show", command)) {
            showBird();
        } else if (StringUtils.equalsString("Quit", command)) {
            quit();
        } else {
            System.out.println("Wrong command");
        }
    }

    public void addBird() {
        System.out.print("Name: ");
        String name = this.reader.nextLine();

        if (this.database.findExactBird(name) != null) {
            System.out.println("Bird already exist");
            return;
        }

        System.out.print("Latin Name: ");
        String latin = this.reader.nextLine();
        this.database.addBird(name, latin);
    }

    public void addObservation() {
        System.out.print("What was observed? ");
        String name = this.reader.nextLine();
        Bird foundBird = this.database.findExactBird(name);
        if (foundBird != null) {
            this.database.observedBird(foundBird);
        } else {
            System.out.println("Is not a bird!");
        }
    }

    public void showBird() {
        System.out.print("What? ");
        String name = this.reader.nextLine();
        Bird foundBird = this.database.findExactBird(name);

        if (foundBird != null) {
            System.out.println(foundBird);
        }
    }

    public void quit() {
        this.on = false;
    }
}
