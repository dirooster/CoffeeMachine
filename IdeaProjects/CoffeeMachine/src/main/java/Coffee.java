/**
 * Created by Dimasik on 19.09.2018.
 */
import java.util.Scanner;

public class Coffee {

    private String [] types = {"cappuccino","americano","latte"};
    private String userSelectedType;

    private static int water = 2000;
    private static int milk = 1000;
    private static int beans = 100;
    private static int cups = 8;

    public Coffee() {
    }

    public Coffee(String userSelectedType) {
        setUserSelectedType(userSelectedType);
        execute ();
    }

    public void makeCoffee () {
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            displayCoffeeTypes ();
            System.out.println();
            System.out.println("4. Cancel.");
            System.out.println();
            System.out.println("Select the number of the type you want: ");

            String str = s.next();
            if (!isAnumber(str)) {
                continue;
            }

            int key = Integer.valueOf(str);

            switch (key) {
                case 1:
                    if(getWater() < 150) {
                        System.out.println("You need to add water!");
                        flag = true;
                        break;
                    }
                    if(getMilk() < 100) {
                        System.out.println("You need to add milk!");
                        flag = true;
                        break;
                    }
                    if(getBeans() < 15) {
                        System.out.println("You need to add coffee beans!");
                        flag = true;
                        break;
                    }
                    if(getCups() < 1) {
                        System.out.println("You need to clean the machine!");
                        flag = true;
                        break;
                    }
                    else {
                        setWater(getWater() - 150);
                        setMilk(getMilk() - 100);
                        setBeans(getBeans() - 15);
                        setCups(getCups() - 1);
                        setUserSelectedType(types[0]);
                        flag = false;
                        break;
                    }

                case 2:

                    if(getWater() < 200) {
                        System.out.println("You need to add water!");
                        flag = true;
                        break;
                    }
                    if(getBeans() < 20) {
                        System.out.println("You need to add coffee beans!");
                        flag = true;
                        break;
                    }
                    if(getCups() < 1) {
                        System.out.println("You need to clean the machine!");
                        flag = true;
                        break;
                    }
                    else {
                        setWater(getWater() - 200);
                        setBeans(getBeans() - 20);
                        setCups(getCups() - 1);
                        setUserSelectedType(types[1]);
                        flag = false;
                        break;
                    }
                case 3:
                    if(getWater() < 150) {
                        System.out.println("You need to add water!");
                        flag = true;
                        break;
                    }
                    if(getMilk() < 150) {
                        System.out.println("You need to add milk!");
                        flag = true;
                        break;
                    }
                    if(getBeans() < 10) {
                        System.out.println("You need to add coffee beans!");
                        flag = true;
                        break;
                    }
                    if(getCups() < 1) {
                        System.out.println("You need to clean the machine!");
                        flag = true;
                        break;
                    }
                    else {
                        setWater(getWater() - 150);
                        setMilk(getMilk() - 150);
                        setBeans(getBeans() - 10);
                        setCups(getCups() - 1);
                        setUserSelectedType(types[2]);
                        flag = false;
                        break;
                    }
                case 4:
                    flag = false;
                    return;

                default:
                    System.out.println("Must enter number between 1-4.");
                    break;
            }
        }

        execute();
    }

    private void execute () {

        System.out.println();
        System.out.println("Take your coffee: " + userSelectedType + ".");
         }



    public void displayCoffeeTypes () {
        System.out.println();
        System.out.println("Coffee types available:");
        for (int i = 1; i < types.length + 1; i++) {
            System.out.println(i + ". " + types[i-1]);
        }
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


    public String[] getTypes() {
        return types;
    }

    private void setTypes(String[] types) {
        this.types = types;
    }

    public String getUserSelectedType() {
        return userSelectedType;
    }

    private void setUserSelectedType(String userSelectedType) {
        this.userSelectedType = userSelectedType;
    }
    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

}
