class Vehicle {


    private static class Car extends Vehicle {
        public static void main(String[] args) {
            Vehicle veh = new Car();
            boolean result = veh instanceof Car;
            // This statement will still return 'true' if the object being compared is type-compatible.
            System.out.println(result);

        }
    }
}