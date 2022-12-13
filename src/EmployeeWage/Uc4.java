package EmployeeWage;

public class Uc4 {
    static final int part_time = 1;
    static final int full_time = 2;
    static final int emp_per_rate = 20;
    static int empHr = 4;
    static int empWage = empHr * emp_per_rate;;
    static int empCheck = (int) Math.floor(Math.random() * 10) % 3;

    public static void main(String[] args) {
        Uc4.SwitchCase();


    }

    static void SwitchCase() {
        switch (empCheck) {
            case part_time:
                empHr = 4;
                System.out.println(empWage);
                break;
            case full_time:
                empHr = 8;
                System.out.println(empWage);
                break;
            default:
                empHr = 0;

                empWage = empHr * emp_per_rate;
                System.out.println("Emp wage : " + empWage);
        }
    }
}

