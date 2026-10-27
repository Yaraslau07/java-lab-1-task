public class Main {
    public static void main(String[] args) {
        Car car = new Car("Camry", "Toyota", 2023, 28500.00, "White", 2);

        System.out.println("Initial car:");
        System.out.println(car.toString());

        car.sell();

        System.out.println();
        System.out.println("After selling one car:");
        System.out.println("Model:    " + car.getModel());
        System.out.println("Brand:    " + car.getBrand());
        System.out.println("Year:     " + car.getYear());
        System.out.println("Price:    " + car.getPrice());
        System.out.println("Color:    " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setPrice(27200.00);
        car.setColor("Midnight Black");

        System.out.println();
        System.out.println("After changing price and color:");
        System.out.println(car.toString());

        car.delivery();

        System.out.println();
        System.out.println("After a delivery, quantity: " + car.getQuantity());
    }
}
