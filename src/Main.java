import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Van van = new Van();
        Motorcycle motorcycle = new Motorcycle();
        CarPark carPark = new CarPark();


        System.out.println("Hello world!");

        Scanner userInput = new Scanner(System.in);


        while(true){
            System.out.println("What vehicle you want to park? Chose option  ");
            System.out.println("1. Motocycle");
            System.out.println("2 . Car");
            System.out.println("3. Van ");
            System.out.println("4. Check avaliable spaces");

            int userChoice=userInput.nextInt();

        switch(userChoice){
            case 1 :
                System.out.println("you choosed 1 ");
                break;
            case 2 :
                System.out.println("you choosed 2 ");
                break;
            case 3 :
                System.out.println("you choosed 3 ");
                break;
            case 4 :
                carPark.getNumberOfAvaliableSpaces();
                break;

        }

    }}
}