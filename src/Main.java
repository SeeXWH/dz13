public class Main {
    public static void main(String[] args) {
        Author Dostoevsky = new Author("Fedor", "Dostoevsky");
        Author Turgenev = new Author("Ivan", "Turgenev");
        Book crimeAndPunishment = new Book("crime And Punishment", 1865, Dostoevsky);
        Book FathersAndSons = new Book("Fathers And Sons", 1862, Turgenev);
        crimeAndPunishment.setYear(1866);
    }
}