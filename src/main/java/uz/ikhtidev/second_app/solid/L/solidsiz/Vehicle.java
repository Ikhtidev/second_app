package uz.ikhtidev.second_app.solid.L.solidsiz;

public abstract class Vehicle {
    protected boolean isEngineWorking = false;
    abstract void startEngine();
    abstract void stopEngine();
    abstract void moveForward();
    abstract void moveBack();
}
