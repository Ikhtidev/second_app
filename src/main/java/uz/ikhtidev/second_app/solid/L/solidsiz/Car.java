package uz.ikhtidev.second_app.solid.L.solidsiz;

public class Car extends Vehicle{
    @Override
    void startEngine() {
        System.out.println("Engine started");
        isEngineWorking = true;
    }

    @Override
    void stopEngine() {
        System.out.println("Engine stopped");
        isEngineWorking = false;
    }

    @Override
    void moveForward() {
        System.out.println("Moving forward");
    }

    @Override
    void moveBack() {
        System.out.println("Moving back");
    }
}
