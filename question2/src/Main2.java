
import Classes.ElectricMotor.ElectricMotor;
import Classes.FrequencyDevice.SimpleFrequencyDevice.Radio;
import Classes.FrequencyDevice.SimpleFrequencyDevice.SmarterFrequencyDevice.Television;
import Classes.KitchenDevice.Oven;
import Classes.KitchenDevice.Refrigerator;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // יצירת האובייקטים
        Refrigerator fridge = new Refrigerator();
        Oven oven = new Oven();
        Television tv = new Television();
        Radio radio = new Radio();
        ElectricMotor motor = new ElectricMotor();


        Scanner scanner = new Scanner(System.in);
        int choice;

        // תפריט ראשי
        do {
            System.out.println("\n📱 שלט חכם - בחר פעולה:");
            System.out.println("1) הפעלת כל המערכות בבית");
            System.out.println("2) הפעלת רק המכשירים של המטבח");
            System.out.println("3) הפעלת רק המנוע החשמלי");
            System.out.println("4) הפעלת כל המכשירים מבוססי תדר");
            System.out.println("5) הפעלת רק טלוויזיה");
            System.out.println("6) הפעלת רק רדיו");
            System.out.println("7) הפעלת רק תנור");
            System.out.println("8) הפעלת רק מקרר");
            System.out.println("9) הפעלת טלוויזיה ורדיו ביחד");
            System.out.println("10) הפעלת מקרר ומנוע יחד (קירור ותנועה)");
            System.out.println("-1) יציאה");

            System.out.print("\nהכנס מספר פעולה: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n➡️ הפעלת כל המערכות:");
                    fridge.operate();
                    oven.operate();
                    tv.operate();
                    radio.operate();
                    motor.operate();
                    break;

                case 2:
                    System.out.println("\n➡️ הפעלת מכשירי המטבח:");
                    fridge.operate();
                    oven.operate();
                    break;

                case 3:
                    System.out.println("\n➡️ הפעלת המנוע החשמלי:");
                    motor.operate();
                    break;

                case 4:
                    System.out.println("\n➡️ הפעלת מכשירי תדר (רדיו וטלוויזיה):");
                    tv.operate();
                    radio.operate();
                    break;

                case 5:
                    System.out.println("\n➡️ הפעלת טלוויזיה:");
                    tv.operate();
                    break;

                case 6:
                    System.out.println("\n➡️ הפעלת רדיו:");
                    radio.operate();
                    break;

                case 7:
                    System.out.println("\n➡️ הפעלת תנור:");
                    oven.operate();
                    break;

                case 8:
                    System.out.println("\n➡️ הפעלת מקרר:");
                    fridge.operate();
                    break;

                case 9:
                    System.out.println("\n➡️ הפעלת טלוויזיה ורדיו:");
                    tv.operate();
                    radio.operate();
                    break;

                case 10:
                    System.out.println("\n➡️ הפעלת מקרר ומנוע:");
                    fridge.operate();
                    motor.operate();
                    break;

                case -1:
                    System.out.println("\n📴 יציאה מהמערכת. להתראות!");
                    break;

                default:
                    System.out.println(" מספר לא תקין. נסה שוב.");
            }

        } while (choice != -1);

        scanner.close();
    }
}
