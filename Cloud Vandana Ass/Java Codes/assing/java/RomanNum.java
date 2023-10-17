package assing.java;

import java.util.HashMap;
import java.util.Scanner;

public class RomanNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman number : ");
        String romanNumeral = scanner.nextLine();

        int result = romanToInt(romanNumeral);
        System.out.println("Integer equivalent of " + romanNumeral + " is: " + result);
        
        scanner.close();
    }

    public static int romanToInt(String s) {
       
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentRoman = s.charAt(i);
            int currentValue = romanMap.get(currentRoman);

            if (prevValue > currentValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}

