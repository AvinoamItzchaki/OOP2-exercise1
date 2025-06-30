package Classes.LivingThings.Animals.Fishes.SunFish;

import Classes.LivingThings.Colors.IsYellow;
import Classes.LivingThings.Animals.Fishes.Fish;

public class SunFish extends Fish implements IsYellow {
    @Override
    public boolean isInstance(String objClass) {
        return objClass.equals(SunFish.class.getSimpleName()) ||
                objClass.equals(IsYellow.class.getSimpleName()) ||
                super.isInstance(objClass);
    }
}
