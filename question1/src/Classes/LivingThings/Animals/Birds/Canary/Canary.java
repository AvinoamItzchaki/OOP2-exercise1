package Classes.LivingThings.Animals.Birds.Canary;

import Classes.LivingThings.Animals.Birds.Bird;
import Classes.LivingThings.Colors.IsYellow;

public class Canary extends Bird implements CanSing, IsYellow {
    @Override
    public boolean isInstance(String objClass) {
        return objClass.equals(Canary.class.getSimpleName()) ||
                objClass.equals(CanSing.class.getSimpleName()) ||
                objClass.equals(IsYellow.class.getSimpleName()) ||
                super.isInstance(objClass);
    }
}
