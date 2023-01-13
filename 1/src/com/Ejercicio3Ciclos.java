package com;

public class Ejercicio3Ciclos {
	
	public static boolean isPalindrome(String str)
    {
        if (str == null) {
            return false;
        }
 
        for (int i = 0, j = str.length() - 1; i < j; i++, j--)
        {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
 
        return true;
    }
 
    public static void main (String[] args)
    {
        String str = "anitalavalatina";
 
        if (isPalindrome(str)) {
            System.out.println("Palindromo");
        }
        else {
            System.out.println("No Palindromo");
        }
    }
}


