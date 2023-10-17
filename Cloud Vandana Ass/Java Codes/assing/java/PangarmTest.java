package assing.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangarmTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence or phrase: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
       
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (str.length() < 26) {
            return false; 
        }

        
        Set<Character> uniqueChars = new HashSet<>();

        
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }

       
        return uniqueChars.size() == 26;
    }
}

