package Classes.LivingThings.Plants.Flowers.Rose;

import Classes.LivingThings.Colors.IsRed;
import Classes.LivingThings.Plants.Flowers.Flower;

public class Rose extends Flower implements IsRed {
    @Override
    public boolean isInstance(String objClass) {
        return objClass.equals(Rose.class.getSimpleName()) ||
                objClass.equals(IsRed.class.getSimpleName()) ||
                super.isInstance(objClass);
    }
}
