package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Person> person = new ArrayList<>();

        int runAgain;
        do { // Iterere så længe at man vælger at man gerne vil lave en ekstra person
            System.out.println("What do you want to create? \n1.Employee\n2.Member");
            int choice = console.nextInt();
            if (choice == 1) {

                // Create new employee
                System.out.println("What type of employee shall be created? \n1.Administrator\n2.Instructor");
                int value = console.nextInt();
                System.out.println("Next, please fill out the required information");
                switch (value) {
                    case 1:
                        String[] temp = {"Name:", "CRP:"};
                        System.out.println(temp[0]);
                        String a = console.next();
                        System.out.println(temp[1]);
                        String b = console.next();
                        Employee employee = new Admin(a, b, 0, 0, 0);
                        person.add(employee);
                        break;
                    case 2:
                        String[] temp1 = {"Name:", "CRP:", "Hours"};
                        System.out.println(temp1[0]);
                        String Ia = console.next();
                        System.out.println(temp1[1]);
                        String Ib = console.next();
                        System.out.println(temp1[2]);
                        int Ic = console.nextInt();
                        Employee instructor = new Instructor(Ia, Ib, Ic, 0);
                        person.add(instructor);
                        break;
                    default:
                }
            } else if (choice == 2) {
                // Create Member
                System.out.println("Next, please fill out the required information");
                String[] tempE = {"Name", "CPR", "isBasic"};
                System.out.println(tempE[0]);
                String aM = console.next();
                System.out.println(tempE[1]);
                String bM = console.next();
                System.out.println(tempE[2] + "\n(Input either 'y' or 'n')");
                Boolean cM = Validering.validBoolean(console);
                Member member = new Member(aM, bM, cM);
                person.add(member);
            } else

            // PrintOut
            printOut(person);

            System.out.println("Do you wish to create another person?\n 1. Yes\n 2. No");
            runAgain = console.nextInt();
        }while(runAgain == 1);
        printOut(person);
    }
    public static void printOut(List<Person> person){
        System.out.println("FITNESS EMPLOYEES");
        System.out.printf("%-15s\t%-15s\t%-15s\t%-15s\t%-15s\n","Name","Cpr","Hours","Salary","Vacation");
        System.out.println("**************************************************************************");
        for(int i = 0; i < person.size();i++){
            if(person.get(i) instanceof Employee) {
                System.out.println(person.get(i).toString());
            }
        }
        System.out.println("===============================================\n\n");

        System.out.println("FITNESS MEMBERS");
        System.out.printf("%-15s\t%-15s\t%-15s\t%-15s\n","Name","Cpr","Member Type","Fee");
        System.out.println("**************************************************************************");
        for(int i = 0; i < person.size();i++){
            if(person.get(i) instanceof Member) {
                System.out.println(person.get(i).toString());
            }
        }
        System.out.println("===============================================\n\n");

        System.out.println("EMPLOYEE & MEMBERS Name and cpr");
        System.out.printf("%-15s\t%-15s\n","Name","Cpr");
        System.out.println("**************************************************************************");
        for(int i = 0; i < person.size();i++){
            System.out.printf("%-15s\t%-15s\n",person.get(i).getName(),person.get(i).getCpr());
        }
        System.out.println("===============================================\n\n");

    }
    
}
