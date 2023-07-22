package uz.ikhtidev.second_app.solid.L.solidli;

public class Car extends VehicleWithEngine{

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
        System.out.println("Engine stopped");
    }

    @Override
    public void moveForward() {
        System.out.println("Moving forward");
    }

    @Override
    public void modeBack() {
        System.out.println("Moving back");
    }

}
