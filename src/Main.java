import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Van van = new Van();
        Motorcycle motorcycle = new Motorcycle();
        CarPark carPark = new CarPark();


        System.out.println("Hello world!");

        Scanner userInput = new Scanner(System.in);

        boolean runApp =true;
        while(runApp){
            System.out.println();
            System.out.println("What vehicle you want to park? Chose option  ");
            System.out.println("1. Motorcycle");
            System.out.println("2. Car");
            System.out.println("3. Van ");
            System.out.println();
            System.out.println("or ");
            System.out.println("4. Check available spaces");
            System.out.println("5. Check available spaces by type");
            System.out.println("6. Check how many spots vans are taking up ");
            System.out.println("7. Exit");

            System.out.println();

            int userChoice=userInput.nextInt();
            System.out.println();
        switch(userChoice){
            case 1 :
                System.out.println("you chosen 1 ");
                carPark.canParkVehicle(motorcycle);
                break;
            case 2 :
                System.out.println("you chosen 2 ");
                carPark.canParkVehicle(car);
                break;
            case 3 :
                System.out.println("you chosen 3 ");
                carPark.canParkVehicle(van);
                break;
            case 4 :
                carPark.getNumberOfRemainingAvaliableSpaces();
                break;
            case 5 :
                carPark.getNumberOfAvaliableSpacesByType();
                break;
            case 6 :
                carPark.howManySpotsVansTakes();
                break;
            case 7 :
                System.out.println("Exit");
                runApp=false;
                break;

            default:
                System.out.println("Wrong input try again ");
        }
            System.out.println();

    }}
}