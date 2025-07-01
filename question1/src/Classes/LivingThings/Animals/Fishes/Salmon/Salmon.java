package Classes.LivingThings.Animals.Fishes.Salmon;

import Classes.LivingThings.Colors.IsRed;
import Classes.LivingThings.Animals.Fishes.Fish;

public class Salmon extends Fish implements IsRed {
    @Override
    public boolean isInstance(String objClass) {
        return objClass.equals(Salmon.class.getSimpleName()) ||
                objClass.equals(IsRed.class.getSimpleName()) ||
                super.isInstance(objClass);
    }
}
