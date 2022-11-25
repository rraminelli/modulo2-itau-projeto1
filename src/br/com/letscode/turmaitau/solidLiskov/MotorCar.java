package br.com.letscode.turmaitau.solidLiskov;

public class MotorCar implements EngineCar, AccelerateCar {

    public void turnOnEngine() {
        System.out.println("turnOnEngine");
    }

    public void accelerate() {
        System.out.println("accelerate");
    }

}