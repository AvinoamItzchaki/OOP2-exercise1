package Classes.LivingThings.Animals.Birds;

import Classes.LivingThings.Animals.Animal;

public abstract class Bird extends Animal implements HasFeathers,CanFly,HasWings {
    @Override
    public boolean isInstance(String objClass) {
        return objClass.equals(Bird.class.getSimpleName()) ||
                objClass.equals(HasFeathers.class.getSimpleName()) ||
                objClass.equals(CanFly.class.getSimpleName()) ||
                objClass.equals(HasWings.class.getSimpleName()) ||
                super.isInstance(objClass);
    }
}
