package task;

public class Car {

    private String producer;
    private String model;
    private String color;

    // конструктор


    public Car(String producer, String model, String color) {
        this.producer = producer;
        this.model = model;
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    // Метод для запуска двигателя
    public void startEngine(){
        System.out.println("Двигатель " + model + " заведен!");
    }

    // Метод для остановки двигателя
    public void stopEngine(){
        System.out.println("Двигатель " + model + " остановлен!");
    }

    // Метод для сигнала
    public void beep(String sound){
        System.out.println("Автомобиль сигналит: " + sound);
    }

}
