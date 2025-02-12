package edu.ucalgary.oop;

public class Car {
	
	private String model;
	private Driver driver;
	private Engine engine;
	
	public Car (String model, Driver driver, Engine engine) {
	    this.model = model;
	    this.driver = driver;
	    this.engine = engine;
	  }
	
	public Car (Car other, Boolean copy) {
		this.model = other.model;
		this.driver = other.model;
		this.engine = other.engine;
		
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public Driver getDriver() {
		return driver;
	}
	
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
