package tema14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainTema {
    public static void main(String[] args) throws IOException {
        String quotes = "src/txt/quotes.txt";
        FileReader fileReader = new FileReader(quotes);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<String> lines =new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split("~");
            if (parts.length == 2) {
                String autor = parts[0];
                String quote = parts[1];
                lines.add(line);
              //  System.out.println("Autor: " + autor);
              //  System.out.println("Citat: " + quote);
            }
        }

        QuoteService service = new QuoteService(createQuotesFromLines(lines));
        System.out.println(service.getAllQuotes());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(service.getAuthors());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        service.setFavourite(2);
        System.out.println(service.getFavourites());
        System.out.println(service.getRandomQuote());




    }
    public static List<Quote> createQuotesFromLines(List<String> lines) {
        List<Quote> quotes = new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split("~");
            if (parts.length == 2) {
                String author = parts[0];
                String quote = parts[1];
                quotes.add(new Quote(1,author, quote,false));
            }
        }
        return quotes;
    }

}
