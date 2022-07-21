package com.maven;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        
        int add = add(n1, n2);
        System.out.println(add);
    }
    
    public static int add(int n1, int n2) {
    	return (n1 + n2);
    }
}
