public class Operators {
   public static final int s = 8;
    public static final int h = 5;
    public static final int f = 7;
    public static final int g = 90;
    public static final int k = 3;
    public static final int j = 11;

    public static void main(String[] args) {

        System.out.println("Arithmetic operators:");
        arithmeticOperators();

        System.out.println("Comparison operators:");
        comparisonOperators();

        System.out.println("Bitwise operators:");
        bitwiseOperators();

    }
    // below are descriptions of the methods

    public static void arithmeticOperators() {
        System.out.println("Arithmetic addition: s + h = " + (s + h));
        System.out.println("But!!! Addition: s + h = " + s + h);
        System.out.println("Arithmetic subtraction: h - s = " + (h - s));
        System.out.println("Arithmetic multiplication: h * s = " + (h * s));
        System.out.println("Arithmetic division: g / h = " + (g / h));
        System.out.println("Remainder of division 1: g % h = " + (g % h));
        System.out.println("Remainder of division 2: f % h = " + (f % h));
        int mi = 7;
        System.out.println("Increment - increases the value of the operand by 1: mi++ = " + (mi++)); // ??
        System.out.println("Decrement - decreases the value of the operand by 1: mi-- = " + (mi--)); // ??
    }
        public static void comparisonOperators() {

            System.out.println("Is the values s and h equal? - s == h = " + (s == h));
            System.out.println("Is the values s and h not equal? - s != h = " + (s != h));
            System.out.println("Is the value s greater than h? - s > h = " + (s > h));
            System.out.println("Is the value s less than h? - s < h = " + (s < h));
            System.out.println("Is the value s greater or equal than h? - s >= h =  " + (s >= h));
            System.out.println("Is the value s less or equal than h? - s <= h = " + (s <= h));
        }
        public static void bitwiseOperators() {
            int ba = s & h;
            System.out.println("Bitwise AND Operator: ba = s & h = " + ba);
            int bo = s | h;
            System.out.println("Bitwise OR Operator: ba = s | h = " + bo);
            int bx = h ^ j;
            System.out.println("Bitwise XOR Operator: bx = h ^ j = " + bx + "  ???"); // int bx = h ^ j = 14 !!!
            int bc = ~j;
            System.out.println("Bitwise Compliment Operator: bc = ~j = " + bc); // !!!
            int bls = f >> 2;
            System.out.println("Binary Left Shift Operator: bls = f >> 2 = " + bls);
            int blr = f << 3;
            System.out.println("Binary Right Shift Operator: blr = f << 3 = " + blr);
            int blz = g >>> 3;
            System.out.println("Zero fill right shift: blz = g >>> 3 = " + blz);
        }
    }

