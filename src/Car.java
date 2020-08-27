public class Car {

    public String model;
    public String colour;
    public int seats;

    Car(String model, String colour, int seats){
        this.model = model;
        this.colour = colour;
        this.seats = seats;
    }

    public void display(){
        System.out.println("Car Model is : " + model);
        System.out.println("The car colour is : " + colour);
        System.out.println("Number of seats are : " + seats);
        System.out.println();
    }

}
