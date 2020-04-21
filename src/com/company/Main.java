package com.company;


import com.sun.deploy.uitoolkit.impl.awt.ui.SwingConsoleWindow;

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
        System.out.println("The byte data type have minimum value: " + Byte.MIN_VALUE);
        System.out.println("The byte data type have maximum value: " + Byte.MAX_VALUE);

        System.out.println("Short data type");
        System.out.println("The short data type have minimum value: " + Short.MIN_VALUE);
        System.out.println("The short data type have maximum value:  " + Short.MAX_VALUE);

        System.out.println("Integer data type int");
        System.out.println("The int data type have minimum value: " + Integer.MIN_VALUE);
        System.out.println("The int data type have maximum value:  " + Integer.MAX_VALUE);

        System.out.println("Long data type");
        System.out.println("The long data type have minimum value: " + MIN_VALUE);
        System.out.println("The long data type have maximum value: " + Long.MAX_VALUE);

        System.out.println("Float data type");
        System.out.println("The Float data type have minimum value: " + "-" + (Float.MAX_VALUE));
        System.out.println("The Float data type have maximum value: " + Float.MAX_VALUE);

        System.out.println("Double data type");
        System.out.println("The Double data type have minimum value: " + "- " + Double.MAX_VALUE);
        System.out.println("The Double data type have maximum value: " + Double.MAX_VALUE);

        System.out.println("Boolean data type. Logical.");
        System.out.println("The Boolean data type have two values: false or true ");

        System.out.println("Char data type. Character.");
        System.out.println("The Char data type have minimum value:" + " \u0000 " + "(0)");
        System.out.println("The Char data type have maximum value:" + " \uffff " + "(65535)");

        System.out.println("Reference data types.");
        System.out.print("Example:  ");
        System.out.println("Animal animal = new Animal(\"giraffe\")");
        System.out.println("'giraffe'" + "is the reference date." + "\n");

        System.out.println("String data types.");
        System.out.println("Example:  ");
        String t7 = "Input: ", t6 = "Output: ";
        char w = ' ';
        System.out.println(t7 + " String t1 = \"String \", t2 = \"are\", t3 = \"class\", t4 = \"objects.\";");
        System.out.println("      " + "char w = ' ';");
        System.out.println("      " + "System.out.println(t1 + t2 + w + t1 + t3 + w + t4);");
        System.out.println(t6);
        String t1 = "String ", t2 = "are", t3 = "class", t4 = "objects.";
        System.out.print("      " + t1 + t2 + w + t1 + t3 + w + t4 + "\n" + "\n");

        byte aa = 1;
        short bb = 1;
        int cc = 1;
        long dd = 1;
        float ee = 1f;
        double ff = 1;
        System.out.println("The maximum value of data type + 1: \n");
        System.out.println("The maximum Byte value + 1:       " + (Byte.MAX_VALUE + aa) + "\n");
        System.out.println("The maximum Short value + 1:      " + (Short.MAX_VALUE + bb) + "\n");
        System.out.println("The maximum Integer value + 1:       " + (Integer.MAX_VALUE + cc) + "\n");
        System.out.println("The maximum Long value + 1:       " + (Long.MAX_VALUE + dd) + "\n");
        System.out.println("The maximum Float value + 1:       " + (Float.MAX_VALUE + ee) + "\n");
        System.out.println("The maximum Double value + 1:       " + (Double.MAX_VALUE + ff) + "\n");

        System.out.println("The minimum value of data type - 1: \n");
        System.out.println("The minimum Byte value - 1:       " + (Byte.MIN_VALUE - aa) + "\n");
        System.out.println("The minimumm Short value - 1:      " + (Short.MIN_VALUE - bb) + "\n");
        System.out.println("The minimum Integer value - 1:       " + (Integer.MIN_VALUE - cc) + "\n");
        System.out.println("The minimum Long value - 1:       " + (Long.MIN_VALUE - dd) + "\n");
        System.out.println("The minimum Float value - 1:       " + (Float.MIN_VALUE - ee) + "\n");
        System.out.println("The minimum Double value - 1:       " + (Double.MIN_VALUE - ff) + "\n");

        byte y = 45;
        short u = 1005;
        int o = 700000;
        float s = 4.55f;
        double d = 1.456;
        char let = 'c';
        System.out.println("Example:  ");
        System.out.println("byte y = " + y);
        System.out.println("short u = " + u);
        System.out.println("Īnt o = " + o);
        long dc = 300000000000L; // decimal system
        System.out.println("long decimal = " + dc + "L");
        System.out.println("long octal system =  04273131134000L");
        System.out.println("long hexadecimal system = 0x45d964b800L");
        System.out.println("long binary system = 0b100010111011001011001001011100000000000L");
        System.out.println("float s = " + s + "f");
        System.out.println("double d = " + d);
        System.out.println("boolean hai= " + true);
        System.out.println("char let = " + "'" + let + "'");

        int xx;
        xx = o / let;
        System.out.println("xx =  o / let = " + xx + "  /result type is Integer/");
        double result = (s * y) + xx - (d * u);
        System.out.println("(s * y) + xx - (d * u) result = " + result + "    /result type is double/");

        double ss = 33.89;
        System.out.println("double 33.89 rounding result is  " +  (int)Math.round(ss));

        Integer i = new Integer(5);
        System.out.println(i);
        i = new Integer(i.intValue() + 1);
        System.out.println(i);
        int m = 5;
        System.out.println(m);
        m = m + 1;
        System.out.println(m);

        hello(); // call method
        welkome();
        welkome();

    }
    static void hello(){
            System.out.println("Hello"); // method body
            }
            static void welkome(){
       System.out.println("Welcom to Java 10!");
            }

        }




