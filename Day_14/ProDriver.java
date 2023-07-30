class Vehicle{
    String brand;
    String price;
    String colour;
    public void start()
    {
        System.out.println("Your car has Started.......");
    }
    public void drive()
    {
        System.out.println("Driving.......");
    }
}
class Car extends Vehicle{
    Car(String brand, String price, String colour)
    {
        this.brand = brand;
        this.price = price;
        this.colour = colour;
    }

}
class ProDriver {
    public static void main(String[]args)
    {
        Car d1 = new Car("Rolls Royce","1.5 Cr", "Black");
        System.out.println("=========================Driver1=========================");
        System.out.println("Name of the Brand : "+d1.brand);
        System.out.println("Price of the car  : "+d1.price);
        System.out.println("Colour of the car : "+d1.colour);
        d1.start();
        d1.drive();
        System.out.println("=========================Driver2=========================");
        Car d2 = new Car("Maybac","10.5 Cr", "Royal Blue");
        System.out.println("Name of the Brand : "+d2.brand);
        System.out.println("Price of the car  : "+d2.price);
        System.out.println("Colour of the car : "+d2.colour);
        d2.start();
        d2.drive();
    }
    
}
