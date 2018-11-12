package pl.coderslab;

public abstract class Animal {

    public void getSound(){
        System.out.println("wrrrrrrrrrr");
    }

    public int noOfLegs;
    public int getNoOfLegs() {
        return noOfLegs;
    }
    public abstract void walk();
}
