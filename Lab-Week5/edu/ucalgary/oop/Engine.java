package edu.ucalgary.oop;

public class Engine {
    private String engineType;

    // Constructor
    public Engine(String engineType) {
        this.engineType = engineType;
    }

    // Copy constructor for deep copy
    public Engine(Engine other) {
        this.engineType = other.engineType;
    }

    // Getter for engineType
    public String getEngine() {
        return engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    // Setter for engineType
    public void setEngine(String engineType) {
        this.engineType = engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
