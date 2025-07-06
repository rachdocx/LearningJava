public class Main {
    public static void main(String[] args) {
        String[] parts = {"tires", "keys"};
        Car nissan = new Car("Nissan", 10000, 2020, "Green", parts);
        Car dodge = new Car("Nissan", 12000, 2019, "Blue", parts);

        Car nissan2 = new Car(nissan);  //copy constructor

        nissan2.setColor("Yellow");


        nissan2.drive();
    }
}