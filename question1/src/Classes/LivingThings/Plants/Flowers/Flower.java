package Classes.LivingThings.Plants.Flowers;

import Classes.LivingThings.Plants.HasLeaves;
import Classes.LivingThings.Plants.Plant;

public abstract class Flower extends Plant implements HasLeaves,HasPetals,IsPretty {
    @Override
    public boolean isInstance(String objClass) {
        return objClass.equals(Flower.class.getSimpleName()) ||
                objClass.equals(HasLeaves.class.getSimpleName()) ||
                objClass.equals(HasPetals.class.getSimpleName()) ||
                objClass.equals(IsPretty.class.getSimpleName()) ||
                super.isInstance(objClass);
    }
}
