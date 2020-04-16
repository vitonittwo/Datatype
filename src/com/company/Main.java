package com.company;


import static java.lang.Long.MIN_VALUE;

/** @author  vitonit
 * @version first
 * date 13.04.2020.
 */

public class Main {

    public static void main(String[] args) {

       // public final class System {
        //    extend Object

        System.out.println("Primitive data types");

         System.out.println("Byte data type");
         System.out.println("The byte data type have minimum value: " + Byte.MIN_VALUE );
         System.out.println("The byte data type have maximum value: " + Byte.MAX_VALUE );
         System.out.print("Example:  ");
            byte y = 12;
        System.out.println("byte y = " + y+  "\n");

        System.out.println("Short data type");
        System.out.println("The short data type have minimum value: " + Short.MIN_VALUE );
        System.out.println("The short data type have maximum value:  " + Short.MAX_VALUE );
        System.out.print("Example:  ");
            short u = 32100;
        System.out.println("short u = " + u+  "\n");

        System.out.println("Integer data type int");
        System.out.println("The int data type have minimum value: " + Integer.MIN_VALUE );
        System.out.println("The int data type have maximum value:  " + Integer.MAX_VALUE );
        System.out.print("Example:  ");
            int o = 102000;
        System.out.println("Īnt o = " + o+  "\n");

        System.out.println("Long data type");
        System.out.println("The long data type have minimum value: " + MIN_VALUE );
        System.out.println("The long data type have maximum value: " + Long.MAX_VALUE );
        System.out.println("Example:  ");
            long dc = 300000000000L; // decimal system
        System.out.println("long decimal = "+ dc + "L");
        System.out.println("long octal system =  04273131134000L");
        System.out.println("long hexadecimal system = 0x45d964b800L");
        System.out.println("long binary system = 0b100010111011001011001001011100000000000L"+  "\n");

        System.out.println("Float data type");
        System.out.println("The Float data type have minimum value: " + "-" + (Float.MAX_VALUE ));
        System.out.println("The Float data type have maximum value: " + Float.MAX_VALUE );
        System.out.print("Example:  ");
            float s = 3.33f;
        System.out.println("float s = " + s + "f"+  "\n");

        System.out.println("Double data type");
        System.out.println("The Double data type have minimum value: " + "- " + Double.MAX_VALUE );
        System.out.println("The Double data type have maximum value: " + Double.MAX_VALUE );
        System.out.print("Example:  ");
            double d = 3.00003;
        System.out.println("double d = " + d+  "\n");

        System.out.println("Boolean data type. Logical.");
        System.out.println("The Boolean data type have two values: false or true ");
        System.out.print("Example:  ");
        System.out.println("boolean hai= " + true+  "\n");

        System.out.println("Char data type. Character.");
        System.out.println("The Char data type have minimum value:" + " \u0000 " + "(0)");
        System.out.println("The Char data type have maximum value:" + " \uffff " + "(65535)");
        System.out.print("Example:  ");
            char let = 'e';
        System.out.println("char let = " + "'" + let + "'"+  "\n");

        System.out.println("Reference data types.");
        System.out.print("Example:  ");
        System.out.println("Animal animal = new Animal(\"giraffe\")");
        System.out.println("'giraffe'" + "is the reference date."+  "\n");

        System.out.println("String data types.");
        System.out.println("Example:  ");
            String t7 = "Input: ", t6 = "Output: ";
            char w = ' ';
        System.out.println(t7 + " String t1 = \"String \", t2 = \"are\", t3 = \"class\", t4 = \"objects.\";");
        System.out.println("      " + "char w = ' ';");
        System.out.println("      " + "System.out.println(t1 + t2 + w + t1 + t3 + w + t4);");
        System.out.println(t6);
        String t1 = "String ", t2 = "are", t3 = "class", t4 = "objects.";
        System.out.print("      " + t1 + t2 + w + t1 + t3 + w + t4 +  "\n"+  "\n");

        System.out.println("The maximum value of data type + 1: \n");
        System.out.println("The maximum Byte value + 1:       " + (Byte.MAX_VALUE +1 ) + "\n");
        System.out.println("The maximum Short value + 1:      " + (Short.MAX_VALUE +1 ) + "\n");
        System.out.println("The maximum Integer value + 1:       " + (Integer.MAX_VALUE +1 ) + "\n");
        System.out.println("The maximum Long value + 1:       " + (Long.MAX_VALUE +1 ) + "\n");
        System.out.println("The maximum Float value + 1:       " + (Float.MAX_VALUE +1 ) + "\n");
        System.out.println("The maximum Double value + 1:       " + (Double.MAX_VALUE +1 ) + "\n");

        System.out.println("The minimum value of data type - 1: \n");
        System.out.println("The minimum Byte value - 1:       " + (Byte.MIN_VALUE - 1 ) + "\n");
        System.out.println("The minimumm Short value - 1:      " + (Short.MIN_VALUE - 1 ) + "\n");
        System.out.println("The minimum Integer value - 1:       " + (Integer.MIN_VALUE - 1 ) + "\n");
        System.out.println("The minimum Long value - 1:       " + (Long.MIN_VALUE - 1 ) + "\n");
        System.out.println("The minimum Float value - 1:       " + (Float.MIN_VALUE - 1 ) + "\n");
        System.out.println("The minimum Double value - 1:       " + (Double.MIN_VALUE - 1 ) + "\n");




        double ss = 33.89;
        System.out.print((int)Math.round(ss));

        }

    }


