package sr.unasat.traffic.simulation.entities;

public class Voertuig {
    private int priority;
    private String naam;

    public Voertuig(int priority, String naam) {
        this.priority = priority;
        this.naam = naam;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Voertuig{" +
                "priority=" + priority +
                ", naam='" + naam + '\'' +
                '}';
    }
}
