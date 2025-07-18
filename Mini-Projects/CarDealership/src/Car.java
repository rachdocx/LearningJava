import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts){
        this.parts = Arrays.copyOf(parts, parts.length);
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    public Car(Car other){
        this.make = other.make;
        this.color = other.color;
        this.price = other.price;
        this.year = other.year;
        this.parts = Arrays.copyOf(other.parts, other.parts.length); //!!!
    }

    //getters
    public String[] getParts(){
        return Arrays.copyOf(this.parts, this.parts.length);
    }
    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    //setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setParts(String[] parts){
        this.parts = Arrays.copyOf(parts, parts.length);
    }
    public void drive(){
        System.out.println("You bought the beautiful " + this.year + " " + this.color + " " + this.make + " for " + this.price +".");
        System.out.println("Please drive your car to the nearest exit\n");
    }

    public String toString(){
        return "Make: " + this.make + ".\n" + "Price: " + this.price + ".\n" + "Year: " + this.year + ",\n" + "Color: " + this.color + ".\n" + "Parts: " + Arrays.toString(parts) + " \n";
    }
}


