// Runtime 46ms Beats 5.14%
// Memory 46.78MB Beats 6.00%

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DayOfTheYear {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.split("-")[0]);
        String firstDayOfYear = year + "-01-01";
        LocalDate start = LocalDate.parse(firstDayOfYear);
        LocalDate end = LocalDate.parse(date);
        long diffInDays = ChronoUnit.DAYS.between(start, end);
        return ((int)diffInDays) + 1;
    }
}
