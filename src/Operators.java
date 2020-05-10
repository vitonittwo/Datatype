public class Operators {
   public static final int s = 8;
    public static final int h = 5;
    public static final int f = 7;
    public static final int g = 90;
    public static final int k = 3;
    public static final int j = 11;

    public static void main(String[] args) {

        System.out.println("The Arithmetic operators:");
        arithmeticOperators();

        System.out.println("The Comparison operators:");
        comparisonOperators();

        System.out.println("The Bitwise operators:");
        bitwiseOperators();

        System.out.println("The Logical operators:");
        logicalOperators();

        System.out.println("The Assignment Operators:");
        assignmentOperators();

        System.out.println("The ternary Operators:");
        ternaryOperator();

        System.out.println("The instanceof Operators:");
        instanceofOperator();

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
        public static void logicalOperators() {
        boolean lao = false;
        boolean lap = true;
        System.out.println("boolean lao = false" + "\n" + "boolean lap = true");
        System.out.println("Logical AND operator '&&': lao && lap = " + (lao && lap));
        System.out.println("Logical OR operator '||': lao || lap = " + (lao || lap));
        System.out.println("Logical NOT operator '!': !(lao || lap) = " + !(lao || lap));
        }
        public static void assignmentOperators() {
        System.out.println("-  = assigns values from right side operands to left side operand A = B");
            System.out.println("-  A += B is same as A = A + B");
            System.out.println("-  A -= B is same as A = A - B");
            System.out.println("-  A *= B is same as A = A * B");
            System.out.println("-  A /= B is same as A = A / B");
            System.out.println("-  A %= B is same as A = A % B");
            System.out.println("-  A <<= 2 is same as A = A << 2");
            System.out.println("-  A >>= 2 is same as A = A >> 2");
            System.out.println("-  A &= 2 is same as A = A & 2");
            System.out.println("-  A ^= 2 is same as A = A ^ 2");
            System.out.println("-  A |= 2 is same as A = A | 2");
        }
        public static void ternaryOperator() {
            System.out.println("View: variable = (expression)? value if true: value if false");
        System.out.println("The example:");
            int yy, xx;
            yy = 20;
            xx = (yy == 1) ? 20 : 30;
            System.out.println("Value of xx is - " + xx);
            xx = (yy == 20) ? 20 : 40;
            System.out.println("Value of xx is - " + xx);
        }
        public static void instanceofOperator() {
            System.out.println("View: boolean 'variable' = 'Object reference variable' instanceof 'class/interface type'");
            System.out.println("The example:");
            System.out.println("String name =  'Tatoo';" + "\n" + "boolean result = name instanceof String;");
            String name = "Tatoo";
            boolean result = name instanceof String;
            System.out.println("Result = " + result);

        }
    }

