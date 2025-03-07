import java.util.ArrayList;

public class BookShelf {
    char first;
    ArrayList<Book> books = new ArrayList<>();
    public BookShelf(){
        this.first = 'a';
        this.books = new ArrayList<>();
        for (int i = 0; i<8; i++){
            books.add(i, null);
        }
    }
    public BookShelf(char first){
        this.first = first;
        this.books = new ArrayList<>(8);
        for (int i = 0; i<8; i++){
            books.add(i, null);
        }
    }
    public char getFirst(){
        return first;
    }
    public ArrayList getBooks(){
        return books;
    }
    public void setFirst(char first){
        this.first = first;
    }
    public void setBooks(ArrayList<Book> books){
        this.books = books;
    }
    public void bookPlace(Book book){
        char firstChar = book.title.charAt(0);
        if (firstChar == first){
            for (int i = 0; i < 8; i++){
                if (books.get(i) == null){
                    books.set(i, book);
                    return;
                }
            }
        }
    }
    public void bookRemove(Book book){
        for (int i = 0; i<8; i++){
            if (books.get(i) == book){
                books.set(i, null);
            }
        }
    }
    @Override
    public String toString(){
        String outString = "";
        for (int i = 0; i<8; i++){
            if (books.get(i) != null){
                Book tempBook = books.get(i);
                outString = outString + tempBook.title + "   ";
            }
        }
    if (outString == ""){
        return "Empty";
    }
    return outString;
    }
}