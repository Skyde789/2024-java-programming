package oamk.stream;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public record Product(String name, Double price, String category, LocalDateTime bestBefore) implements OutputFormatter{
    
    public String formatProduct(DateTimeFormatter dt){
        String formattedDateTime = bestBefore.format(dt);

        return String.format(Locale.US,"[%s,%s,%.2f,%s]", name,category,price,formattedDateTime);
    }
}