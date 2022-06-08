package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to the Car Simulator");

        Car car1 = new Car();
        System.out.println('\t'+car1.toString());

        System.out.println("Switching on the lights");
        car1.setLightsOn(true);
        System.out.println('\t'+car1.toString());

        System.out.println("Turning on the engine...");
        car1.startEngine();
        System.out.println('\t'+car1.toString());


    }
}
