import java.util.ArrayList;

public class Database {
    private ArrayList<Bird> birds;

    public Database(ArrayList<Bird> birds) {
        this.birds = birds;
    }

    public Database() {
        this(new ArrayList<Bird>());
    }

    public void addBird(String name, String latin) {
        if (findExactBird(name) == null) {
            this.birds.add(new Bird(name, latin));
        }
    }

    public void observedBird(Bird foundBird) {
        if (foundBird != null) {
            foundBird.incrementObservation();
        }
    }

    public Bird findExactBird(String name) {
        for (Bird bird : this.birds) {
            if (StringUtils.equalsString(bird.getName(), name)) {
                return bird;
            }
        }

        return null;
    }

    public void printStatistics() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }
}
