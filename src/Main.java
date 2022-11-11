


public class Main {

    public static void main(String[] args) throws InterruptedException {

        String colonyName = "Brockton";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        System.out.println(meals);

        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;

        String landingLocation = "The Ocean";

        if (landingLocation.equals("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        landingCheck(4);
        new GuessingGame();
        new MarsExpedition();
        new FindingsList();
    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException  {
        boolean checkResult = false;
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if ((minute % 2) == 0 && (minute % 3) == 0) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);

        }
        System.out.println("Landed");
        return false;
    }

}

