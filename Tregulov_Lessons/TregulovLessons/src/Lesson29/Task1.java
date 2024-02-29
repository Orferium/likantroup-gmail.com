package Lesson29;
import  java.util.function.*;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList <Employee> list = new ArrayList<>();

        Employee e1 = new Employee("Василий", "ИК", 1133);
        Employee e2 = new Employee("Ерёма", "ИТ", 132);
        Employee e3 = new Employee("Олег", "ИБ", 126);
        Employee e4 = new Employee("ИС", "ИС", 129);
        Employee e5 = new Employee("Мокша", "ИТ", 1228);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        TestEmployee e6 = new TestEmployee();
        e6.FilterEmployee(list, ee -> ee.salary>200 && ee.department.equals("ИТ"));
        e6.FilterEmployee(list, ee -> ee.salary!=450 && ee.name.startsWith("Е"));
        e6.FilterEmployee(list, ee -> ee.department.equals(ee.name));
    }

    static class Employee {
        String name;
        String department;
        double salary;

        Employee(String name, String department, int salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;

        }
    }
        static class TestEmployee {

            // Employee e1 = new Employee("Василий", "ИТ", 128.3);

//        void printEmployee(e1.name, e1.department, e1.salary) {
//                System.out.println(e1.name);
////                System.out.println(department);
////                System.out.println(salary);
//            }

        public void printEmployee(Employee ee) {
            System.out.println("Работник " + ee.name + ", работающий в департаменте - " + ee.department + ", имеющий оклад в сумму - " + ee.salary);

        }

        public void FilterEmployee(ArrayList <Employee> Em, Predicate <Employee> t) {
           for (Employee e : Em) {
               if (t.test(e)) {
                   printEmployee(e);
               }
           }
        }
        }

    interface EmployeeChecks {
        boolean test(Employee e);
    }

    }


