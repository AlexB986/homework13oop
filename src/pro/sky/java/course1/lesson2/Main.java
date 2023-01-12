package pro.sky.java.course1.lesson2;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy");
        Author bulgakov = new Author("Mihail", "Bulgakov");

        Book warAndPeace = new Book("War and Peace", 1867, tolstoy);
        Book masterAndMargarita = new Book("Master and Margarita", 1940, bulgakov);

        masterAndMargarita.setPublicYearBook(1928);
        tolstoy.setFirstNameAuthor("Leva");
        System.out.println("Year " + masterAndMargarita.getPublicYearBook());
        System.out.println(tolstoy.getFamilyNameAuthor());
        System.out.println(tolstoy.getFirstNameAuthor());

        System.out.println(warAndPeace); //*toString

        Author bulgakov1 = new Author("Mihail", "Bulgakov");  //*Author equals
        System.out.println("Author " + bulgakov.equals(bulgakov1));

        Book masterAndMargarita1 = new Book("Master and Margarita", 1940, bulgakov); //*Book equals
        System.out.println("Book " + masterAndMargarita.equals(masterAndMargarita1));


        System.out.println(bulgakov.hashCode());  //*hashCode Author
    }
}
