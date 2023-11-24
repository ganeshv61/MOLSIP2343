import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AgeCalculator {

    public static void main(String[] args) {
        LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 0, 0); 
        LocalDateTime endDateTime = LocalDateTime.of(2024, 1, 1, 0, 0);   

        List<LocalDateTime> allTimes = listAllTimes(startDateTime, endDateTime);
        for (LocalDateTime dateTime : allTimes) {
            System.out.println(dateTime);
        }
    }
    private static List<LocalDateTime> listAllTimes(LocalDateTime startDateTime, LocalDateTime endDateTime) {
        List<LocalDateTime> allTimes = new ArrayList<>();
        LocalDateTime currentDateTime = startDateTime;

        while (!currentDateTime.isAfter(endDateTime)) {
            allTimes.add(currentDateTime);
            currentDateTime = currentDateTime.plusMinutes(1); 
        }
        return allTimes;
    }
}
