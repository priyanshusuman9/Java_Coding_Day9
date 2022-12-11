package EmployeeWage;

class Uc2 {
    static int days = 1;
    static int per_Hour = 20;
    static int empHr = 8;
    static int empWage = 0;
    static int count = empHr * per_Hour;
    static double empValue = Math.floor(Math.random() * 10) % 3;
}




    class C extends Uc2 {
        static void Present() {
            if (days == empValue && days == 1) {
                System.out.println("Wage is " + count);
            } else {
                System.out.println("Employee is Absent");
            }
        }


        public static void main(String[] args) {
           // C wages = new Uc2();
            C.Present();

        }}


