package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if(month > 0){
        if(month <= 2 || month == 12){
            System.out.print("Winter");
        } else if (month >= 3 && month < 6) {
            System.out.print("Spring");
        } else if (month >= 6 && month < 9) {
            System.out.print("Summer");
        } else if (month >= 9 && month < 12) {
            System.out.print("Autumn");
        } else {
            System.out.print("wrong number!");
        }
        } else {
            System.out.print("wrong number!");
        }
    }
}
