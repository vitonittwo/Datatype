package com.company;

import java.util.Scanner;

/** @author  vitonit
 * @version first
 * date 13.04.2020.
 */

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Primitive data types");

         System.out.println("Byte data type");
             System.out.println("The byte data type have minimum value: - 128");
             System.out.println("The byte data type have maximum value:  127");
             System.out.print("Example:  ");
             byte y = 12;
        System.out.println("byte y = " + y);
             System.out.println();

        System.out.println("Short data type");
             System.out.println("The short data type have minimum value: - 32768");
             System.out.println("The short data type have maximum value:  32767");
        System.out.print("Example:  ");
             short u = 32100;
        System.out.println("short u = " + u);
             System.out.println();


        System.out.println("Integer data type int");
              System.out.println("The int data type have minimum value: - 2,147,483,648");
              System.out.println("The int data type have maximum value:  2,147,483,647");
        System.out.print("Example:  ");
              int o = 102000;
        System.out.println("Īnt o = " + o);
              System.out.println();

        System.out.println("Long data type");
              System.out.println("The long data type have minimum value: - 9 223 372 036 854 775 808 ");
              System.out.println("The long data type have maximum value:  9 223 372 036 854 775 807");
        System.out.println("Example:  ");
              long dc = 300000000000L; // decimal system
              // long oct = 04273131134000L; // octal system
             //  long hx = 0x45d964b800L; // Hexadecimal system
              // long by = 0b100010111011001011001001011100000000000L; // binary system
        System.out.println("long decimal = " + dc + "L");
        System.out.println("long octal system =  04273131134000L");
        System.out.println("long hexadecimal system = 0x45d964b800L");
        System.out.println("long binary system = 0b100010111011001011001001011100000000000L" );
              System.out.println();

        System.out.println("Float data type");
              System.out.println("The Float data type have minimum value: - 3.4*10^38 ");
              System.out.println("The Float data type have maximum value:  3.4*10^38");
        System.out.print("Example:  ");
              float s = 3.33f;
        System.out.println("float s = " + s + "f");
              System.out.println();

        System.out.println("Double data type");
              System.out.println("The Double data type have minimum value: - 1.7*10^308 ");
              System.out.println("The Double data type have maximum value:  1.7*10^308");
        System.out.print("Example:  ");
              double d = 3.00003;
        System.out.println("double d = " + d);
              System.out.println();

        System.out.println("Boolean data type. Logical.");
              System.out.println("The Boolean data type have two values: false or true ");
              System.out.print("Example:  ");
              boolean hai = true;
        System.out.println("boolean hai= " + hai);
              System.out.println();

        System.out.println("Char data type. Character.");
       // String vv = " \u0000 ";
       // String cc = " \uffff ";
        // I was looking for a way to print these characters
              System.out.println("The Char data type have minimum value:" + " \u0000 " + "(0)");
              System.out.println("The Char data type have maximum value:" + " \uffff " + "(65535)");
        System.out.print("Example:  ");
              char let = 'e';
        System.out.println("char let = " + "'" + let + "'");
        System.out.println();

    }
    
}
