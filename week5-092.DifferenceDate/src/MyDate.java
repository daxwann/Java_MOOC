public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int diffYear = this.year - comparedDate.year;
        int diffMonth = this.month - comparedDate.month;
        int diffDay = this.day - comparedDate.day;

        int exactDiffDay = diffYear * 360 + diffMonth * 30 + diffDay;

        int exactDiffYear = exactDiffDay / 360;

        if (exactDiffYear < 0) {
            exactDiffYear *= -1;
        }

        return exactDiffYear;
    }
}
