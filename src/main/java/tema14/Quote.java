package tema14;

public class Quote {
    private int id;
    private String author;
    private String quote;
    private boolean favourite;
    private static int nextId = 1;
    public Quote(int id, String author, String quote, boolean favourite) {
        this.id = nextId++;
        this.author = author;
        this.quote = quote;
        this.favourite = false;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public void getInfoWithQuote() {
        System.out.println("ID: " + id);
        System.out.println("Author: " + author);
        System.out.println("Quote: " + quote);
        System.out.println("Favourite: " + favourite);
    }
}
