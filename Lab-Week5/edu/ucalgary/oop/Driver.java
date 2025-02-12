package edu.ucalgary.oop;

class Driver {
    private String name;

    public Driver(String name) {  //Driver("Alice")
        this.name = name;
    }

    public Driver(Driver other) {  //deep copy, for new driver test code 
        this.name = other.name;
    }

    public String getName() { //for assert equals
        return name;
    }

    public void setName(String name) { //update name, for assert false
        this.name = name;
    }
}