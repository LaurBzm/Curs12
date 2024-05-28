package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File ("quotes.txt"));
        String answer = input.nextLine();
        System.out.println(answer);
        }
    }
