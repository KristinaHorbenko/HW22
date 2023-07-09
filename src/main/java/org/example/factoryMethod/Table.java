package org.example.factoryMethod;

public class Table implements Furniture{
    @Override
    public void production() {
        System.out.println("Create a table");
    }
}
