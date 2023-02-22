package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if(mounth > 0){
        if(mounth <= 2 || mounth == 12){
            System.out.print("Winter");
        } else if (mounth >= 3 && mounth < 6) {
            System.out.print("Spring");
        } else if (mounth >= 6 && mounth < 9) {
            System.out.print("Summer");
        } else if (mounth >= 9 && mounth < 12) {
            System.out.print("Autumn");
        } else {
            System.out.print("wrong number!");
        }
        } else {
            System.out.print("wrong number!");
        }
    }
}
