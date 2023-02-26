package IEmployee;

import java.util.ArrayList;
import java.util.Scanner;

    public class Employee {

        String name , job ,salary, department;

        int age ;

        public Employee() {



        }

        public Employee(String name, String job, String salary, String department, int age) {
            super();
            this.name = name;
            this.job = job;
            this.salary = salary;
            this.department = department;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public String getSalary() {
            return salary;
        }

        public void setSalary(String salary) {
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            ArrayList<Employee> employees = new ArrayList<>();

            for(int i =0 ; i < 5 ; i++) {
                Employee employee = new Employee();
                System.out.println("Nhap vao nhan vien" + i +1);
                System.out.println("Nhap tuoi");
                employee.age =scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhap ten");
                employee.name =scanner.nextLine();

                System.out.println("Nhap job");
                employee.job =scanner.nextLine();

                if(employee.job =="tester") {

                    employee.setDepartment("QA");


                }
                System.out.println("Nhap salary");
                employee.salary =scanner.nextLine();



                employees.add(employee);

            }
            for(int i1 =0 ; i1 < 5 ; i1++) {
                System.out.println("nhan vien" + i1 +1 + "co name :" + employees.get(i1).name + " age : "+ employees.get(i1).age + "job : " + employees.get(i1).job +
                " department : " + employees.get(i1).department);


            }




        }


    }

