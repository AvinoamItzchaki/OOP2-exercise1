package Classes.LivingThings.Animals.Fishes;

import Classes.LivingThings.Animals.Animal;

public abstract class Fish extends Animal implements CanSwim,HasGills {
    @Override
    public boolean isInstance(String objClass) {
        return objClass.equals(Fish.class.getSimpleName()) ||
                objClass.equals(CanSwim.class.getSimpleName()) ||
                objClass.equals(HasGills.class.getSimpleName()) ||
                super.isInstance(objClass);
    }
}
