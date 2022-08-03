package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double result = 0;
        double taxes = 0;
        if(salary <= 10000){
            taxes = (salary * 100.0)/15.0;
            result = salary - taxes;
            System.out.println(result);
        }
        else if(10000.0<=salary && 20000.0>=salary){
            taxes = (salary*100.0)/18.0;
            result = salary - taxes;
            System.out.println(result);
        }
        else if(salary > 20000.0){
            taxes = (salary * 100.0)/20.0;
            result = salary - taxes;
            System.out.println(result);
        }else {
            System.out.println("wrong input!");
        }
    }
}
