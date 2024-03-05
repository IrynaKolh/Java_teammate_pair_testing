package time;

public class MonthDaysCalculator {

    private MonthDaysCalculator() {
    }

    public static String[] getMonthsByDays(int days) {
        return isValidDay(days)
               ? getMonthNames(days)
               : new String[0];
    }

    private static String[] getMonthNames(int days) {
        if (days == 28 || days == 29) {
            return new String[]{MonthType.FEBRUARY.getName()};
        }
        int index = 0;
        String[] monthNames = new String[getSize(days)];
        for (MonthType month : MonthType.values()) {
            if (month.getDays() == days) {
                monthNames[index++] = (month.getName());
            }
        }
        return monthNames;
    }

    private static int getSize(int days) {
        return switch (days) {
            case 31 -> 7;
            case 30 -> 4;
            default -> 1;
        };
    }

    public static boolean isValidDay(int days) {
        return !(days < 1 || days > 31);
    }
}
