public class Product {
    private String name;
    private String description;
    private String ID; // should never change
    private double cost;

    // Constructor
    public Product(String name, String description, String ID, double cost) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.cost = cost;
    }

    // Getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getID() { return ID; }
    public double getCost() { return cost; }

    // CSV format
    public String toCSV() {
        return name + "," + description + "," + ID + "," + cost;
    }

    @Override
    public String toString() {
        return name + ": " + description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        return ID.equals(other.ID);
    }
}
