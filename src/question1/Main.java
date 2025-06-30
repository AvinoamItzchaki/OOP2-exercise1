package question1;

import Classes.LivingThing;
import Classes.LivingThings.Animals.Birds.Canary.Canary;
import Classes.LivingThings.Animals.Birds.Robin.Robin;
import Classes.LivingThings.Animals.Fishes.Salmon.Salmon;
import Classes.LivingThings.Animals.Fishes.SunFish.SunFish;
import Classes.LivingThings.Plants.Flowers.Daisy.Daisy;
import Classes.LivingThings.Plants.Flowers.Rose.Rose;
import Classes.LivingThings.Plants.Trees.Oak.Oak;
import Classes.LivingThings.Plants.Trees.Pine.Pine;

import java.lang.reflect.Type;
import java.util.*;

public class Main {
    public static List<String> classNames = Arrays.asList("Robin","Canary",
            "SunFish","Salmon","Oak","Pine","Rose","Daisy");
    public static List<String> options = Arrays.asList("LivingThing","Alive","Growable","Plant","HasRoots",
            "HasLeaves","Tree","IsLarge","HasBranches","HasBark","Pine","Oak","IsPretty","HasPetals",
            "Flower","Rose","Daisy","IsYellow","IsRed","IsGreen","Moveable","HasSkin","Animal","HasGills",
            "Fish","CanSwim","SunFish","Salmon","HasWings","HasFeathers","CanFly","Bird","Robin","Canary","CanSing");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Is __ a __? | Does __ __?");
            System.out.print("Input class from options(input -1 to exit): ");
            for (int i = 0; i < classNames.size(); i++) {
                System.out.print(i + ". " + classNames.get(i) + ", ");
            }
            System.out.println();
            int classChoice = scanner.nextInt();
            if (classChoice == -1) {
                break;
            }
            String typeName;
            do {
                System.out.println("Input second part. What you want to check if it is/does(type 'help' for list of options): ");
                for (int i = 0; i < options.size(); i++) {
                    System.out.print(i + ". " + options.get(i) + ", ");
                    if ((i+1) % 10 == 0){
                        System.out.println();
                    }
                }
                System.out.println();
                typeName = scanner.next();
                if (typeName.equals("help")){
                    for (int i = 0; i < options.size(); i++) {
                        System.out.println(i + ". " + options.get(i) + ", ");
                    }
                    System.out.println();
                }
            } while (typeName.equals("help"));
            boolean result;
            switch (classChoice) {
                case 0 -> result = new Robin().isInstance(typeName);
                case 1 -> result = new Canary().isInstance(typeName);
                case 2 -> result = new SunFish().isInstance(typeName);
                case 3 -> result = new Salmon().isInstance(typeName);
                case 4 -> result = new Oak().isInstance(typeName);
                case 5 -> result = new Pine().isInstance(typeName);
                case 6 -> result = new Rose().isInstance(typeName);
                case 7 -> result = new Daisy().isInstance(typeName);
                default -> result = false;
            }
            //Clear Terminal
            for (int i = 1; i <= 2; i++){
                System.out.println();
            }
            System.out.println("Answer: " + result);
        }
    }
}