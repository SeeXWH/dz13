public class Book {
    String name;
    int year;
    Author author;

    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;

    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.name + ' ' + this.year + ' ' + this.author;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Book c = (Book) other;
        return name.equals(c.name) && author.equals((c.author));
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }


}
