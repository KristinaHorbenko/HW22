package org.example.builderPattern;

interface CarBuilder {
    void buildEngine();
    void buildWheels();
    void buildBody();
    Car getCar();
}

