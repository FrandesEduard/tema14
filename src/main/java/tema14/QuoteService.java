package tema14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteService {
    private List<Quote> quotes;

    public QuoteService(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public List<String> getAllQuotes() {
        List<String> allQuotes = new ArrayList<>();
        for (Quote quote : quotes) {
            allQuotes.add(quote.getQuote());
        }
        return allQuotes;
    }
    public List<Quote> getQuotesForAuthor (String author) {
        List<Quote> authorQuotes = new ArrayList<>();
        for (Quote quote : quotes) {
            if (quote.getAuthor().equals(author)) {
                authorQuotes.add(quote);
            }
        }
        return authorQuotes;
    }
    public List<String> getAuthors() {
        List<String> authors = new ArrayList<>();
        for (Quote quote : quotes) {
            authors.add(quote.getAuthor());
        }
        return authors;
    }
    public boolean setFavourite(int id) {
        for (Quote quote: quotes){
            if (quote.getId() == id) {
                quote.setFavourite(true);
                break;
            }
        }
        return false;
    }
    public List<Quote> getFavourites () {
        List<Quote> favouritesQuoste = new ArrayList<>();
        for (Quote quote : quotes) {
            if (quote.isFavourite()) {
                favouritesQuoste.add(quote);
            }
        }
        return favouritesQuoste;
    }
    public String getRandomQuote() {
        Random random = new Random();
        int randomId = random.nextInt(quotes.size()+1);
        for (Quote quote:quotes){
            if (quote.getId() == randomId) {
                return quote.getQuote();
            }
        }
        return "No quote was found!";
    }
}
