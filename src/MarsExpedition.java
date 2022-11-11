import java.util.Scanner;

public class MarsExpedition {

    public void marsExpedition() {
        Scanner input = new Scanner(System.in);

        System.out.println("System boot starting!");
        System.out.println("Initializing....");
        System.out.println("Boot successful! Starting now!");

        System.out.println("Please enter your name...");

        String name = input.nextLine();

        System.out.println("Hi, " + name + " - Welcome to the Expedition prep program. Are you ready to head out " +
                "into the new world? Type Y or N");

        String answer = input.nextLine();

        if (answer.equals("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        }else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        System.out.println("How many people do you want on your expedition team? (Input an int number)");

        int teamSize = input.nextInt();
        input.nextLine();

        if (teamSize > 2) {
            System.out.println("That's way to many people. We can only send 2 more members.");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not enough people. We need you and 2 more members.");
            teamSize = 2;

        } else if (teamSize == 2) {
            System.out.println("That's a perfect sized team. Good job.");
        }


        System.out.println("You are allowed to bring one snack with you. What do you want to bring>");
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you.");

        System.out.println("You have the choice of 3 vehicles" +
                "\nA: Space X Rover" +
                "\nB: Cyber Truck" +
                "\nC: Space Boat");
        String vehicleChoice = input.nextLine();

        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "Space X Rover";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "Cyber Truck";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "Space Boat";
        }else{
            vehicleChoice = "your feet";
        }

        System.out.println("Your expedition team is all set" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nTake Off!");
    }

}
