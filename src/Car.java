public class Car {

    public String model;
    public String colour;
    public int seats;

    public void display(){
        System.out.println("Car Model is : " + model);
        System.out.println("The car colour is : " + colour);
        System.out.println("Number of seats are : " + seats);
        System.out.println();
    }

    public void initialize(String a3_quattro, String green, int i){
        model = a3_quattro;
        colour = green;
        seats = i;
    }

}
