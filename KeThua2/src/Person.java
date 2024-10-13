public class Person {
    private String name;
    private String address;

    /**
     * Contructor 1 Person(double, double).
     */
    public Person(String name, String address) {
        this.address = address;
        this.name = name;
    }

    /**
     * Getter n Setter.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * toString for Person.
     */
    @Override
    public String toString() {
        return String.format("!");
    }
}
