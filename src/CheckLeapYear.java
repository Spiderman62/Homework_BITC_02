public class CheckLeapYear {
    private int four = 4, hundred = 100, fourHundred = 400;

    public void checkLeapYear(int year) {
        if (year % this.four == 0) {
            if (year % this.hundred == 0) {
                if (year % this.fourHundred == 0) {
                    System.out.printf("%d is a leap year.\n", year);
                } else
                    System.out.printf("%d is not a leap year.\n", year);
            } else
                System.out.printf("%d is a leap year.\n", year);
        } else
            System.out.printf("%d is not a leap year.\n", year);
    }

}
