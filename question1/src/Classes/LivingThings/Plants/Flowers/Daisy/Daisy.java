package Classes.LivingThings.Plants.Flowers.Daisy;

import Classes.LivingThings.Colors.IsYellow;
import Classes.LivingThings.Plants.Flowers.Flower;

public class Daisy extends Flower implements IsYellow {
    @Override
    public boolean isInstance(String objClass) {
        return objClass.equals(Daisy.class.getSimpleName()) ||
                objClass.equals(IsYellow.class.getSimpleName()) ||
                super.isInstance(objClass);
    }
}
