public class Person {
    private String firstName;
    private String lastName;
    private String ID; // should be a sequence of digits
    private String title; // e.g., Mr., Mrs.
    private int YOB; // Year of birth

    // Constructor
    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getID() { return ID; }
    public String getTitle() { return title; }
    public int getYOB() { return YOB; }

    // Full name method
    public String fullName() {
        return firstName + " " + lastName;
    }

    // Age calculation
    public int getAge(int currentYear) {
        return currentYear - YOB;
    }

    // CSV format
    public String toCSV() {
        return firstName + "," + lastName + "," + ID + "," + title + "," + YOB;
    }

    @Override
    public String toString() {
        return title + " " + fullName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return ID.equals(other.ID);
    }
}

