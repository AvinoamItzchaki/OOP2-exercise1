

import Classes.LivingThings.Animals.Birds.Canary.Canary;
import Classes.LivingThings.Animals.Birds.Robin.Robin;
import Classes.LivingThings.Animals.Fishes.Salmon.Salmon;
import Classes.LivingThings.Animals.Fishes.SunFish.SunFish;
import Classes.LivingThings.Plants.Flowers.Daisy.Daisy;
import Classes.LivingThings.Plants.Flowers.Rose.Rose;
import Classes.LivingThings.Plants.Trees.Oak.Oak;
import Classes.LivingThings.Plants.Trees.Pine.Pine;

import java.util.*;

public class Main1 {
    public static List<String> classNames = Arrays.asList("Robin", "Canary", "SunFish", "Salmon", "Oak", "Pine", "Rose", "Daisy");
    public static List<String> options = Arrays.asList("Alive", "Animal", "Bird", "CanFly", "CanSing", "CanSwim", "Canary", "Daisy", "Fish", "Flower", "Growable",
            "HasBark", "HasBranches", "HasFeathers", "HasGills", "HasLeaves", "HasPetals", "HasRoots", "HasSkin",
            "IsGreen", "IsLarge", "IsPretty", "IsRed", "IsYellow", "LivingThing", "Moveable",
            "Oak", "Pine", "Plant", "Robin", "Rose", "Salmon", "SunFish", "Tree");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Is __ a __? | Does __ __?");
            System.out.println("Input class name from options below (type -1 to exit): ");
            for (int i = 0; i < classNames.size(); i++) {
                System.out.print(i + ". " + classNames.get(i) + " ");
            }
            System.out.println();

            System.out.print("Your choice: ");
            String classChoice = scanner.next();
            if (classChoice.equals("-1")) break;

            System.out.println("Input second part. These are the options:");
            for (int i = 0; i < options.size(); i++) {
                System.out.print(i + ". " + options.get(i)  + " ");
                if ((i + 1) % 10 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
            System.out.print("Your choice: ");
            String typeName = scanner.next();

            boolean result;
            switch (classChoice) {
                case "Robin" -> result = new Robin().isInstance(typeName);
                case "Canary" -> result = new Canary().isInstance(typeName);
                case "SunFish" -> result = new SunFish().isInstance(typeName);
                case "Salmon" -> result = new Salmon().isInstance(typeName);
                case "Oak" -> result = new Oak().isInstance(typeName);
                case "Pine" -> result = new Pine().isInstance(typeName);
                case "Rose" -> result = new Rose().isInstance(typeName);
                case "Daisy" -> result = new Daisy().isInstance(typeName);
                default -> {
                    System.out.println("Invalid class name.");
                    continue;
                }
            }


            System.out.println("\n\nAnswer: " + result);
        }
    }
}