/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapJava;

import java.util.Scanner;

/**
 *
 * @author Dinh Quy
 */
public class Bai26 {
       public static void main(String[] args)
{
    Scanner scan=new Scanner(System.in);
    System.out.print("Input a Octal: ");
    int a=scan.nextInt();
    int decimalValue = Integer.parseInt(String.valueOf(a), 8);
    System.out.print("Octal to Binary :"+Integer.toBinaryString(decimalValue));
} 
}
