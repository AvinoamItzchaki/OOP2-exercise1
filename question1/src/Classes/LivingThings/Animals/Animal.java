package Classes.LivingThings.Animals;

import Classes.LivingThing;

public abstract class Animal extends LivingThing implements Moveable,HasSkin {
    @Override
    public boolean isInstance(String objClass) {
        return objClass.equals(Animal.class.getSimpleName()) ||
                objClass.equals(Moveable.class.getSimpleName()) ||
                objClass.equals(HasSkin.class.getSimpleName()) ||
                super.isInstance(objClass);
    }
}
