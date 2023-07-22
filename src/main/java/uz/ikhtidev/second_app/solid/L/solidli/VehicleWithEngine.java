package uz.ikhtidev.second_app.solid.L.solidli;

public abstract class VehicleWithEngine implements Vehicle {
    private boolean isEngineWorking = false;

    public void startEngine(){
        isEngineWorking = true;
    }

    public void stopEngine(){
        isEngineWorking = false;
    }
}
