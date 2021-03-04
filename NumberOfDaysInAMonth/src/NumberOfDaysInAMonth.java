public class NumberOfDaysInAMonth {
    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0) {
                leapYear = true;
            }
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                leapYear = true;
            }
            if (year % 400 == 0) {
                leapYear = true;
            }
        }
        return leapYear;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        int daysInTheMonth = 0;
        if (isLeapYear(year)) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInTheMonth = 31;
                    break;
                case 2:
                    daysInTheMonth = 29;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInTheMonth = 30;
                    break;
            }
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInTheMonth = 31;
                    break;
                case 2:
                    daysInTheMonth = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInTheMonth = 30;
                    break;
            }
        }
        return daysInTheMonth;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
        System.out.println(getDaysInMonth(2,1924));
    }
}
