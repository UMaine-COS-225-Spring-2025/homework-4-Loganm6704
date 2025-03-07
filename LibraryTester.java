public class LibraryTester{
    public static void main(String[] args) {
        BookShelf shelfO = new BookShelf('O');
        BookShelf shelfT = new BookShelf('T');
        System.out.println(shelfO);
        System.out.println(shelfT);
        Book betrayed = new Book("The Heart of the Betrayed", "Crime");
        Book stars = new Book("Our Hill of Stars", "Fantasy");
        Book kind = new Book("One of a Kind", "Science Fiction");
        Book roses = new Book("The Vision of Roses", "Romance");
        System.out.println(betrayed);
        System.out.println(stars);
        System.out.println(kind);
        System.out.println(roses);
        shelfO.bookPlace(betrayed);
        shelfT.bookPlace(betrayed);
        shelfO.bookPlace(stars);
        shelfT.bookPlace(stars);
        shelfO.bookPlace(kind);
        shelfT.bookPlace(kind);
        shelfO.bookPlace(roses);
        shelfT.bookPlace(roses);
        System.out.println(shelfO);
        System.out.println(shelfT);
        
    }
}