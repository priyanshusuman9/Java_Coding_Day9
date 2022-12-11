package EmployeeWage;

    class Uc1 {
        static int days = 1;
        static double value = Math.floor(Math.random() * 10) % 2;

    }

    class B extends Uc1 {
        static void Present(){
            if (value == days  ){
                System.out.println("Wage is Present " );
            }
            else {
                System.out.println("Employee is Absent");
            }

        }
        public static void main(String[] args) {
            B.Present();


        }

    }


