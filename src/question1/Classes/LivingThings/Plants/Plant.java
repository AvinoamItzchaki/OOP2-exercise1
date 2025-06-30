package Classes.LivingThings.Plants;

import Classes.LivingThing;

public abstract class Plant extends LivingThing implements HasRoots {
    @Override
    public boolean isInstance(String objClass) {
        return objClass.equals(Plant.class.getSimpleName()) ||
                objClass.equals(HasRoots.class.getSimpleName()) ||
                super.isInstance(objClass);
    }
}
