package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        if (number == 0){
            System.out.println("cannot divide by zero");
        }
        else if(number%2 == 0){
            System.out.println("Dividable");
        } else if(number%2 == 1){
            System.out.println("Non-dividable");
        }
    }
}
