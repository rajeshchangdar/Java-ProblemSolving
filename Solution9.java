package com.probsol;

import java.util.Scanner;

public class Solution9 
{
	
	
	static boolean isAnagram(String a, String b) 
	{
       return(false);
    }
	
	
	
	
	

	public static void main(String[] args) 
	{
		

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		

	}

}
