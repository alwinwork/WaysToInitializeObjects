public class MainClass {
    public static void main(String[] args){

        Car c = new Car();
        //c.initialize("Model s", "Red", 4);
        c.model = "Model s" ;
        c.colour = "Red";
        c.seats = 4;

        Car c1 = new Car();
        c1.initialize("Model S2", "Yellow", 3);

        c.display();
        c1.display();

    }
}
