class Vehicle {


    private static class Car extends Vehicle {
        public static void main(String[] args) {
            Vehicle veh = new Car();
            boolean result = veh instanceof Car;
            // This statement will still return 'true' if the object being compared is type-compatible.
            System.out.println(result);

           // int i = 1;
            //while (i < 6) {
             //   System.out.println(i + " < 6");
             //   i++;
            //    }
           // int p = 2;
           // do {
             //   System.out.println(p + " < 5");
            //    p++;
           // } while (p < 5);

           // System.out.println("Operator priority in Java:");
           // System.out.println("|-----------|-------------------|---------------------|");
           // System.out.println("|  Postfix  |  () [] . (point)  |  From left to right |");
           // System.out.println("|-----------|-------------------|---------------------|");
           // System.out.println("|  Unary    |  ++ -- ! ~        |  From right to left |");
           // System.out.println("|-----------|-------------------|---------------------|");

        }
    }
}