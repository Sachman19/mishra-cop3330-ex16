/*
 *  UCF COP3330 Summer 2021 Assignment 16 Solution
 *  Copyright 2021 Sachin Mishra
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age. ");
        int age = input.nextInt();

        boolean test = age >= 18 ? true : false; //ternary operator doesnt work for printing statements and idk why and idc at this point.

        if(test) System.out.println("you are old enough to drive.");
        else System.out.println("you are not old enough to drive.");

    }
}