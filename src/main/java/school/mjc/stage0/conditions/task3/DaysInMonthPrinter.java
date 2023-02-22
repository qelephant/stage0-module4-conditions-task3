package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if(mouth > 0){
        if(mouth==2){
            System.out.println("28");
        }
        else if(mouth%2 == 0) {
            System.out.println("30");
        } else if (mouth%2 == 1) {
            System.out.println("31");
            }
        } else {
            System.out.println("wrong number!");
        }
    }
}
