package Classes;

public abstract class LivingThing implements Alive,Growable{
    public boolean isInstance(String objClass){
        return LivingThing.class.getSimpleName().equals(objClass) ||
                Alive.class.getSimpleName().equals(objClass) ||
                Growable.class.getSimpleName().equals(objClass);
    }
}
