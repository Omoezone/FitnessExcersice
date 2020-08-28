package com.company;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner console = new Scanner(System.in);
        List<Member> members = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();

        System.out.println("What do you want to create? \n1.Employee\n2.Member");
        int choice = console.nextInt();
        if(choice==1) {
            // Create new employee
            System.out.println("What type of employee shall be created? \n1.Administrator\n2.Instructor");
            System.out.println("Next, please fill out the required information");
            int value = console.nextInt();
            switch (value) {
                case 1:
                    String[] temp = {"Name:", "CRP:"};
                    System.out.println(temp[0]);
                    String a = console.next();
                    System.out.println(temp[1]);
                    String b = console.next();
                    Employee person = new Admin(a, b, 0, 0, 0);
                    employees.add(person);
                    break;
                case 2:
                    String[] temp1 = {"Name:", "CRP:", "Hours"};
                    System.out.println(temp1[0]);
                    String Ia = console.next();
                    System.out.println(temp1[1]);
                    String Ib = console.next();
                    System.out.println(temp1[2]);
                    int Ic = console.nextInt();
                    Employee person1 = new Instructor(Ia, Ib, Ic, 0);
                    employees.add(person1);
                    break;
                default:
            }
        }else if(choice == 2) {
            // Create Member
            System.out.println("Next, please fill out the required information");
            String[] tempE = {"Name", "CPR", "isBasic"};
            System.out.println(tempE[0]);
            String aM = console.next();
            System.out.println(tempE[1]);
            String bM = console.next();
            System.out.println(tempE[2]);
            Boolean cM = console.nextBoolean();

            Member member = new Member(aM, bM, cM);
            members.add(member);
        }
        else
            System.exit(10);

        System.out.println(members);
        System.out.println(employees);
    }
    
}
