package Classes.LivingThings.Plants.Trees;

import Classes.LivingThings.Plants.Plant;

public abstract class Tree extends Plant implements HasBark,HasBranches,IsLarge {

    @Override
    public boolean isInstance(String objClass) {
        return objClass.equals(Tree.class.getSimpleName()) ||
                objClass.equals(HasBark.class.getSimpleName()) ||
                objClass.equals(HasBranches.class.getSimpleName()) ||
                objClass.equals(IsLarge.class.getSimpleName()) ||
                super.isInstance(objClass);
    }
}
