package Classes.LivingThings.Animals.Birds.Robin;

import Classes.LivingThings.Animals.Birds.Bird;
import Classes.LivingThings.Colors.IsRed;

public class Robin extends Bird implements IsRed {
    @Override
    public boolean isInstance(String objClass) {
        return objClass.equals(Robin.class.getSimpleName()) ||
                objClass.equals(IsRed.class.getSimpleName()) ||
                super.isInstance(objClass);
    }
}
