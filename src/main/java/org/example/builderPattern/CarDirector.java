package org.example.builderPattern;

public class CarDirector {
    private CarBuilder carBuilder;
        public CarDirector(CarBuilder carBuilder) {
            this.carBuilder = carBuilder;
        }

        public void constructCar() {
            carBuilder.buildEngine();
            carBuilder.buildWheels();
            carBuilder.buildBody();
        }
}
