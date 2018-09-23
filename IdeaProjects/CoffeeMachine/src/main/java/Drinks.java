/**
 * Created by Dimasik on 19.09.2018.
 */


import java.util.Scanner;

public class Drinks {

    private final static String welcomeMsg = "Welcome! Make you own coffee with the push of a few buttons!";

    private Coffee [] coffee = new Coffee [2];
    private int index = 0;


    public void  run(){
        showWelcomeMsg();
        printMenu();

    }

    private void showWelcomeMsg () {
        System.out.println("**********************************************************************");
        System.out.println("*                                                                    *");
        System.out.println("*                                                                    *");
        System.out.println("*    " + welcomeMsg + "    *");
        System.out.println("*                                                                    *");
        System.out.println("*                                                                    *");
        System.out.println("*                                                                    *");
        System.out.println("**********************************************************************");
    }

    private void printMenu(){
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while(flag){

            System.out.println();
            System.out.println("Please Enter an option.");
            System.out.println("1. Display coffee types.");
            System.out.println("2. Make coffee.");
            System.out.println("3. Add coffee beans.");
            System.out.println("4. Add milk.");
            System.out.println("5. Add water.");
            System.out.println("6. Clean the machine.");
            System.out.println("7. Information about the ingredients.");
            System.out.println("8. exit.");


            String str = scanner.next();
            if (!isAnumber(str)) {
                continue;
            }

            int key = Integer.valueOf(str);

            switch (key) {
                case 1:
                    displayCoffeeTypes ();
                    break;
                case 2:
                    makeCoffee ();
                    break;
                case 3:
                    addCoffee ();
                    break;
                case 4:
                    addMilk ();
                    break;
                case 5:
                    addWater ();
                    break;
                case 6:
                    System.out.println("The machine is cleaned.");
                   cleanMachine ();
                    break;
                case 7:
                    System.out.println("Information about the ingredients.");
                    informIngredients ();
                    break;
                case 8:
                    System.out.println("Exit.");
                    flag = false;
                    break;

                default:
                    System.out.println("Must choose a number between 1-3.");
                    break;
            }
        }
    }

    private void informIngredients() {
        System.out.println("Beans: " + coffee[index].getBeans());
        System.out.println("Water: " + coffee[index].getWater());
        System.out.println("Milk: " + coffee[index].getMilk());
        System.out.println("There are still cups: " + coffee[index].getCups());
    }

    private void cleanMachine() {
        coffee[index].setCups(8);
    }

    private void addWater() {
        System.out.println("Enter amount of water: ");
        Scanner scanner = new Scanner(System.in);
        int water = Integer.parseInt(scanner.next());
        if (water < 0) {
            System.out.println("You can not take water!");
        } else {
            if (water > 2000 - coffee[index].getWater()) {
                System.out.println("You're trying to add too much water. Maximum allowed: " + (2000 - coffee[index].getWater()));
            } else {
                coffee[index].setWater(coffee[index].getWater() + water);
                System.out.println("Water added.");
            }
        }
    }

    private void addMilk() {
        System.out.println("Enter amount of milk: ");
        Scanner scanner = new Scanner(System.in);
        int milk = Integer.parseInt(scanner.next());
        if (milk < 0) {
            System.out.println("You can not take milk!");
        } else {
            if (milk > 1000 - coffee[index].getMilk()) {
                System.out.println("You're trying to add too much milk. Maximum allowed: " + (1000 - coffee[index].getMilk()));
            } else {
                coffee[index].setMilk(coffee[index].getMilk() + milk);
                System.out.println("Milk added.");
            }
        }
    }

    private void addCoffee() {
        System.out.println("Enter amount of coffee beans: ");
        Scanner scanner = new Scanner(System.in);
        int beans = Integer.parseInt(scanner.next());
        if (beans < 0) {
            System.out.println("You can not take coffee beans!");
        } else {
            if (beans > 100 - coffee[index].getBeans()) {
                System.out.println("You're trying to add too much coffee beans. Maximum allowed: " + (100 - coffee[index].getBeans()));
            } else {
                coffee[index].setBeans(coffee[index].getBeans() + beans);
                System.out.println("Coffee beans added.");
            }
        }
    }


    private void makeCoffee () {

        coffee[index] = new Coffee();
        coffee[index].makeCoffee();
    }


    private void displayCoffeeTypes () {
        Coffee temp = new Coffee();
        temp.displayCoffeeTypes();
    }


    public boolean isAnumber(String str) {
        try {
            Integer.valueOf(str); //if str not a number The command will fail and jump to catch
            return true;
        } catch (Exception e) {
            System.err.println("Must enter a number.");
            return false;
        }
    }







}
