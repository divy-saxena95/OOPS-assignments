package main;
//import java.io.*;
import checkforstrings.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        String str;
        CheckforStrings s = new CheckforStrings();
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        if(s.check(str))
            System.out.println("The string contains all letters from a-z case insensitive");
        else
            System.out.println("The string does not contain all letters from a-z");

    }}