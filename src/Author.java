public class Author {
    String name;
    String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return this.name + ' ' + this.lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Author c = (Author) other;
        return lastName.equals(c.lastName) && name.equals(c.lastName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(lastName);
    }
}
