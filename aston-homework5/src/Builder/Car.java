package Builder;

import java.util.Arrays;

public class Car {

    private String model;
    private String body;
    private int year;
    private int wheelsCount;
    private double pressure;
    private double[] wheels;


    public Car(CarBuilder carBuilder){
        if (carBuilder == null)
            throw new IllegalArgumentException("Заполните данные для создания машины.");
        if (carBuilder.model == null || carBuilder.model.trim().isEmpty())
            throw new IllegalArgumentException("Введите модель автомобиля.");
        if (carBuilder.body == null || carBuilder.body.trim().isEmpty())
            throw new IllegalArgumentException("Введите тип кузова автомобиля.");
        if (carBuilder.year <= 0)
            throw new IllegalArgumentException("Введите год выпуска автомобиля.");
        if (carBuilder.wheelsCount < 0)
            throw new IllegalArgumentException("Колёс не может быть меньше чем нисколько");
        model = carBuilder.model;
        body = carBuilder.body;
        year = carBuilder.year;
        wheelsCount = carBuilder.wheelsCount;
        pressure = carBuilder.pressure;
        wheels = new double[wheelsCount];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = pressure;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", body='" + body + '\'' +
                ", year=" + year +
                ", wheelsCount=" + wheelsCount +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }

    public static class CarBuilder {
        private String model;
        private String body;
        private int year;
        private int wheelsCount;
        private double pressure;
        private double[] wheels = new double[wheelsCount];

        public CarBuilder(){
            super();
        }

        public CarBuilder model(String model){
            this.model = model;
            return this;
        }

        public CarBuilder body(String body) {
            this.body = body;
            return this;
        }

        public CarBuilder year(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder wheelsCount(int wheelsCount) {
            this.wheelsCount = wheelsCount;
            return this;
        }

        public CarBuilder pressure(double pressure) {
            this.pressure = pressure;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

    }
}


