package q52;

public class Event {
    private String name;
    private int age;

    public Event(String name, int age) {
        this.name = normalizeName(name);
        this.age = validateAge(age);
    }

    public int validateAge(int age) {
        if (age < 10)
            throw new IllegalArgumentException("Too young");
        if (age > 90)
            throw new IllegalArgumentException("Too old");
        return age;
    }

    protected String normalizeName(String name) {
        if (name == null)
            throw new IllegalArgumentException("Name is null");
        if (name.isBlank() || name.isEmpty())
            throw new IllegalArgumentException("Name is blank");
        return name.trim().toUpperCase();
    }
}
// Create Event class with final modifier or
// Add final modifier to validateAge(int) and normalizeName(String) methods or
//Change modifier of validateAge(int) and normalizeName(String) methods to private