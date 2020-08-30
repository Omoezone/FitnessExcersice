package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validering {

    public static boolean validBoolean(Scanner console){
        String answer = console.next();
        while(!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n"))){
            System.out.println("There was an input mismatch, please make sure to input either 'y' or 'n'");
            System.out.println("Try again: ");
            answer = console.next();
        }
        if(answer.equalsIgnoreCase("y")){
            return true;
        }else
            return false;
    }
}
