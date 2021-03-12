import java.time.LocalDate;
import java.time.Period;

public class EstonianID implements PersonalCodeBehavior {
    public String code;

    public EstonianID(String code) {
        this.code = code;
    }

    @Override
    public String getGender() {
        int gender = Integer.parseInt(this.code.substring(0, 1));
        if (gender % 2 == 0) {
            return "Your gender is female";
        } else {
            return "Your gender is male";
        }
    }

    @Override
    public int getFullYear() {
        // String dob;
        // if (code.substring(0, 1).equals("5") || code.substring(0, 1).equals("4")) {
        // dob = "20" + code.substring(1, 3);
        // } else {
        // dob = "19" + code.substring(1, 3);
        // }
        // return Integer.parseInt(dob);
        int year = 1800 + ((Integer.parseInt(code.substring(0, 1)) + 1) / 2 - 1) * 100
                + (Integer.parseInt(code.substring(1, 3)));

        return year;

    }

    @Override
    public String getDOB() {
        String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int month = Integer.parseInt(code.substring(3, 5));
        int day = Integer.parseInt(code.substring(5, 7));
        return day + ". " + months[month - 1] + ", " + getFullYear();
    }

    public int[] getDate() {
        int day = Integer.parseInt(code.substring(5, 7));
        int month = Integer.parseInt(code.substring(3, 5));
        int[] data = { month, day };
        return data;
    }

    @Override
    public int getAge() {
        int[] data = getDate();
        LocalDate dob = LocalDate.of(getFullYear(), data[0], data[1]);
        LocalDate now = LocalDate.now();
        Period interval = Period.between(dob, now);
        return interval.getYears();
    }
}
