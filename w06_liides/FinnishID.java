
import java.time.LocalDate;
import java.time.Period;

public class FinnishID implements PersonalCodeBehavior {
    public String code;

    public FinnishID(String code) {
        this.code = code;
    }

    @Override
    public String getGender() {
        int gender = Integer.parseInt(this.code.substring(7, 10));
        if (gender % 2 == 0) {
            return "Your gender is male";
        } else {
            return "Your gender is female";
        }
    }

    @Override
    public int getFullYear() {
        String dob = "0";
        String character = code.substring(6, 7);
        if (character.equals("A")) {
            dob = "20" + code.substring(4, 6);
        } else if (character.equals("+")) {
            dob = "18" + code.substring(4, 6);
        } else if (character.equals("-")) {
            dob = "19" + code.substring(4, 6);
        }
        return Integer.parseInt(dob);
    }

    @Override
    public String getDOB() {
        String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int month = Integer.parseInt(code.substring(0, 2));
        int day = Integer.parseInt(code.substring(2, 4));
        return day + ". " + months[month - 1] + ", " + getFullYear();
    }

    public int[] getDate() {
        int month = Integer.parseInt(code.substring(0, 2));
        int day = Integer.parseInt(code.substring(2, 4));
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
