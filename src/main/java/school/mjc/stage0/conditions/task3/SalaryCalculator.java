package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary <= 10000 && salary > 0) { 
            System.out.println((float)salary - (15 * salary) / 100); 
        } else if (salary > 10000 && salary <= 20000 && salary > 0) {
            System.out.println((float)salary - (18 * salary) / 100);
        } else if (salary > 20000 && salary > 0) {
            System.out.println((float)salary - (20 * salary) / 100);
        } else{
            System.out.println("wrong input!");
        }
    }
}
