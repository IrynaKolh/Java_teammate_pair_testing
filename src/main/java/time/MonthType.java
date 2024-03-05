package time;

import java.time.LocalDate;

public enum MonthType {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private final String name;

    MonthType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return getDaysBy();
    }

    public int getDaysBy() {
        return switch (this) {
            case FEBRUARY -> (isLeap() ? 29 : 28);
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
        };
    }

    private static boolean isLeap() {
        int year = LocalDate.now().getYear();
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
