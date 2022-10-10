public class CarPark {


    private int numberOfCompactParkingSpaces=250;
    private int numberOfRegularParkingSpaces=100;
    private int numberOfLargeParkingSpaces=50;


//    Van spots
private int vanRegularParkingSpacesTaken = 0;

    private int vanLargerParkingSpacesTaken = 0;

    public int getVanLargerParkingSpacesTaken() {
        return vanLargerParkingSpacesTaken;
    }

    public void setVanLargerParkingSpacesTaken(int vanLargerParkingSpacesTaken) {
        this.vanLargerParkingSpacesTaken = vanLargerParkingSpacesTaken;
    }

    public int getVanRegularParkingSpacesTaken() {
        return vanRegularParkingSpacesTaken;
    }

    public void setVanRegularParkingSpacesTaken(int vanRegularParkingSpacesTaken) {
        this.vanRegularParkingSpacesTaken = vanRegularParkingSpacesTaken;
    }




    public int getNumberOfTotalParkingSpaces() {
        return numberOfRegularParkingSpaces+numberOfLargeParkingSpaces+numberOfCompactParkingSpaces;
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


//- Tell us how many total spots are in the parking lot
    public void getNumberOfAvaliableSpacesByType(){
        System.out.println("Avaliable spaces:");
        System.out.println("");
        System.out.println("                 Motocycle: " + getNumberOfCompactParkingSpaces()+ " spaces.");
        System.out.println("                 Car: " + getNumberOfRegularParkingSpaces()+ " spaces.");
        System.out.println("                 Van: " + getNumberOfLargeParkingSpaces()+ " spaces.");

    }

//    - Tell us how many spots are remaining
public void getNumberOfRemainingAvaliableSpaces(){
    System.out.println("Avaliable spaces: " + getNumberOfTotalParkingSpaces());

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

//    Park motocycle

    public int canParkVehicle( Motorcycle motorcycle){
        if(numberOfCompactParkingSpaces - motorcycle.getCompactParkingSize() >=0){
            System.out.println("MOtocycle parked in compact spot");
            return numberOfCompactParkingSpaces=numberOfCompactParkingSpaces- motorcycle.getCompactParkingSize();

        }
        else if(numberOfRegularParkingSpaces - motorcycle.getCompactParkingSize() >=0){
            System.out.println("MOtocycle parked in regular  spot");
            return numberOfRegularParkingSpaces=numberOfRegularParkingSpaces- motorcycle.getCompactParkingSize();
        }
        else if(numberOfLargeParkingSpaces - motorcycle.getCompactParkingSize() >=0){
            System.out.println("MMotorcycle parked in large  spot");
            return numberOfLargeParkingSpaces=numberOfLargeParkingSpaces- motorcycle.getCompactParkingSize();
        }
        else{
            System.out.println("No parking available");
        }
        return 0;
    }
    public int canParkVehicle( Car car){

        if(numberOfRegularParkingSpaces - car.getRegularParkingSize() >=0){
            System.out.println("Car parked in regular  spot");
            return numberOfRegularParkingSpaces=numberOfRegularParkingSpaces- car.getRegularParkingSize();
        }

        else if(numberOfCompactParkingSpaces - car.getCompactParkingSize() >=0){
            System.out.println("Car  parked in compact spot");
            return numberOfCompactParkingSpaces=numberOfCompactParkingSpaces- car.getCompactParkingSize();

        }
            else{
            System.out.println("No parking available");
        }
        return 0;
    }
    public int canParkVehicle( Van van){

        if(numberOfLargeParkingSpaces - van.getLargeParkingSize() >=0){
            System.out.println("Van parked in large  spot");
            vanLargerParkingSpacesTaken++;
            return numberOfLargeParkingSpaces=numberOfLargeParkingSpaces- van.getLargeParkingSize();
        }

        else if(numberOfRegularParkingSpaces - van.getRegularParkingSize() >=3){
            System.out.println("Van  parked in regular spot");
            vanRegularParkingSpacesTaken++;
            return numberOfCompactParkingSpaces=numberOfCompactParkingSpaces- van.getRegularParkingSize();

        }
        else{
            System.out.println("No parking available");
        }
        return 0;
    }
}
