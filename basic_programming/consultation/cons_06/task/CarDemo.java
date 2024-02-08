package task;

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Mercedes", "GLC 250", "dark blue");

        myCar.startEngine();
        myCar.beep("ОСТОРОЖНО! Двигатель работает!!!!");
        myCar.stopEngine();

    }
}
