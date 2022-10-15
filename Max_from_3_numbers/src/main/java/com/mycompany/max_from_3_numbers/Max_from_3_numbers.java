/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.max_from_3_numbers;

/**
 *
 * @author deepika
 */
import java.util.*;

public class Max_from_3_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value 01 = :");
        int x =sc.nextInt();
        
        System.out.println("Enter value 02 = :");
        int y =sc.nextInt();
        
        System.out.println("Enter value 03 = :");
        int z =sc.nextInt();
        
        if(x>y)
            if(x>z)
            {System.out.println("Largest Number is = "+x);
            } else
            {System.err.println("Largest number is = "+z);
            } else if(y>z)
            {System.out.println("Largest Number is = "+y);
            } else 
            {System.out.println("Largest Number is = "+z);
            }
        sc.close();
    }
}
