import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class alarmm_clock {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime alarmTime = null;

        while (alarmTime == null) {

            try {

                System.out.print("Enter an alarm time (HH:mm:ss): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);

                if (alarmTime.isBefore(LocalTime.now())) {
                    System.out.println(
                            "The specified time has already passed today.");
                    alarmTime = null;
                    continue;
                }

                System.out.println("Alarm set for " + alarmTime);

            } catch (DateTimeParseException e) {

                System.out.println(
                        "Invalid format! Please use HH:mm:ss");

            }
        }

        Alarm_clock alarmClock = new Alarm_clock(alarmTime);

        Thread alarmThread = new Thread(alarmClock);

        alarmThread.start();

        try {
            alarmThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        scanner.close();
    }
}