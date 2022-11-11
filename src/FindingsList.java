import java.util.*;

public class FindingsList {

    public void findingsList() throws InterruptedException {

        Thread.sleep(500);

        System.out.println("Welcome back!");

        ArrayList<String> rockList = new ArrayList<>();

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println("Rock data downloaded.");

        System.out.println(rockList);

        System.out.println("Non rock detected. Need to remove from list!");

        rockList.remove("not rock");
        System.out.println(rockList);
        System.out.println("Perfect!");


        Thread.sleep(1000);

        HashMap<String, String> fossilDirectory = new HashMap<>();

        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Fossil data downloaded");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth)");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }


        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<>();

        supplies.add("Teleporter");
        supplies.add("Stun gun");
        supplies.add("Insta-Heal Capsules");

        Iterator itr = supplies.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        supplies.remove("Stun gun");


        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }

}
