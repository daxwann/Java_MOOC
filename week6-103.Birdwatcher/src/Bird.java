public class Bird {
    private String name;
    private String latin;
    private int observedCount;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observedCount = 0;
    }

    public void incrementObservation() {
        this.observedCount++;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " (" + this.latin + "): " + this.observedCount + " observations";
    }
}
