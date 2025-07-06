
public class Main {
    public static void main(String[] args) {
        String[] parts = {"tires", "keys"};

        Car[] cars = new Car[]{
                new Car("Nissan", 10000, 2020, "Green", parts),
                new Car("Dodge", 12000, 2019, "Blue", parts),
                new Car("Nissan", 12000, 2019, "Blue", new String[] {"tires", "filter"}),

                new Car("Honda", 7000, 2019, "Orange", new String[] {"tires", "filter"}),
                new Car("Mercedes", 14000, 2015, "Jet Black", new String[] {"tires", "filter", "keys"})
        };
//        Car nissan = new Car("Nissan", 10000, 2020, "Green", parts);
//        Car dodge = new Car("Nissan", 12000, 2019, "Blue", parts);
//
//        Car nissan2 = new Car(nissan);  //copy constructor

//        nissan2.setColor("Yellow");
//        nissan2.setParts(new String[] {"tiers", "filter"}); // return new String[]
//        String[] a = nissan.getParts();
//        a[1] = "hello";
//
//        System.out.println(Arrays.toString(nissan.getParts()));
//        System.out.println(Arrays.toString(nissan2.getParts()));
//        System.out.println(nissan);

        Dealership dealership = new Dealership(cars);
//        dealership.setCar(cars[0], 0);
//        dealership.setCar(cars[1], 1);
//        dealership.setCar(cars[2], 2);

//        for(int i = 0; i < cars.length; i++){
//            dealership.setCar(cars[i], i);
//        }



//        Car newCar = dealership.getCar(0);
//        newCar.setColor("Blue");
//        System.out.println(newCar);
//        System.out.println(dealership.getCar(0));
//       dealership.sell(2);
//        System.out.println( dealership.search("Dodge", 14000));
//        System.out.println(dealership);
        System.out.println(dealership);
    }
}