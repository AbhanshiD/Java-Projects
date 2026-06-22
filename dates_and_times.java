import java.util.Scanner;
import java.util.Random;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;  // Missing import
import java.time.format.DateTimeFormatter;

public class dates_and_times {
    
     public static void main(String[] args) {

        // How to work with DATES & TIMES using JAVA
        // (Local dates, local time, local date time, utc timestamp)

         Scanner scanner = new Scanner(System.in);

         LocalDateTime dateTime = LocalDateTime.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy H:mm:ss");
         String newDateTime = dateTime.format(formatter);

         System.out.println(newDateTime);

         scanner.close();

     }
}