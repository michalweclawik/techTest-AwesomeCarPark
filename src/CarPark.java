public class CarPark {
    private int numberOfTotalParkingSpaces=400;

    private int numberOfCompactParkingSpaces=250;
    private int numberOfRegularParkingSpaces=100;
    private int numberOfLargeParkingSpaces=50;


//    Van spots

    private int vanLargerParkingSpacesTaken = 0;
    private int vanRegularParkingSpacesTaken = 0;


    public int getNumberOfTotalParkingSpaces() {
        return numberOfTotalParkingSpaces;
    }

    public void setNumberOfTotalParkingSpaces(int numberOfTotalParkingSpaces) {
        this.numberOfTotalParkingSpaces = numberOfTotalParkingSpaces;
    }

    public int getNumberOfCompactParkingSpaces() {
        return numberOfCompactParkingSpaces;
    }

    public void setNumberOfCompactParkingSpaces(int numberOfCompactParkingSpaces) {
        this.numberOfCompactParkingSpaces = numberOfCompactParkingSpaces;
    }

    public int getNumberOfRegularParkingSpaces() {
        return numberOfRegularParkingSpaces;
    }

    public void setNumberOfRegularParkingSpaces(int numberOfRegularParkingSpaces) {
        this.numberOfRegularParkingSpaces = numberOfRegularParkingSpaces;
    }

    public int getNumberOfLargeParkingSpaces() {
        return numberOfLargeParkingSpaces;
    }

    public void setNumberOfLargeParkingSpaces(int numberOfLargeParkingSpaces) {
        this.numberOfLargeParkingSpaces = numberOfLargeParkingSpaces;
    }

// option 4
    public void getNumberOfAvaliableSpaces(){
        System.out.println("Avaliable spaces:");
        System.out.println("");
        System.out.println("                 Motocycle: " + getNumberOfCompactParkingSpaces()+ " spaces.");
        System.out.println("                 Car: " + getNumberOfRegularParkingSpaces()+ " spaces.");
        System.out.println("                 Van: " + getNumberOfLargeParkingSpaces()+ " spaces.");

    }

//- Tell us when the parking lot is full
    public void isFull(){
        if( numberOfCompactParkingSpaces ==0  && numberOfRegularParkingSpaces==0 && numberOfLargeParkingSpaces==0){
            System.out.println(" No available spaces. Car park is full ");
        }
    }
//    Tell us when the parking lot is empty

    public void isEmpty(){
        if( numberOfCompactParkingSpaces ==250  && numberOfRegularParkingSpaces==100 && numberOfLargeParkingSpaces==50){
            System.out.println("Car park is empty");
        }
    }

//    - Tell us when certain spots are full e.g. when all motorcycle spots are taken

public void whatTypeOfSpotsAreFull(){
        if (numberOfCompactParkingSpaces==0) {
            System.out.println("No dedicated spaces for motorcycles.");
        }
        if (numberOfRegularParkingSpaces==0) {
            System.out.println("No dedicated spaces for cars.");
        }
        if (numberOfLargeParkingSpaces==0) {
            System.out.println("No dedicated spaces for vans.");
        }
    }
//- Tell us how many spots vans are taking up
    public void howManySpotsVansTakes(){
        System.out.println( "Vans taking :");
        System.out.println( "              " +vanRegularParkingSpacesTaken + " regular spots. ");
        System.out.println( "              " +vanLargerParkingSpacesTaken + " large spots. ");
    }
}
