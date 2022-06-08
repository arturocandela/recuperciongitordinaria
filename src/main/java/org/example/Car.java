package org.example;

public class Car {

    boolean lightsOn = false;
    boolean engineOn = false;

    public Car(){

        engineOn = false;

    }

    public boolean isLightsOn() {
        return lightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }

    public void startEngine(){
        engineOn = true;
    }

    public void stopEngine(){
        engineOn = false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "lightsOn=" + lightsOn +
                ", engineOn=" + engineOn +
                '}';
    }
}
